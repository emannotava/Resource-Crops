package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

public class ResourceCropsIngredient {
	public static final String CRAFTING_SEEDS = Mods.ResourceCrops + ":crafting_seed";
	public static final String DRAGON_EGG_FRAGMENT = Mods.ResourceCrops + ":dragon_egg_fragment";
	public static final String DRAGON_EGG_PIECE = Mods.ResourceCrops + ":dragon_egg_piece";

	public static final String TIER_1_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier1);
	public static final String TIER_2_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier2);
	public static final String TIER_3_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier3);
	public static final String TIER_4_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier4);
	public static final String TIER_5_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier5);
	public static final String TIER_6_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.Tier6);
	public static final String TIER_INFINITY_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TierInfinity);
	public static final String TIER_CREATIVE_ESSENCE = mod("essence_resourcecrops/tier_" + Strings.TierCreative);

	public static final String TIER_1_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier1);
	public static final String TIER_2_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier2);
	public static final String TIER_3_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier3);
	public static final String TIER_4_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier4);
	public static final String TIER_5_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier5);
	public static final String TIER_6_SEEDS = mod("crop_resourcecrops/tier_" + Strings.Tier6);
	public static final String TIER_INFINITY_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TierInfinity);
	public static final String TIER_CREATIVE_SEEDS = mod("crop_resourcecrops/tier_" + Strings.TierCreative);

	public static String mod(String input){
		return (Mods.ResourceCrops + ":" + input);
	}
}
