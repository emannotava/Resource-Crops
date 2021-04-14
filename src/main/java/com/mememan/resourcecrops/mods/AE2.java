package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;

public class AE2 {
	public static void init(){
		if(Mods.checkMod(Mods.AE2)==true){
			RegisterCrop.addCrop(Mods.AE2Short, "certus", Crops.CERTUS, Crops.CERTUS_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.AE2Short, "certus_charged", Crops.CERTUS_CHARGED, Crops.CERTUS_CHARGED_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.AE2Short, "certus_pure", Crops.CERTUS_PURE, Crops.CERTUS_PURE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.AE2Short, "fluix", Crops.FLUIX, Crops.FLUIX_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.AE2Short, "fluix_pure", Crops.FLUIX_PURE, Crops.FLUIX_PURE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.AE2Short, "quartz_pure", Crops.QUARTZ_PURE, Crops.QUARTZ_PURE_ITEM, CropModelTypes.ALL, true);
		}
	}
}
