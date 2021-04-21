package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class DeepMobLearningTex {
	public static final String SOOT_COVERED_REDSTONE_BLOCK = ResourceCropsTex.mod("deepmoblearning/redstone_soot_block");
	public static final String GLITCH_INGOT_BLOCK = ResourceCropsTex.mod("deepmoblearning/glitch_block");

	public static String mod(String input){
		return (Mods.DeepMobLearning + ":block/" + input);
	}
}
