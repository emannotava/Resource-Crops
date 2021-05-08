package com.mememan.resourcecrops.registry;

import com.mememan.resourcecrops.lib.CropModelTypes;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.tex.AetherTex;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;
import com.mememan.resourcecrops.lib.tex.VanillaTex;

import net.devtech.arrp.json.models.JModel;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.ASSETS;

import com.mememan.resourcecrops.Main;

public class RegisterBlockModel{
	public static void initialize(){
		registerOreModels(Mods.VanillaShort, "stone", VanillaTex.STONE);
		registerOreModels(Mods.VanillaShort, "diorite", VanillaTex.DIORITE);
		registerOreModels(Mods.VanillaShort, "andesite", VanillaTex.ANDESITE);
		registerOreModels(Mods.VanillaShort, "granite", VanillaTex.GRANITE);
		registerOreModels(Mods.VanillaShort, "netherrack", VanillaTex.NETHERRACK);
		registerOreModels(Mods.VanillaShort, "end_stone", VanillaTex.END_STONE);
		if(Mods.checkMod(Mods.Aether)){
			registerOreModels(Mods.AetherShort, "holystone", AetherTex.HOLYSTONE);
		}
	}

	public static void registerOreModels(String modName, String baseName, String baseTex) {
		if(Main.ENABLE_SELF){
			String orePath = Mods.ResourceCrops + ":block/templates/ore";
			String[] outputPath = {"block/ore/" + modName + "/" + baseName + "_tier_1", "block/ore/" + modName + "/" + baseName + "_tier_2", "block/ore/" + modName + "/" + baseName + "_tier_3", "block/ore/" + modName + "/" + baseName + "_tier_4", "block/ore/" + modName + "/" + baseName + "_tier_5", "block/ore/" + modName + "/" + baseName + "_tier_6"};
	
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[0]));
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[1]));
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[2]));
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[3]));
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[4]));
			ASSETS.addModel(JModel.modelKeepElements(orePath).textures(JModel.textures().var("base", baseTex).var("overlay", ResourceCropsTex.ORE_OVERLAY).var("particle", baseTex)), new Identifier(Mods.ResourceCrops, outputPath[5]));
	
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[0]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_1"));
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[1]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_2"));
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[2]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_3"));
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[3]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_4"));
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[4]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_5"));
			ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":" + outputPath[5]), new Identifier(Mods.ResourceCrops, "item/ore/" + modName + "/" + baseName + "_tier_6"));
		}
	}
	public static Boolean hasSide(String input){
		if(input.substring(input.length()-4, input.length())=="side"){
			return true;
		}else{
			return false;
		}	
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		if(Main.ENABLE_SELF){
			String blockPath = Mods.ResourceCrops + ":block/templates/" + parentPath;
			String blockPath_stage_6 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_6";
			String blockPath_stage_7 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_7";
			String seedPath = Mods.ResourceCrops + ":item/templates/" + parentPath;
			String essencePath = Mods.ResourceCrops + ":item/templates/essence";
			String hasNoSide = resourceTex.substring(0, resourceTex.length()-4) + "top";
			if(parentPath == CropModelTypes.LOG){
				Main.logDebugMessage("FILTER ME! hasNoSide substring result: " + hasNoSide);
				if(modName == Mods.Aether || modName == Mods.AetherShort || modName == Mods.BetterEnd){
					ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
						.var("resource", resourceTex).var("resource_top", hasNoSide)
						.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
						.var("gradient", gradientTex)
					), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
						.var("fill", hasNoSide).var("stroke", resourceTex)
					), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
						.var("fill", hasNoSide).var("stroke", resourceTex)
						.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
					), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
				}else{
					ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
						.var("resource", resourceTex).var("resource_top", resourceTex + "_top")
						.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
						.var("gradient", gradientTex)
					), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
						.var("fill", resourceTex + "_top").var("stroke", resourceTex)
					), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
						.var("fill", resourceTex + "_top").var("stroke", resourceTex)
						.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
					), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
				}
			}else if(parentPath == CropModelTypes.RADIAL_CENTER){
				ASSETS.addModel(JModel.modelKeepElements(blockPath).textures(JModel.textures()
					.var("resource", resourceTex).var("resource_center", resourceTex + "_center")
					.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
					.var("gradient", gradientTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase()));
				ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(
					JModel.textures()
					.var("fill", resourceTex + "_center")
					.var("stroke", resourceTex)
					.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
				ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(
					JModel.textures()
					.var("fill", resourceTex + "_center").var("stroke", resourceTex)
					.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
				), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
			}else{
				ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_6).textures(JModel.textures()
					.var("resource", resourceTex)
					.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
					.var("gradient", gradientTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_6"));
				ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_7).textures(JModel.textures()
					.var("resource", resourceTex)
					.var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex)
					.var("gradient", gradientTex)
				), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_7"));
				ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(
					JModel.textures()
					.var("fill", resourceTex)
				), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
				ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(
					JModel.textures()
					.var("fill", resourceTex).var("stroke", resourceTex)
					.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
				), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
			}
		}
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String parentPath) {
		registerCropModel(modName, cropName.toLowerCase(), resourceTex, gradientTex, ResourceCropsTex.LEAVES_COMMON, ResourceCropsTex.STEM_COMMON, parentPath);
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String parentPath) {
		registerCropModel(modName, cropName.toLowerCase(), resourceTex, ResourceCropsTex.GRADIENT_WHITE, parentPath);
	}
	public static void registerCropModel(String modName, String cropName, String resourceTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		registerCropModel(modName, cropName.toLowerCase(), resourceTex, ResourceCropsTex.GRADIENT_WHITE, plantLeavesTex, plantStemTex, parentPath);
	}
}
