package com.mememan.resourcecrops.block;

import java.util.List;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

public class BlockOre extends Block{
	
	public String ORE_NAME = "Meow";

	public static FabricBlockSettings BLOCK_SETTINGS(float strength){
		return FabricBlockSettings.of(Material.STONE).luminance(3).sounds(BlockSoundGroup.STONE).strength(strength);
	}

	public BlockOre(String name, float strength, int hex) {
		super(BLOCK_SETTINGS(strength));
		ORE_NAME = name;
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> hex, this);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> hex, this);
	}

	@Override
	public String getTranslationKey() {
		return "Essence Tier " + ORE_NAME + " Ore";
	}

	@Override
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.0"));
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.1"));
	}
	
}
