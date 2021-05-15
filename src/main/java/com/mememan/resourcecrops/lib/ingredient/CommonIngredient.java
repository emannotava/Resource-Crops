package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;

public class CommonIngredient {
	public static final String ALUMINIUM = mod("aluminium_ingots");
	public static final String ALUMINIUM_INGOT = ALUMINIUM;
	public static final String AMETHYST = mod("amethysts");
	public static final String BRASS = mod("brass_ingots");
	public static final String BRASS_INGOT = BRASS;
	public static final String BRONZE = mod("bronze_ingots");
	public static final String BRONZE_INGOT = BRONZE;
	public static final String CHROME = mod("chrome_ingots");
	public static final String CHROME_INGOT = CHROME;
	public static final String COAL_COKE = mod("coal_cokes");
	public static final String COBALT = mod("cobalt_ingots");
	public static final String COBALT_INGOT = COBALT;
	public static final String COPPER = mod("copper_ingots");
	public static final String COPPER_INGOT = COPPER;
	public static final String ELECTRUM = mod("electrum_ingots");
	public static final String ELECTRUM_INGOT = ELECTRUM;
	public static final String INVAR = mod("invar_ingots");
	public static final String INVAR_INGOT = INVAR;
	public static final String IRIDIUM = mod("iridium_ingots");
	public static final String IRIDIUM_INGOT = IRIDIUM;
	public static final String LEAD = mod("lead_ingots");
	public static final String LEAD_INGOT = LEAD;
	public static final String NICKEL = mod("nickel_ingots");
	public static final String NICKEL_INGOT = NICKEL;
	public static final String OSMIUM = mod("osmium_ingots");
	public static final String OSMIUM_INGOT = OSMIUM;
	public static final String PALLADIUM = mod("palladium_ingots");
	public static final String PALLADIUM_INGOT = PALLADIUM;
	public static final String PERIDOT = mod("peridots");
	public static final String PERIDOT_GEM = PERIDOT;
	public static final String PLATINUM = mod("platinum_ingots");
	public static final String PLATINUM_INGOT = PLATINUM;
	public static final String PLUTONIUM = mod("plutonium_ingots");
	public static final String PLUTONIUM_INGOT = PLUTONIUM;
	public static final String RUBY = mod("rubies");
	public static final String RUBY_GEM = RUBY;
	public static final String SAPPHIRE = mod("sapphires");
	public static final String SAPPHIRE_GEM = SAPPHIRE;
	public static final String SILVER = mod("silver_ingots");
	public static final String SILVER_INGOT = SILVER;
	public static final String STEEL = mod("steel_ingots");
	public static final String STEEL_INGOT = STEEL;
	public static final String THORIUM = mod("thorium_ingots");
	public static final String THORIUM_INGOT = THORIUM;
	public static final String TIN = mod("tin_ingots");
	public static final String TIN_INGOT = TIN;
	public static final String TITANIUM = mod("titanium_ingots");
	public static final String TITANIUM_INGOT = TITANIUM;
	public static final String TOPAZ = mod("topazes");
	public static final String TOPAZ_GEM = TOPAZ;
	public static final String TUNGSTEN = mod("tungsten_ingots");
	public static final String TUNGSTEN_INGOT = TUNGSTEN;
	public static final String URANIUM = mod("uranium_ingots");
	public static final String URANIUM_INGOT = URANIUM;
	public static final String ZINC = mod("zinc_ingots");
	public static final String ZINC_INGOT = ZINC;


	public static String mod(String input){
		return (Mods.COMMON + ":" + input);
	}

	public static String convertTagToCommonMetalItem(String input){
		String[] split = input.split(":");
		String localInput = split[1];
		String finalString = Mods.ResourceCrops + ":common_metal/" + localInput;
		Main.logDebugMessage("\"" + input + "\" was converted to " + "\"" + finalString + "\"");
		return finalString;
	}
	public static String convertCommonMetalItemToTag(String input){
		String[] split = input.split(":");
		String[] split2 = split[1].split("/");
		String finalString = Mods.COMMON + ":" + split2[1] + "s";
		Main.logDebugMessage("\"" + input + "\" was converted to " + "\"" + finalString + "\"");
		return finalString;
	}
	public static String convertTagToCommonJewelItem(String input){
		String[] split = input.split(":");
		String localInput = split[1];
		String finalString = Mods.ResourceCrops + ":common_jewel/" + localInput;
		Main.logDebugMessage("\"" + input + "\" was converted to " + "\"" + finalString + "\"");
		return finalString;
	}
	public static String convertCommonJewelItemToTag(String input){
		String[] split = input.split(":");
		String[] split2 = split[1].split("/");
		String finalString = Mods.COMMON + ":" + split2[1] + "s";
		Main.logDebugMessage("\"" + input + "\" was converted to " + "\"" + finalString + "\"");
		return finalString;
	}
}
