package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Conjuring {
	public static void init(){
		if(Mods.checkMod(Mods.Conjuring)==true){
			RegisterCrop.addCrop(Mods.Conjuring, "soul_alloy", Crops.soul_alloy);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_brick", Crops.soul_brick);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_rod", Crops.soul_rod);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence", Crops.conjuration_essence);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence_lesser", Crops.conjuration_essence_lesser);
		}
	}
}
