package com.mememan.resourcecrops.block;

import java.util.List;

import com.mememan.resourcecrops.item.ItemSeeds;
import com.mememan.resourcecrops.util.text.Humanify;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BlockCrop extends net.minecraft.block.CropBlock {

	public ItemSeeds SEED;
	public String TOOLTIP_TIER = "Meow";
	public String TOOLTIP_MOD = "Meow";
	public String SEED_NAME = "Meow";
	public int maxAge = 8;
	public static Block REQUIRED_SOIL = Blocks.FARMLAND;
	public static FabricBlockSettings BLOCK_SETTINGS(){
		return FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).nonOpaque();
	}
	public BlockCrop(String tier, String mod, String name){
		super(BLOCK_SETTINGS());
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
	}
	public BlockCrop(String tier, String mod, String name, Block soil){
		super(BLOCK_SETTINGS());
		setSoilBlock(soil);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
	}

	public String setName(String input){
		SEED_NAME = input;
		return input;
	}

	public String setTier(String input){
		TOOLTIP_TIER = input;
		return input;
	}

	public String setMod(String input){
		TOOLTIP_MOD = input;
		return input;
	}


	public Block setSoilBlock(Block soil){
		REQUIRED_SOIL = soil;
		return REQUIRED_SOIL;
	}
	public Block setSoil(Block soil){
		REQUIRED_SOIL = soil;
		return REQUIRED_SOIL;
	}

	// @Override
	public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
	   return floor.isOf(setSoilBlock(REQUIRED_SOIL));
	}
	
	public void setSeedsItem(ItemSeeds seed){
		SEED = seed;
	}
	
	// @Override
	// public TranslatableText getName() {
	//   return new TranslatableText("resourcecrops.seeds", Humanify.convert(SEED_NAME));
	// }
	@Override
	public String getTranslationKey() {
		return Humanify.convert(SEED_NAME) + " Seeds";
	} 

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (getAge(state) == getMaxAge()) {
			world.setBlockState(pos, this.withAge(0), 2);
			dropStacks(state, world, pos);
			return ActionResult.CONSUME;
		}
		return ActionResult.PASS;
	}
	@Override
	public void onLandedUpon(World world, BlockPos pos, Entity entity, float distance) {
		super.onLandedUpon(world, pos, entity, distance);
	}

	@Override
	public ItemConvertible getSeedsItem() {
		return SEED;
	}


	@Override
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
		if(TOOLTIP_TIER!="Meow"){
			tooltip.add(new TranslatableText("tooltip.tier_" + TOOLTIP_TIER));
		}
		if(TOOLTIP_MOD!="Meow"){
			tooltip.add(new TranslatableText("tooltip.mod." + TOOLTIP_MOD));
		}
	}
}
