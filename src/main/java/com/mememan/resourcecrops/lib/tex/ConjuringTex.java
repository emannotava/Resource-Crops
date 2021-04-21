package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class ConjuringTex {
	public static final String SOUL_ROD_BLOCK = ResourceCropsTex.mod("conjuring/soul_rod_block");
	public static final String CONJURATION_ESSENCE_BLOCK = ResourceCropsTex.mod("conjuring/conjuration_essence_block");
	public static final String CONJURATION_ESSENCE_LESSER_BLOCK = ResourceCropsTex.mod("conjuring/conjuration_essence_lesser_block");
	public static final String SOUL_ALLOY_BLOCK = ResourceCropsTex.mod("conjuring/soul_alloy_block");
	public static final String SOUL_BRICK_BLOCK = ResourceCropsTex.mod("conjuring/soul_brick_block");

	public static String mod(String input){
		return (Mods.Conjuring + ":block/" + input);
	}
}
