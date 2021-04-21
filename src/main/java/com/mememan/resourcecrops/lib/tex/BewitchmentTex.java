package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class BewitchmentTex {
	public static final String ALCHEMIST_WOOL = mod("alchemist_wool");
	public static final String BESMIRCHED_WOOL = mod("besmirched_wool");
	public static final String BLESSED_STONE = mod("blessed_stone");
	public static final String LOG_CYPRESS = mod("cypress_log");
	public static final String LOG_CYPRESS_TOP = mod("cypress_log_top");
	public static final String LOG_DRAGONS_BLOOD = mod("dragons_blood_log");
	public static final String LOG_DRAGONS_BLOOD_TOP = mod("dragons_blood_log_top");
	public static final String DRAGONS_BLOOD_RESIN_BLOCK = mod("dragons_blood_resin_block");
	public static final String LOG_ELDER = mod("elder_log");
	public static final String LOG_ELDER_TOP = mod("elder_log_top");
	public static final String HEDGEWITCH_WOOL = mod("hedgewitch_wool");
	public static final String LOG_JUNIPER = mod("juniper_log");
	public static final String LOG_JUNIPER_TOP = mod("juniper_log_top");
	public static final String SALT_BLOCK = mod("salt_block");

	public static String mod(String input){
		return (Mods.Bewitchment + ":block/" + input);
	}
}
