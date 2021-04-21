package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class AE2Tex {
	public static final String CERTUS_QUARTZ_BLOCK = mod("quartz_block");
	public static final String CHARGED_CERTUS_QUARTZ_BLOCK = ResourceCropsTex.mod("ae2/charged_certus_quartz_block");
	public static final String PURE_CERTUS_QUARTZ_BLOCK = CERTUS_QUARTZ_BLOCK;
	public static final String FLUIX_BLOCK = mod("fluix_block");
	public static final String PURE_FLUIX_BLOCK = FLUIX_BLOCK;
	public static final String PURE_NETHER_QUARTZ_BLOCK = VanillaTex.QUARTZ_BLOCK;

	public static String mod(String input){
		return (Mods.AE2 + ":block/" + input);
	}
}
