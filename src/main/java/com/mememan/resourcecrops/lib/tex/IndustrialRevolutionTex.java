package com.mememan.resourcecrops.lib.tex;

import com.mememan.resourcecrops.lib.Mods;

public class IndustrialRevolutionTex {
	public static final String NIKOLITE_BLOCK = ResourceCropsTex.mod("industrialrevolution/nikolite_block");
	public static final String ENRICHED_NIKOLITE_BLOCK = ResourceCropsTex.mod("industrialrevolution/enriched_nikolite_block");

	public static String mod(String input){
		return (Mods.IndustrialRevolution + ":" + input);
	}
}
