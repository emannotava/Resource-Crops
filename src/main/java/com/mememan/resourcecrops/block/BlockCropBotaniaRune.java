package com.mememan.resourcecrops.block;

import java.util.List;

import com.mememan.resourcecrops.item.ItemSeedsBotaniaRune;
import com.mememan.resourcecrops.util.text.Humanify;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
// import net.minecraft.item.Item;
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

public class BlockCropBotaniaRune extends CropBlockBotaniaRune {

	private static ItemSeedsBotaniaRune SEED;
	public String tooltipContent = "Meow";
	public String tooltipContent2 = "Meow";
	private String seedName = "Meow";
	public int maxAge = 8;
	public static FabricBlockSettings BlockSettings(){
		return FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).nonOpaque();
	}
	public BlockCropBotaniaRune(String tier, String mod, String name) {
		super(BlockSettings(), Blocks.FARMLAND);
		tooltipContent = tier;
		tooltipContent2 = mod;
		seedName = name;
	}

	public void setSeedsItem(ItemSeedsBotaniaRune seed){
		SEED = seed;
	}
	
	@Override
	public TranslatableText getName() {
	  return new TranslatableText("resourcecrops.seeds", Humanify.convert(seedName));
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
		if(tooltipContent!="Meow"){
			tooltip.add(new TranslatableText("tooltip.resourcecrops.tier_" + tooltipContent));
		}
		if(tooltipContent2!="Meow"){
			tooltip.add(new TranslatableText("tooltip.resourcecrops.mod." + tooltipContent2));
		}
	}
}
