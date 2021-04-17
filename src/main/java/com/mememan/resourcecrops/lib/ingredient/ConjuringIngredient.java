package com.mememan.resourcecrops.lib.ingredient;

import com.mememan.resourcecrops.lib.Mods;

public class ConjuringIngredient {
	public static final String CONJURING_FOCUS = mod("conjuring_focus");
	public static final String CONJURATION_ESSENCE = mod("conjuration_essence");
	public static final String HASTE_CHARM = mod("haste_charm");
	public static final String PLENTIFULNESS_CHARM = mod("plentifulness_charm");
	public static final String IGNORANCE_CHARM = mod("ignorance_charm");
	public static final String SCOPE_CHARM = mod("scope_charm");
	public static final String CONJURING_SCEPTER = mod("conjuring_scepter");
	public static final String SUPERIOR_CONJURING_SCEPTER = mod("superior_conjuring_scepter");
	public static final String SOUL_ROD = mod("soul_rod");
	public static final String SOUL_ALLOY = mod("soul_alloy");
	public static final String SOUL_BRICK = mod("soul_brick");
	public static final String LESSER_CONJURATION_ESSENCE = mod("lesser_conjuration_essence");
	public static final String GEM_SOCKET = mod("gem_socket");

	public static String mod(String input){
		return (Mods.Conjuring + ":" + input);
	}
}
