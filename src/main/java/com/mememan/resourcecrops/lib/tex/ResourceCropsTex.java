package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class ResourceCropsTex {
	public static final String GRADIENT_DARK_GRAY = mod("gradient/dark_gray");
	public static final String GRADIENT_DARK_GREEN = mod("gradient/dark_green");
	public static final String GRADIENT_DARK_ORANGE = mod("gradient/dark_orange");
	public static final String GRADIENT_DARK_RED = mod("gradient/dark_red");
	public static final String GRADIENT_DARK_TEAL_HALF_LIGHT_BLUE = mod("gradient/dark_teal_half_light_blue");
	public static final String GRADIENT_DOUBLE_WHITE = mod("gradient/doubled_white");
	public static final String GRADIENT_BEIGE = mod("gradient/beige");
	public static final String GRADIENT_BLACK = mod("gradient/black");
	public static final String GRADIENT_BLUE = mod("gradient/blue");
	public static final String GRADIENT_BROWN = mod("gradient/brown");
	public static final String GRADIENT_CREATIVE = mod("gradient/creative");
	public static final String GRADIENT_GRAY = mod("gradient/gray");
	public static final String GRADIENT_GRAY_BLUE = mod("gradient/gray_blue");
	public static final String GRADIENT_GREEN = mod("gradient/green");
	public static final String GRADIENT_HALVED_BEIGE = mod("gradient/halved_beige");
	public static final String GRADIENT_HALVED_DARK_GRAY = mod("gradient/halved_dark_gray");
	public static final String GRADIENT_HALVED_LIGHT_BLUE = mod("gradient/halved_light_blue");
	public static final String GRADIENT_HALVED_PURPLE = mod("gradient/halved_purple");
	public static final String GRADIENT_INFINITY = mod("gradient/infinity");
	public static final String GRADIENT_LIGHT_BLUE = mod("gradient/light_blue");
	public static final String GRADIENT_LIGHT_BLUE_HALF_BLUE = mod("gradient/light_blue_half_blue");
	public static final String GRADIENT_LIGHT_BROWN = mod("gradient/light_brown");
	public static final String GRADIENT_MISSING = mod("gradient/missing");
	public static final String GRADIENT_NO_COLOR = mod("gradient/no_color");
	public static final String GRADIENT_ORANGE = mod("gradient/orange");
	public static final String GRADIENT_PINK = mod("gradient/pink");
	public static final String GRADIENT_PINK_HALF_RED = mod("gradient/pink_half_red");
	public static final String GRADIENT_PURPLE = mod("gradient/purple");
	public static final String GRADIENT_RED = mod("gradient/red");
	public static final String GRADIENT_TEAL = mod("gradient/teal");
	public static final String GRADIENT_TEAL_HALF_LIGHT_BLUE = mod("gradient/teal_half_light_blue");
	public static final String GRADIENT_WHITE = mod("gradient/white");
	public static final String GRADIENT_YELLOW = mod("gradient/yellow");
	public static final String LEAVES_NARCISSUS = mod("plant_types/narcissus/leaves");
	public static final String LEAVES_AETHER = mod("plant_types/narcissus/leaves_aether");
	public static final String LEAVES_MISSING = mod("plant_types/narcissus/leaves_missing");
	public static final String LEAVES_COMMON = mod("plant_types/common/leaves");
	public static final String STEM_NARCISSUS = mod("plant_types/narcissus/stem");
	public static final String STEM_COMMON = mod("plant_types/common/stem");
	public static final String STEM_AETHER = mod("plant_types/narcissus/stem_aether");
	public static final String STEM_MISSING = mod("plant_types/common/stem_missing");
	public static final String TIER_1_BLOCK = mod("essence/tier_1_block");
	public static final String TIER_1_DARK_BLOCK = mod("essence/tier_1_dark_block");
	public static final String TIER_2_BLOCK = mod("essence/tier_2_block");
	public static final String TIER_2_DARK_BLOCK = mod("essence/tier_2_dark_block");
	public static final String TIER_3_BLOCK = mod("essence/tier_3_block");
	public static final String TIER_3_DARK_BLOCK = mod("essence/tier_3_dark_block");
	public static final String TIER_4_BLOCK = mod("essence/tier_4_block");
	public static final String TIER_4_DARK_BLOCK = mod("essence/tier_4_dark_block");
	public static final String TIER_5_BLOCK = mod("essence/tier_5_block");
	public static final String TIER_5_DARK_BLOCK = mod("essence/tier_5_dark_block");
	public static final String TIER_6_BLOCK = mod("essence/tier_6_block");
	public static final String TIER_6_DARK_BLOCK = mod("essence/tier_6_dark_block");
	public static final String TIER_CREATIVE_BLOCK = mod("essence/tier_creative_block");
	public static final String TIER_CREATIVE_DARK_BLOCK = mod("essence/tier_creative_dark_block");
	public static final String TIER_INFINITY_BLOCK = mod("essence/tier_infinity_block");
	public static final String TIER_INFINITY_DARK_BLOCK = mod("essence/tier_infinity_dark_block");
	public static final String ULTIMATE_BLOCK = mod("debug_block");
	public static final String BLOCK_404 = mod("404");
	
	

	public static String mod(String input){
		return Mods.ResourceCrops + ":block/" + input;
	}
}
