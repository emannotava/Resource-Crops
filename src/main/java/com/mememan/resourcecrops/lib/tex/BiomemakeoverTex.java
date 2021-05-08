package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class BiomemakeoverTex {
	public static final String ANCIENT_OAK_LOG = mod("ancient_oak_log");
	public static final String ANCIENT_OAK_LOG_TOP = mod("ancient_oak_log_top");
	public static final String BLIGHTED_BALSA_LOG = mod("blighted_balsa_log");
	public static final String BLIGHTED_BALSA_LOG_TOP = mod("blighted_balsa_log_top");
	public static final String BLIGHTED_COBBLESTONE = mod("blighted_cobblestone");
	public static final String CLADDED_STONE = mod("cladded_stone");
	public static final String DEEP_MYCELIUM_TOP = mod("deep_mycelium_top");
	public static final String GLOWSHROOM_STEM = mod("glowshroom_stem");
	public static final String ILLUNITE_BLOCK = mod("illunite_block");
	public static final String MESMERITE = mod("mesmerite");
	public static final String ORANGE_GLOWSHROOM_BLOCK = mod("orange_glowshroom_block");
	public static final String PURPLE_GLOWSHROOM_BLOCK = mod("purple_glowshroom_block");
	public static final String SWAMP_CYPRESS_LOG = mod("swamp_cypress_log");
	public static final String SWAMP_CYPRESS_LOG_TOP = mod("swamp_cypress_log_top");
	public static final String WILLOW_LOG = mod("willow_log");
	public static final String WILLOW_LOG_TOP = mod("willow_log_top");

	public static String mod(String input){
		return (Mods.Biomemakeover + ":block/" + input);
	}
}
