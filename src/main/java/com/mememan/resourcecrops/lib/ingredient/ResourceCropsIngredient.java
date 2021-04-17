package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

public class ResourceCropsIngredient {
	public static final String CRAFTING_SEEDS = Mods.ResourceCrops + ":crafting_seed";

	public static final String TIER_1_ESSENCE = mod("essence", Strings.Tier1);
	public static final String TIER_2_ESSENCE = mod("essence", Strings.Tier2);
	public static final String TIER_3_ESSENCE = mod("essence", Strings.Tier3);
	public static final String TIER_4_ESSENCE = mod("essence", Strings.Tier4);
	public static final String TIER_5_ESSENCE = mod("essence", Strings.Tier5);
	public static final String TIER_6_ESSENCE = mod("essence", Strings.Tier6);
	public static final String TIER_INFINITY_ESSENCE = mod("essence", Strings.TierInfinity);
	public static final String TIER_CREATIVE_ESSENCE = mod("essence", Strings.TierCreative);

	public static final String TIER_1_SEEDS = mod("crop", Strings.Tier1);
	public static final String TIER_2_SEEDS = mod("crop", Strings.Tier2);
	public static final String TIER_3_SEEDS = mod("crop", Strings.Tier3);
	public static final String TIER_4_SEEDS = mod("crop", Strings.Tier4);
	public static final String TIER_5_SEEDS = mod("crop", Strings.Tier5);
	public static final String TIER_6_SEEDS = mod("crop", Strings.Tier6);
	public static final String TIER_INFINITY_SEEDS = mod("crop", Strings.TierInfinity);
	public static final String TIER_CREATIVE_SEEDS = mod("crop", Strings.TierCreative);

	public static String mod(String input, String tier){
		return (Mods.ResourceCrops + ":" + input + "_" + Mods.ResourceCrops + "/" + tier);
	}
}
