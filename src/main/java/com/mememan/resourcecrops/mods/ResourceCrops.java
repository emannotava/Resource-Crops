package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class ResourceCrops {
	public static void init(){
		if(Mods.checkMod(Mods.ResourceCrops)==true){
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_1", Crops.essence_tier_1);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_2", Crops.essence_tier_2);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_3", Crops.essence_tier_3);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_4", Crops.essence_tier_4);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_5", Crops.essence_tier_5);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_6", Crops.essence_tier_6);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_infinity", Crops.essence_tier_infinity);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_creative", Crops.essence_tier_creative);
			RegisterCrop.addCrop(Mods.ResourceCrops, "ultimate", Crops.ultimate);
		}
	}
}
