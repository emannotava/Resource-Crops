package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;

public class IndustrialRevolution {
	public static void init(){
		if(Mods.checkMod(Mods.IndustrialRevolution)==true){
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "nikolite", Crops.NIKOLITE, Crops.NIKOLITE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "enriched_nikolite", Crops.ENRICHED_NIKOLITE, Crops.ENRICHED_NIKOLITE_ITEM, CropModelTypes.ALL, true);
		}
	}
}
