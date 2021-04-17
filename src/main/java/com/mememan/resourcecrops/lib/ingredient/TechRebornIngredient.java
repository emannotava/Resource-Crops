package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class TechRebornIngredient {
	public static final String ADVANCED_ALLOY_INGOT = mod("advanced_alloy_ingot");
	public static final String ALUMINUM_INGOT = mod("aluminum_ingot");
	public static final String BRASS_INGOT = mod("brass_ingot");
	public static final String BRONZE_INGOT = mod("bronze_ingot");
	public static final String CHROME_INGOT = mod("chrome_ingot");
	public static final String COPPER_INGOT = mod("copper_ingot");
	public static final String ELECTRUM_INGOT = mod("electrum_ingot");
	public static final String HOT_TUNGSTENSTEEL_INGOT = mod("hot_tungstensteel_ingot");
	public static final String INVAR_INGOT = mod("invar_ingot");
	public static final String IRIDIUM_ALLOY_INGOT = mod("iridium_alloy_ingot");
	public static final String IRIDIUM_INGOT = mod("iridium_ingot");
	public static final String LEAD_INGOT = mod("lead_ingot");
	public static final String MIXED_METAL_INGOT = mod("mixed_metal_ingot");
	public static final String NICKEL_INGOT = mod("nickel_ingot");
	public static final String PLATINUM_INGOT = mod("platinum_ingot");
	public static final String REFINED_IRON_INGOT = mod("refined_iron_ingot");
	public static final String SILVER_INGOT = mod("silver_ingot");
	public static final String STEEL_INGOT = mod("steel_ingot");
	public static final String TIN_INGOT = mod("tin_ingot");
	public static final String TITANIUM_INGOT = mod("titanium_ingot");
	public static final String TUNGSTEN_INGOT = mod("tungsten_ingot");
	public static final String TUNGSTENSTEEL_INGOT = mod("tungstensteel_ingot");
	public static final String ZINC_INGOT = mod("zinc_ingot");
	public static final String RUBY_GEM = mod("ruby_gem");
	public static final String SAPPHIRE_GEM = mod("sapphire_gem");
	public static final String PERIDOT_GEM = mod("peridot_gem");
	public static final String RED_GARNET_GEM = mod("red_garnet_gem");
	public static final String YELLOW_GARNET_GEM = mod("yellow_garnet_gem");

	public static String mod(String input){
		return (Mods.TechReborn + ":" + input);
	}
}
