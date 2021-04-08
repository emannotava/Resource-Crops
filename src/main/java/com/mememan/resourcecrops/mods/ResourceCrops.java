package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

// import net.minecraft.block.Block;

public class ResourceCrops {
	public static void init(){
		if(Mods.checkMod(Mods.ResourceCrops)==true){
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_1", Strings.Tier1, Strings.defaultCropAge, Crops.essence_tier_1, "crop_resourcecrops/tier_1", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_2", Strings.Tier2, Strings.defaultCropAge, Crops.essence_tier_2, "crop_resourcecrops/tier_2", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_3", Strings.Tier3, Strings.defaultCropAge, Crops.essence_tier_3, "crop_resourcecrops/tier_3", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_4", Strings.Tier4, Strings.defaultCropAge, Crops.essence_tier_4, "crop_resourcecrops/tier_4", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_5", Strings.Tier5, Strings.defaultCropAge, Crops.essence_tier_5, "crop_resourcecrops/tier_5", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_6", Strings.Tier6, Strings.defaultCropAge, Crops.essence_tier_6, "crop_resourcecrops/tier_6", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_infinity", Strings.TierInfinity, Strings.defaultCropAge, Crops.essence_tier_infinity, "crop_resourcecrops/tier_creative", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_creative", Strings.TierCreative, Strings.defaultCropAge, Crops.essence_tier_creative, "crop_resourcecrops/tier_infinity", false);
			RegisterCrop.addCrop(Mods.ResourceCrops, "ultimate", Strings.TierCreative, Strings.defaultCropAge, Crops.ultimate, "bedrock", false);
			// RegisterCrop.addCrop(Mods.ResourceCrops, "loremipsum", (Block[]) Crops.LoremIpsum, 0);
		}
	}
}
