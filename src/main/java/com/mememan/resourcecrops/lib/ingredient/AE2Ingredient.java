package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class AE2Ingredient {
	public static final String CERTUS_QUARTZ_CRYSTAL = mod("certus_quartz_crystal");
	public static final String CHARGED_CERTUS_QUARTZ_CRYSTAL = mod("charged_certus_quartz_crystal");
	public static final String PURE_CERTUS_QUARTZ_CRYSTAL = mod("purified_certus_quartz_crystal");
	public static final String FLUIX_CRYSTAL = mod("fluix_crystal");
	public static final String PURE_FLUIX_CRYSTAL = mod("purified_fluix_crystal");
	public static final String PURE_NETHER_QUARTZ_CRYSTAL = mod("purified_nether_quartz_crystal");

	public static String mod(String input){
		return (Mods.AE2 + ":" + input);
	}
}
