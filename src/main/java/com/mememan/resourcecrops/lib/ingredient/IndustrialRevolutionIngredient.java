package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class IndustrialRevolutionIngredient {
	public static final String NIKOLITE_DUST = mod("nikolite_dust");
	public static final String NIKOLITE_INGOT = mod("nikolite_ingot");
	public static final String ENRICHED_NIKOLITE_DUST = mod("enriched_nikolite_dust");
	public static final String ENRICHED_NIKOLITE_INGOT = mod("enriched_nikolite_ingot");

	public static String mod(String input){
		return (Mods.IndustrialRevolution + ":" + input);
	}
}
