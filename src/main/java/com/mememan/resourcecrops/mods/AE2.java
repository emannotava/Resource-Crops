package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class AE2 {
	public static void init(){
		if(Mods.checkMod(Mods.AE2)==true){
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus", Crops.certus);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus_charged", Crops.certus_charged);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus_pure", Crops.certus_pure);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "fluix", Crops.fluix);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "fluix_pure", Crops.fluix_pure);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "quartz_pure", Crops.quartz_pure);
		}
	}
}
