package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;

import static com.mememan.resourcecrops.lib.ingredient.ResourceCropsIngredient.*;
import static com.mememan.resourcecrops.lib.ingredient.VanillaIngredient.*;

public class ResourceCrops {
	public static void init(){
		if(Mods.checkMod(Mods.ResourceCrops)==true){
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_1", Crops.ESSENCE_TIER_1, Crops.ESSENCE_TIER_1_ITEM, new String[]{ResourceCropsTex.TIER_1_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_1_ESSENCE, Strings.Tier1, CRAFTING_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_2", Crops.ESSENCE_TIER_2, Crops.ESSENCE_TIER_2_ITEM, new String[]{ResourceCropsTex.TIER_2_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_2_ESSENCE, Strings.Tier2, TIER_1_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_3", Crops.ESSENCE_TIER_3, Crops.ESSENCE_TIER_3_ITEM, new String[]{ResourceCropsTex.TIER_3_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_3_ESSENCE, Strings.Tier3, TIER_2_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_4", Crops.ESSENCE_TIER_4, Crops.ESSENCE_TIER_4_ITEM, new String[]{ResourceCropsTex.TIER_4_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_4_ESSENCE, Strings.Tier4, TIER_3_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_5", Crops.ESSENCE_TIER_5, Crops.ESSENCE_TIER_5_ITEM, new String[]{ResourceCropsTex.TIER_5_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_5_ESSENCE, Strings.Tier5, TIER_4_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_6", Crops.ESSENCE_TIER_6, Crops.ESSENCE_TIER_6_ITEM, new String[]{ResourceCropsTex.TIER_6_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIER_6_ESSENCE, Strings.Tier6, TIER_5_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_infinity", Crops.ESSENCE_TIER_INFINITY, Crops.ESSENCE_TIER_INFINITY_ITEM, new String[]{ResourceCropsTex.TIER_INFINITY_BLOCK}, CropModelTypes.ALL, new Boolean[]{false,false}, new String[]{"", ""}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "tier_creative", Crops.ESSENCE_TIER_CREATIVE, Crops.ESSENCE_TIER_CREATIVE_ITEM, new String[]{ResourceCropsTex.TIER_CREATIVE_BLOCK}, CropModelTypes.ALL, new Boolean[]{false,false}, new String[]{"", ""}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "ultimate", Crops.ULTIMATE, Crops.ULTIMATE_ITEM, new String[]{ResourceCropsTex.ULTIMATE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BEDROCK, Strings.TierInfinity, TIER_INFINITY_SEEDS}, true);
			RegisterCrop.addCrop(Mods.ResourceCrops, "404", Crops.PLACEHOLDER_404, Crops.PLACEHOLDER_404_ITEM, new String[]{"missing_texture", ResourceCropsTex.BLOCK_404}, CropModelTypes.ALL, new Boolean[]{false,false}, new String[]{"", ""}, false);
		}
	}
}
