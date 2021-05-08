package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

public class ResourceCropsIngredient {
	public static final String DEBUG_BLOCK = mod("debug_block");
	public static final String CRAFTING_SEEDS = mod("crafting_seed");
	public static final String DRAGON_EGG_FRAGMENT = mod("dragon_egg_fragment");
	public static final String DRAGON_EGG_PIECE = mod("dragon_egg_piece");
	
	public static final String JEB_WOOL = mod("jeb_wool");

	public static final String ESSENCE_TIER_1_BLOCK = mod("essence_tier_" + Strings.TIER_1 + "_block");
	public static final String ESSENCE_TIER_2_BLOCK = mod("essence_tier_" + Strings.TIER_2 + "_block");
	public static final String ESSENCE_TIER_3_BLOCK = mod("essence_tier_" + Strings.TIER_3 + "_block");
	public static final String ESSENCE_TIER_4_BLOCK = mod("essence_tier_" + Strings.TIER_4 + "_block");
	public static final String ESSENCE_TIER_5_BLOCK = mod("essence_tier_" + Strings.TIER_5 + "_block");
	public static final String ESSENCE_TIER_6_BLOCK = mod("essence_tier_" + Strings.TIER_6 + "_block");
	public static final String ESSENCE_TIER_INFINITY_BLOCK = mod("essence_tier_" + Strings.TIER_INFINITY + "_block");
	public static final String ESSENCE_TIER_CREATIVE_BLOCK = mod("essence_tier_" + Strings.TIER_CREATIVE + "_block");

	public static final String TIER_1_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_1);
	public static final String TIER_2_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_2);
	public static final String TIER_3_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_3);
	public static final String TIER_4_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_4);
	public static final String TIER_5_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_5);
	public static final String TIER_6_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_6);
	public static final String TIER_INFINITY_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_INFINITY);
	public static final String TIER_CREATIVE_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TIER_CREATIVE);

	public static final String TIER_1_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_1);
	public static final String TIER_2_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_2);
	public static final String TIER_3_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_3);
	public static final String TIER_4_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_4);
	public static final String TIER_5_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_5);
	public static final String TIER_6_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_6);
	public static final String TIER_INFINITY_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_INFINITY);
	public static final String TIER_CREATIVE_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TIER_CREATIVE);

	public static String mod(String input){
		return (Mods.ResourceCrops + ":" + input);
	}
}
