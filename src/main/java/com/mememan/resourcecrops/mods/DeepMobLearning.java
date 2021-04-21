package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.DeepMobLearningTex;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;

import static com.mememan.resourcecrops.lib.ingredient.DeepMobLearningIngredient.*;

public class DeepMobLearning {
	public static void init(){
		if(Mods.checkMod(Mods.DeepMobLearning)==true){
			RegisterCrop.addCrop(Mods.DeepMobLearning, "soot_covered_redstone", Crops.SOOT_COVERED_REDSTONE, Crops.SOOT_COVERED_REDSTONE_ITEM, new String[]{DeepMobLearningTex.SOOT_COVERED_REDSTONE_BLOCK, ResourceCropsTex.GRADIENT_RED},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SOOT_COVERED_REDSTONE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.DeepMobLearning, "glitch_ingot", Crops.GLITCH_INGOT, Crops.GLITCH_INGOT_ITEM, new String[]{DeepMobLearningTex.GLITCH_INGOT_BLOCK, ResourceCropsTex.GRADIENT_TEAL},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GLITCH_INGOT, Strings.Tier6}, true);
		}
	}
}
