package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;

public class ResourceCrops {
	public static void init(){
		if(Mods.checkMod(Mods.ResourceCrops)==true){
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_1", Crops.ESSENCE_TIER_1, Crops.ESSENCE_TIER_1_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_2", Crops.ESSENCE_TIER_2, Crops.ESSENCE_TIER_2_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_3", Crops.ESSENCE_TIER_3, Crops.ESSENCE_TIER_3_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_4", Crops.ESSENCE_TIER_4, Crops.ESSENCE_TIER_4_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_5", Crops.ESSENCE_TIER_5, Crops.ESSENCE_TIER_5_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_6", Crops.ESSENCE_TIER_6, Crops.ESSENCE_TIER_6_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_infinity", Crops.ESSENCE_TIER_INFINITY, Crops.ESSENCE_TIER_INFINITY_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_creative", Crops.ESSENCE_TIER_CREATIVE, Crops.ESSENCE_TIER_CREATIVE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "ultimate", Crops.ULTIMATE, Crops.ULTIMATE_ITEM, CropModelTypes.ALL, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "404", Crops.PLACEHOLDER_404, Crops.PLACEHOLDER_404_ITEM, CropModelTypes.ALL, false);
		}
	}
}
