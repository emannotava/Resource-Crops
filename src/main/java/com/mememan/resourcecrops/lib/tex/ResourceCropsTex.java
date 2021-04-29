package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class ResourceCropsTex {
	public static final String GRADIENT_DARK_GRAY = block("gradient/dark_gray");
	public static final String GRADIENT_DARK_GREEN = block("gradient/dark_green");
	public static final String GRADIENT_DARK_ORANGE = block("gradient/dark_orange");
	public static final String GRADIENT_DARK_RED = block("gradient/dark_red");
	public static final String GRADIENT_DARK_TEAL_HALF_LIGHT_BLUE = block("gradient/dark_teal_half_light_blue");
	public static final String GRADIENT_DOUBLE_WHITE = block("gradient/doubled_white");
	public static final String GRADIENT_BEIGE = block("gradient/beige");
	public static final String GRADIENT_BLACK = block("gradient/black");
	public static final String GRADIENT_BLUE = block("gradient/blue");
	public static final String GRADIENT_BROWN = block("gradient/brown");
	public static final String GRADIENT_CREATIVE = block("gradient/creative");
	public static final String GRADIENT_GRAY = block("gradient/gray");
	public static final String GRADIENT_GRAY_BLUE = block("gradient/gray_blue");
	public static final String GRADIENT_GREEN = block("gradient/green");
	public static final String GRADIENT_HALVED_BEIGE = block("gradient/halved_beige");
	public static final String GRADIENT_HALVED_DARK_GRAY = block("gradient/halved_dark_gray");
	public static final String GRADIENT_HALVED_LIGHT_BLUE = block("gradient/halved_light_blue");
	public static final String GRADIENT_HALVED_PURPLE = block("gradient/halved_purple");
	public static final String GRADIENT_INFINITY = block("gradient/infinity");
	public static final String GRADIENT_LIGHT_BLUE = block("gradient/light_blue");
	public static final String GRADIENT_LIGHT_BLUE_HALF_BLUE = block("gradient/light_blue_half_blue");
	public static final String GRADIENT_LIGHT_BROWN = block("gradient/light_brown");
	public static final String GRADIENT_MISSING = block("gradient/missing");
	public static final String GRADIENT_NO_COLOR = block("gradient/no_color");
	public static final String GRADIENT_ORANGE = block("gradient/orange");
	public static final String GRADIENT_PINK = block("gradient/pink");
	public static final String GRADIENT_PINK_HALF_RED = block("gradient/pink_half_red");
	public static final String GRADIENT_PURPLE = block("gradient/purple");
	public static final String GRADIENT_RED = block("gradient/red");
	public static final String GRADIENT_TEAL = block("gradient/teal");
	public static final String GRADIENT_TEAL_HALF_LIGHT_BLUE = block("gradient/teal_half_light_blue");
	public static final String GRADIENT_WHITE = block("gradient/white");
	public static final String GRADIENT_YELLOW = block("gradient/yellow");
	public static final String LEAVES_NARCISSUS = block("plant_types/narcissus/leaves");
	public static final String LEAVES_AETHER = block("plant_types/narcissus/leaves_aether");
	public static final String LEAVES_MISSING = block("plant_types/narcissus/leaves_missing");
	public static final String LEAVES_COMMON = block("plant_types/common/leaves");
	public static final String STEM_NARCISSUS = block("plant_types/narcissus/stem");
	public static final String STEM_COMMON = block("plant_types/common/stem");
	public static final String STEM_AETHER = block("plant_types/narcissus/stem_aether");
	public static final String STEM_MISSING = block("plant_types/common/stem_missing");
	public static final String TIER_1_BLOCK = block("essence/tier_1_block");
	public static final String TIER_1_DARK_BLOCK = block("essence/tier_1_dark_block");
	public static final String TIER_2_BLOCK = block("essence/tier_2_block");
	public static final String TIER_2_DARK_BLOCK = block("essence/tier_2_dark_block");
	public static final String TIER_3_BLOCK = block("essence/tier_3_block");
	public static final String TIER_3_DARK_BLOCK = block("essence/tier_3_dark_block");
	public static final String TIER_4_BLOCK = block("essence/tier_4_block");
	public static final String TIER_4_DARK_BLOCK = block("essence/tier_4_dark_block");
	public static final String TIER_5_BLOCK = block("essence/tier_5_block");
	public static final String TIER_5_DARK_BLOCK = block("essence/tier_5_dark_block");
	public static final String TIER_6_BLOCK = block("essence/tier_6_block");
	public static final String TIER_6_DARK_BLOCK = block("essence/tier_6_dark_block");
	public static final String TIER_CREATIVE_BLOCK = block("essence/tier_creative_block");
	public static final String TIER_CREATIVE_DARK_BLOCK = block("essence/tier_creative_dark_block");
	public static final String TIER_INFINITY_BLOCK = block("essence/tier_infinity_block");
	public static final String TIER_INFINITY_DARK_BLOCK = block("essence/tier_infinity_dark_block");
	public static final String ULTIMATE_BLOCK = block("debug_block");
	public static final String BLOCK_404 = block("404");
	public static final String ORE_TIER_1 = block("ore/tier_1");
	public static final String ORE_TIER_2 = block("ore/tier_2");
	public static final String ORE_TIER_3 = block("ore/tier_3");
	public static final String ORE_TIER_4 = block("ore/tier_4");
	public static final String ORE_TIER_5 = block("ore/tier_5");
	public static final String ORE_TIER_6 = block("ore/tier_6");
	public static final String COMMON_METAL_SIDE = block("common/metal/side");
	public static final String COMMON_METAL_TOP = block("common/metal/top");
	public static final String COMMON_METAL_BOTTOM = block("common/metal/bottom");
	public static final String SPARKLES_TIER_1 = item("sparkles/tier_1");
	public static final String SPARKLES_TIER_2 = item("sparkles/tier_2");
	public static final String SPARKLES_TIER_3 = item("sparkles/tier_3");
	public static final String SPARKLES_TIER_4 = item("sparkles/tier_4");
	public static final String SPARKLES_TIER_5 = item("sparkles/tier_5");
	public static final String SPARKLES_TIER_6 = item("sparkles/tier_6");
	public static final String METALLIC_ESSENCE_INGOT = item("ingot_metallic_essence");
	
	

	public static String block(String input){
		return Mods.ResourceCrops + ":block/" + input;
	}
	public static String item(String input){
		return Mods.ResourceCrops + ":item/" + input;
	}
}
