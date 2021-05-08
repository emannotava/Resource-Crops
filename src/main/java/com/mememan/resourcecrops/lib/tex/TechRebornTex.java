package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class TechRebornTex {
	public static final String ADVANCED_ALLOY_BLOCK = ResourceCropsTex.block("techreborn/advanced_alloy_block");
	public static final String HOT_TUNGSTENSTEEL_BLOCK = ResourceCropsTex.block("techreborn/hot_tungstensteel_block");
	public static final String IRIDIUM_REINFORCED_STONE_BLOCK = mod("storage/iridium_reinforced_stone_storage_block");
	public static final String IRIDIUM_REINFORCED_TUNGSTENSTEEL_BLOCK = mod("storage/iridium_reinforced_tungstensteel_storage_block");
	public static final String IRIDIUM_REINFORCED_TUNGSTENSTEEL_BLOCK_CTM = mod("storage/iridium_reinforced_tungstensteel_storage_block_ctm");
	public static final String IRIDUM_REINFORCED_STONE_BLOCK_CTM = mod("storage/iridum_reinforced_stone_storage_block_ctm");
	public static final String PERIDOT_BLOCK = mod("storage/peridot_storage_block");
	public static final String RED_GARNET_BLOCK = mod("storage/red_garnet_storage_block");
	public static final String REFINED_IRON_BLOCK = mod("storage/refined_iron_storage_block");
	public static final String TUNGSTENSTEEL_BLOCK = mod("storage/tungstensteel_storage_block");
	public static final String YELLOW_GARNET_BLOCK = mod("storage/yellow_garnet_storage_block");

	public static String mod(String input){
		return (Mods.TechReborn + ":block/" + input);
	}
}
