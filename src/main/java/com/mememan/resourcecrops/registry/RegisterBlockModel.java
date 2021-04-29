package com.mememan.resourcecrops.registry;

import com.mememan.resourcecrops.lib.CropModelTypes;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.lib.tex.AetherTex;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;
import com.mememan.resourcecrops.lib.tex.VanillaTex;

import net.devtech.arrp.json.models.JModel;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.ASSETS;

public class RegisterBlockModel{
	public static void initialize(){
		registerOreModels(Mods.VanillaShort, "stone", VanillaTex.STONE);
		registerOreModels(Mods.VanillaShort, "diorite", VanillaTex.DIORITE);
		registerOreModels(Mods.VanillaShort, "andesite", VanillaTex.ANDESITE);
		registerOreModels(Mods.VanillaShort, "granite", VanillaTex.GRANITE);
		registerOreModels(Mods.VanillaShort, "netherrack", VanillaTex.NETHERRACK);
		registerOreModels(Mods.VanillaShort, "end_stone", VanillaTex.END_STONE);
		registerOreModels(Mods.AetherShort, "holystone", AetherTex.HOLYSTONE);
	}

	public static void registerOreModels(String modName, String baseName, String baseTex) {

		String orePath = Mods.ResourceCrops + ":block/templates/ore";
		String[] OT = {ResourceCropsTex.ORE_TIER_1, ResourceCropsTex.ORE_TIER_2, ResourceCropsTex.ORE_TIER_3, ResourceCropsTex.ORE_TIER_4, ResourceCropsTex.ORE_TIER_5, ResourceCropsTex.ORE_TIER_6};
		String[] outputPath = {"block/ore/" + modName + "/" + baseName + "_tier_1", "block/ore/" + modName + "/" + baseName + "_tier_2", "block/ore/" + modName + "/" + baseName + "_tier_3", "block/ore/" + modName + "/" + baseName + "_tier_4", "block/ore/" + modName + "/" + baseName + "_tier_5", "block/ore/" + modName + "/" + baseName + "_tier_6"};

		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[0]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[0]));
		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[1]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[1]));
		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[2]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[2]));
		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[3]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[3]));
		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[4]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[4]));
		ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("resource", OT[5]).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[5]));

		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[0]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_1"));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[1]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_2"));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[2]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_3"));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[3]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_4"));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[4]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_5"));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":" + outputPath[5]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_6"));
	}

	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		String blockPath = Mods.ResourceCrops + ":block/templates/" + parentPath;
		String seedPath = Mods.ResourceCrops + ":item/templates/" + parentPath;
		String essencePath = Mods.ResourceCrops + ":item/templates/essence";
		String hasSide = resourceTex.substring(resourceTex.length()-4, resourceTex.length());
		String hasNoSide = resourceTex.substring(0, resourceTex.length()-4) + "top";
		if(parentPath==CropModelTypes.LOG){
			System.out.println("FILTER ME! hasSide substring result: " + hasSide);
			System.out.println("FILTER ME! hasNoSide substring result: " + hasNoSide);
			if(hasSide=="side" || modName==Mods.Aether || modName==Mods.BetterEnd){
				ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
					.var("resource", resourceTex).var("resource_top", hasNoSide)
					.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
					.var("gradient", gradientTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
				ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
					.var("fill", hasNoSide).var("stroke", resourceTex)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
				ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
					.var("fill", hasNoSide).var("stroke", resourceTex)
					.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
				), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName));
			}else{
				ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
					.var("resource", resourceTex).var("resource_top", resourceTex + "_top")
					.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
					.var("gradient", gradientTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
				ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
					.var("fill", resourceTex + "_top").var("stroke", resourceTex)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
				ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
					.var("fill", resourceTex + "_top").var("stroke", resourceTex)
					.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
				), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName));
			}
		}else if(parentPath==CropModelTypes.RADIAL_CENTER){
			ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
				.var("resource", resourceTex).var("resource_center", resourceTex + "_center")
				.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
				.var("gradient", gradientTex)
			), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
			ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(
				JModel.textures()
				.var("fill", resourceTex + "_center")
				.var("stroke", resourceTex)
				.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
			), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
			ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(
				JModel.textures()
				.var("fill", resourceTex + "_center").var("stroke", resourceTex)
				.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
			), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName));
		}else{
			ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
				.var("resource", resourceTex)
				.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
				.var("gradient", gradientTex)
			), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName));
			ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(
				JModel.textures()
				.var("fill", resourceTex)
			), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName));
			ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(
				JModel.textures()
				.var("fill", resourceTex).var("stroke", resourceTex)
				.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
			), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName));
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
