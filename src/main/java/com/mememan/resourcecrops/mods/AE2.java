package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

public class AE2 {
	public static void init(){
		if(Mods.checkMod(Mods.AE2)==true){
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus", Strings.Tier3, Strings.defaultCropAge, Crops.certus, "certus_quartz_crystal", false);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus_charged", Strings.Tier3, Strings.defaultCropAge, Crops.certus_charged, "charged_certus_quartz_crystal", false);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "certus_pure", Strings.Tier4, Strings.defaultCropAge, Crops.certus_pure, "purified_certus_quartz_crystal", false);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "fluix", Strings.Tier4, Strings.defaultCropAge, Crops.fluix, "fluix_crystal", false);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "fluix_pure", Strings.Tier5, Strings.defaultCropAge, Crops.fluix_pure, "purified_fluix_crystal", false);
			RegisterCrop.addCrop(Mods.AE2, Mods.AE2Short, "quartz_pure", Strings.Tier4, Strings.defaultCropAge, Crops.quartz_pure, "purified_nether_quartz_crystal", false);
		}
	}
}
