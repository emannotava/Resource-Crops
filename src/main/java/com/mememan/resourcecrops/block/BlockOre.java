package com.mememan.resourcecrops.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockOre extends Block{
	
	public String ORE_NAME = "Meow";

	public static FabricBlockSettings BLOCK_SETTINGS(float strength){
		return FabricBlockSettings.of(Material.STONE).luminance(3).sounds(BlockSoundGroup.STONE).strength(strength);
	}

	public BlockOre(String name, float strength) {
		super(BLOCK_SETTINGS(strength));
		ORE_NAME = name;
	}

	@Override
	public String getTranslationKey() {
		return "Essence Tier " + ORE_NAME + " Ore";
	} 
	
}
