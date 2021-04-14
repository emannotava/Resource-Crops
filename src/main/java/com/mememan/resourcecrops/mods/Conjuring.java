package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;

public class Conjuring {
	public static void init(){
		if(Mods.checkMod(Mods.Conjuring)==true){
			RegisterCrop.addCrop(Mods.Conjuring, "soul_alloy", Crops.SOUL_ALLOY, Crops.SOUL_ALLOY_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_brick", Crops.SOUL_BRICK, Crops.SOUL_BRICK_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_rod", Crops.SOUL_ROD, Crops.SOUL_ROD_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence", Crops.CONJURATION_ESSENCE, Crops.CONJURATION_ESSENCE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence_lesser", Crops.CONJURATION_ESSENCE_LESSER, Crops.CONJURATION_ESSENCE_LESSER_ITEM, CropModelTypes.ALL, true);
		}
	}
}
