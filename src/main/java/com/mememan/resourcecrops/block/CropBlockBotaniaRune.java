package com.mememan.resourcecrops.block;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class CropBlockBotaniaRune extends PlantBlock implements Fertilizable {
   private static final VoxelShape[] AGE_TO_SHAPE;
   public static final IntProperty AGE;
   public static int maxAge = 79;

   public static Block requiredBlock = Blocks.FARMLAND;

   public CropBlockBotaniaRune(AbstractBlock.Settings settings, Block farmland) {
      super(settings);
      this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(this.getAgeProperty(), 0));
      requiredBlock = farmland;
   }

   public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
      return AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
   }

   public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
      return floor.isOf(requiredBlock);
   }

   public IntProperty getAgeProperty() {
      return AGE;
   }

   public int getMaxAge() {
      return maxAge;
   }

   protected int getAge(BlockState state) {
      return (Integer)state.get(this.getAgeProperty());
   }

   public BlockState withAge(int age) {
      return (BlockState)this.getDefaultState().with(this.getAgeProperty(), age);
   }

   public boolean isMature(BlockState state) {
      return (Integer)state.get(this.getAgeProperty()) >= maxAge;
   }

   public boolean hasRandomTicks(BlockState state) {
      return !this.isMature(state);
   }

   public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
      if (world.getBaseLightLevel(pos, 0) >= 9) {
         int i = this.getAge(state);
         if (i < maxAge) {
            float f = getAvailableMoisture(this, world, pos);
            if (random.nextInt((int)(25.0F / f) + 1) == 0) {
               world.setBlockState(pos, this.withAge(i + 1), 2);
            }
         }
      }

   }

   public void applyGrowth(World world, BlockPos pos, BlockState state) {
      int i = this.getAge(state) + this.getGrowthAmount(world);
      int j = maxAge;
      if (i > j) {
         i = j;
      }

      world.setBlockState(pos, this.withAge(i), 2);
   }

   protected int getGrowthAmount(World world) {
      return MathHelper.nextInt(world.random, 2, 5);
   }

   protected static float getAvailableMoisture(Block block, BlockView world, BlockPos pos) {
      float f = 1.0F;
      BlockPos blockPos = pos.down();

      for(int i = -1; i <= 1; ++i) {
         for(int j = -1; j <= 1; ++j) {
            float g = 0.0F;
            BlockState blockState = world.getBlockState(blockPos.add(i, 0, j));
            if (blockState.isOf(requiredBlock)) {
               g = 3.0F;
            }

            if (i != 0 || j != 0) {
               g /= 4.0F;
            }

            f += g;
         }
      }

      BlockPos blockPos2 = pos.north();
      BlockPos blockPos3 = pos.south();
      BlockPos blockPos4 = pos.west();
      BlockPos blockPos5 = pos.east();
      boolean bl = block == world.getBlockState(blockPos4).getBlock() || block == world.getBlockState(blockPos5).getBlock();
      boolean bl2 = block == world.getBlockState(blockPos2).getBlock() || block == world.getBlockState(blockPos3).getBlock();
      if (bl && bl2) {
         f /= 2.0F;
      } else {
         boolean bl3 = block == world.getBlockState(blockPos4.north()).getBlock() || block == world.getBlockState(blockPos5.north()).getBlock() || block == world.getBlockState(blockPos5.south()).getBlock() || block == world.getBlockState(blockPos4.south()).getBlock();
         if (bl3) {
            f /= 2.0F;
         }
      }

      return f;
   }

   public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
      return (world.getBaseLightLevel(pos, 0) >= (maxAge + 1) || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
   }

   public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
      if (entity instanceof RavagerEntity && world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
         world.breakBlock(pos, true, entity);
      }

      super.onEntityCollision(state, world, pos, entity);
   }

   @Environment(EnvType.CLIENT)
   protected ItemConvertible getSeedsItem() {
      return Items.WHEAT_SEEDS;
   }

   @Environment(EnvType.CLIENT)
   public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
      return new ItemStack(this.getSeedsItem());
   }

   public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
      return !this.isMature(state);
   }

   public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
      return true;
   }

   public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
      this.applyGrowth(world, pos, state);
   }

   protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
      builder.add(AGE);
   }

   public static double calculateBoxHeight(int multiplier){
      return ((16.0D / (maxAge+1)) * multiplier);
   }

   static {
      AGE = IntProperty.of("age", 0, maxAge);
      AGE_TO_SHAPE = new VoxelShape[]{
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(1), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(2), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(3), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(4), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(5), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(6), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(7), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(8), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(9), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(10), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(11), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(12), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(13), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(14), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(15), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(16), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(17), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(18), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(19), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(20), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(21), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(22), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(23), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(24), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(25), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(26), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(27), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(28), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(29), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(30), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(31), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(32), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(33), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(34), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(35), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(36), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(37), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(38), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(39), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(40), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(41), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(42), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(43), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(44), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(45), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(46), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(47), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(48), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(49), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(50), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(51), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(52), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(53), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(54), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(55), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(56), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(57), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(58), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(59), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(60), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(61), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(62), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(63), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(64), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(65), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(66), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(67), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(68), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(69), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(70), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(71), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(72), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(73), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(74), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(75), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(76), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(77), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(78), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(79), 16.0D),
         Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, calculateBoxHeight(80), 16.0D)
      };
   }
}
