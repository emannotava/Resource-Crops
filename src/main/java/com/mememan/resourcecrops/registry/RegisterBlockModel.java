package com.mememan.resourcecrops.registry;

import com.mememan.resourcecrops.lib.CropModelTypes;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;

import net.devtech.arrp.json.models.JModel;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.assets;

public class RegisterBlockModel{
	public static void initialize(){

	}

	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		if(parentPath==CropModelTypes.LOG){
			if(resourceTex.substring(resourceTex.length()-4, resourceTex.length())=="side"){
				assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/templates/" + parentPath).textures(
					JModel.textures()
					.var("resource", resourceTex)
					.var("resource_top", (resourceTex.substring(resourceTex.length()-4, resourceTex.length()) + "top"))
					.var("gradient", gradientTex)
					.var("plant_leaves", plantLeavesTex)
					.var("plant_stem", plantStemTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
				assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":item/templates/" + parentPath).textures(
					JModel.textures()
					.var("fill", (resourceTex.substring(resourceTex.length()-4, resourceTex.length()) + "top"))
					.var("stroke", resourceTex)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
			}else{
				assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/templates/" + parentPath).textures(
					JModel.textures()
					.var("resource", resourceTex)
					.var("resource_top", resourceTex + "_top")
					.var("gradient", gradientTex)
					.var("plant_leaves", plantLeavesTex)
					.var("plant_stem", plantStemTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
				assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":item/templates/" + parentPath).textures(
					JModel.textures()
					.var("fill", resourceTex + "_top")
					.var("stroke", resourceTex)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
			}
		}else if(parentPath==CropModelTypes.RADIAL_CENTER){
			assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/templates/" + parentPath).textures(JModel.textures()
				.var("resource", resourceTex)
				.var("resource_center", resourceTex + "_center")
				.var("gradient", gradientTex)
				.var("plant_leaves", plantLeavesTex)
				.var("plant_stem", plantStemTex)
			), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
			assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":item/templates/" + parentPath).textures(
				JModel.textures()
				.var("fill", resourceTex + "_center")
				.var("stroke", resourceTex)
			), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
		}else{
			assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/templates/" + parentPath).textures(JModel.textures()
				.var("resource", resourceTex)
				.var("gradient", gradientTex)
				.var("plant_leaves", plantLeavesTex)
				.var("plant_stem", plantStemTex)
			), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
			assets.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":item/templates/" + parentPath).textures(
				JModel.textures()
				.var("fill", resourceTex)
			), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
		}
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String parentPath) {
		registerCropModel(modName, cropName, resourceTex, gradientTex, ResourceCropsTex.LEAVES_COMMON, ResourceCropsTex.STEM_COMMON, parentPath);
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String parentPath) {
		registerCropModel(modName, cropName, resourceTex, ResourceCropsTex.GRADIENT_WHITE, parentPath);
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		registerCropModel(modName, cropName, resourceTex, ResourceCropsTex.GRADIENT_WHITE, plantLeavesTex, plantStemTex, parentPath);
	}
}
