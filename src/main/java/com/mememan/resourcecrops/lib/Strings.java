package com.mememan.resourcecrops.lib;

import java.nio.file.Path;

import net.fabricmc.loader.api.FabricLoader;

public class Strings {
	public static final String modId = "resourcecrops";
	public static final String version = "1.1.0";
	public static final String[] versionSplit = version.split(".");
	public static final String majorID = versionSplit[0];
	public static final String minorID = versionSplit[1];
	public static final String miscID = versionSplit[2];
	public static final String TIER_1 = "1";
	public static final String TIER_2 = "2";
	public static final String TIER_3 = "3";
	public static final String TIER_4 = "4";
	public static final String TIER_5 = "5";
	public static final String TIER_6 = "6";
	public static final String TIER_INFINITY = "infinity";
	public static final String TIER_CREATIVE = "creative";
	public static final String TIER_ULTIMATE = "ultimate";
	public static final String TIER_UNKNOWN = "unknown";
	public static String NEW_TIERS(String input) {
		if(input == TIER_1){
			return "singlium";
		}else if(input == TIER_2){
			return "doublium";
		}else if(input == TIER_3){
			return "trilium";
		}else if(input == TIER_4){
			return "quadrium";
		}else if(input == TIER_5){
			return "quinterium";
		}else if(input == TIER_6){
			return "silerium";
		}else if(input == TIER_INFINITY){
			return TIER_INFINITY;
		}else if(input == TIER_CREATIVE){
			return TIER_CREATIVE;
		}else if(input == TIER_ULTIMATE){
			return TIER_ULTIMATE;
		}else if(input == TIER_UNKNOWN){
			return TIER_UNKNOWN;
		}else{
			return "meow";
		}
	};
	public static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("crops");
	public static final String CONFIG_PATH_STRING = CONFIG_PATH.toString();
	public static final String defaultAltModName = "Meow";
	public static final int defaultCropAge = 7;
}
