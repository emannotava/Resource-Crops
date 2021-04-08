package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class IndustrialRevolution {
	public static void init(){
		if(Mods.checkMod(Mods.IndustrialRevolution)==true){
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "nikolite", Crops.nikolite);
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "enriched_nikolite", Crops.enriched_nikolite);
		}
	}
}
