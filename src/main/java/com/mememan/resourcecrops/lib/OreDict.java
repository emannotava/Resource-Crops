package com.mememan.resourcecrops.lib;

public class OreDict {
	public static final String ingotCopper = common("copper_ingots");
	public static final String ingotBronze = common("bronze_ingots");
	public static final String ingotBrass = common("brass_ingots");
	public static final String ingotSilver = common("silver_ingots");
	public static final String ingotElectrum = common("electrum_ingots");
	public static final String ingotLead = common("lead_ingots");
	public static final String ingotSteel = common("steel_ingots");
	public static final String ingotIron = common("iron_ingots", true);
	public static final String ingotGold = common("gold_ingots", true);
	public static final String ingotNetherite = common("netherite_ingots", true);
	public static final String gemDiamond = common("diamond_gems", true);
	public static final String gemEmerald = common("emerald_gems", true);
	public static final String dustRedstone = common("redstone_dust", true);
	public static final String dustGlowstone = common("glowstone_dust", true);
	
	public static String common(String input){
		return Mods.COMMON + ":" + input;
	}
	public static String common(String input, Boolean vanillaTag){
		if(vanillaTag==true){
			return Mods.Vanilla + ":" + input;
		}else{
			return common(input);
		}
	}
}
