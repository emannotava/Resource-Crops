package com.mememan.resourcecrops.block;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

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
	
}
