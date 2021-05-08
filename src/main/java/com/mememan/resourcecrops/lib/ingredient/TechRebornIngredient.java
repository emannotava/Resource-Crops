package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class TechRebornIngredient {
	public static final String ADVANCED_ALLOY_INGOT = mod("advanced_alloy_ingot");
	public static final String HOT_TUNGSTENSTEEL_INGOT = mod("hot_tungstensteel_ingot");
	public static final String REFINED_IRON_INGOT = mod("refined_iron_ingot");
	public static final String TUNGSTENSTEEL_INGOT = mod("tungstensteel_ingot");
	public static final String PERIDOT_GEM = mod("peridot_gem");
	public static final String RED_GARNET_GEM = mod("red_garnet_gem");
	public static final String YELLOW_GARNET_GEM = mod("yellow_garnet_gem");

	public static String mod(String input){
		return (Mods.TechReborn + ":" + input);
	}
}
