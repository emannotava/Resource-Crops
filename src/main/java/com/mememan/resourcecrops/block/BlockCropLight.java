package com.mememan.resourcecrops.block;

import java.util.List;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
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

public class BlockCropLight extends CropBlock {

	public static Item SEED;
	public String tooltipContent = "Meow";
	public String tooltipContent2 = "Meow";
	public static FabricBlockSettings BlockSettings(int lightLevel){
		return FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).nonOpaque().luminance(lightLevel);
	}

	public BlockCropLight(int lightLevel, String tier) {
		super(BlockSettings(lightLevel));
		tooltipContent = tier;
	}

	public BlockCropLight(int lightLevel, String tier, String mod) {
		super(BlockSettings(lightLevel));
		tooltipContent = tier;
		tooltipContent2 = mod;
	}

	public static void setSeedsItem(Item seed){
		SEED = seed;
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
	protected ItemConvertible getSeedsItem() {
		return SEED;
	}

	@Override
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
		tooltip.add(new TranslatableText("tooltip.resourcecrops.tier_" + tooltipContent));
	}


}
