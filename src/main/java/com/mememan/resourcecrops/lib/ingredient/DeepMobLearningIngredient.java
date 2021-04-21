package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class DeepMobLearningIngredient {
	public static final String SOOT_COVERED_REDSTONE = mod("soot_redstone");
	public static final String GLITCH_INGOT = mod("glitch_ingot");

	public static String mod(String input){
		return (Mods.DeepMobLearning + ":" + input);
	}
}
