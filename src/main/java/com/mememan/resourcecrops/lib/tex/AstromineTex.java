package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class AstromineTex {
	public static final String ASHY_BLOCK = mod("ashy_block");
	public static final String ASTERITE_BLOCK = mod("asterite_block");
	public static final String BRONZE_BLOCK = mod("bronze_block");
	public static final String COPPER_BLOCK = mod("copper_block");
	public static final String COPPER_ORE = mod("copper_ore");
	public static final String ELECTRUM_BLOCK = mod("electrum_block");
	public static final String FOOLS_GOLD_BLOCK = mod("fools_gold_block");
	public static final String GALAXIUM_BLOCK = mod("galaxium_block");
	public static final String ITEM_DISPLAYER_BOTTOM = mod("item_displayer_bottom");
	public static final String ITEM_DISPLAYER_SIDE = mod("item_displayer_side");
	public static final String ITEM_DISPLAYER_TOP = mod("item_displayer_top");
	public static final String LEAD_BLOCK = mod("lead_block");
	public static final String LEAD_ORE = mod("lead_ore");
	public static final String LUNUM_BLOCK = mod("lunum_block");
	public static final String METEOR_METITE_ORE = mod("meteor_metite_ore");
	public static final String METEOR_STONE = mod("meteor_stone");
	public static final String METEORIC_STEEL_BLOCK = mod("meteoric_steel_block");
	public static final String METITE_BLOCK = mod("metite_block");
	public static final String ROSE_GOLD_BLOCK = mod("rose_gold_block");
	public static final String SILVER_BLOCK = mod("silver_block");
	public static final String SILVER_ORE = mod("silver_ore");
	public static final String SOOTEN_BLOCK = mod("sooten_block");
	public static final String STEEL_BLOCK = mod("steel_block");
	public static final String STELLUM_BLOCK = mod("stellum_block");
	public static final String STELLUM_ORE = mod("stellum_ore");
	public static final String STERLING_SILVER_BLOCK = mod("sterling_silver_block");
	public static final String TIN_BLOCK = mod("tin_block");
	public static final String TIN_ORE = mod("tin_ore");
	public static final String UNIVITE_BLOCK = mod("univite_block");


	public static String mod(String input){
		return (Mods.Astromine + ":block/" + input);
	}
}
