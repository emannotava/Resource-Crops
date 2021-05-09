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
	public static String hasNoSide(String input){
		return input.substring(0, input.length()-4) + "top";
	}

	public static final String blockPath_stage_0 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_0";
	public static final String blockPath_stage_1 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_1";
	public static final String blockPath_stage_2 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_2";
	public static final String blockPath_stage_3 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_3";
	public static final String blockPath_stage_4 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_4";
	public static final String blockPath_stage_5 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_5";
	public static final String blockPath_stage_6 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_6";
	public static final String blockPath_stage_7 = Mods.ResourceCrops + ":block/templates/crop/narcissus/all/stage_7";
	public static final String blockPath_radial_stage_7 = Mods.ResourceCrops + ":block/templates/crop/narcissus/radial/stage_7";
	public static final String blockPath_log_stage_7 = Mods.ResourceCrops + ":block/templates/crop/narcissus/log/stage_7";

	public static void registerCropModel(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex, String parentPath) {
		if(Main.ENABLE_SELF){
			String seedPath = Mods.ResourceCrops + ":item/templates/" + parentPath;
			String essencePath = Mods.ResourceCrops + ":item/templates/essence";
			if(parentPath == CropModelTypes.LOG){
				Main.logDebugMessage("FILTER ME! hasNoSide substring result: " + hasNoSide(resourceTex));
				if(modName == Mods.Aether || modName == Mods.AetherShort || modName == Mods.BetterEnd){
					addLogCropStageModels(modName, cropName, resourceTex, gradientTex, plantLeavesTex, plantStemTex, true);
					ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
						.var("fill", hasNoSide(resourceTex)).var("stroke", resourceTex)
					), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
						.var("fill", hasNoSide(resourceTex)).var("stroke", resourceTex)
						.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
					), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
				}else{
					addLogCropStageModels(modName, cropName, resourceTex, gradientTex, plantLeavesTex, plantStemTex, false);
					ASSETS.addModel(JModel.modelKeepElements(seedPath).textures(JModel.textures()
						.var("fill", resourceTex + "_top").var("stroke", resourceTex)
					), new Identifier(Mods.ResourceCrops, "item/crop_" + modName + "/" + cropName.toLowerCase()));
					ASSETS.addModel(JModel.modelKeepElements(essencePath).textures(JModel.textures()
						.var("fill", resourceTex + "_top").var("stroke", resourceTex)
						.var("sparkles", ResourceCropsTex.SPARKLES_TIER_1)
					), new Identifier(Mods.ResourceCrops, "item/essence_" + modName + "/" + cropName.toLowerCase()));
				}
			}else if(parentPath == CropModelTypes.RADIAL_CENTER){
				addRadialCropStageModels(modName, cropName, resourceTex, gradientTex, plantLeavesTex, plantStemTex);
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
				addAllCropStageModels(modName, cropName, resourceTex, gradientTex, plantLeavesTex, plantStemTex);
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

	public static void addAllCropStageModels(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex){
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_0).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_0"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_1).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_1"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_2).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_2"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_3).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_3"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_4).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_4"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_5).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_5"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_6).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_6"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_7).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_7"));
	}

	public static void addRadialCropStageModels(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex){
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_0).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_0"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_1).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_1"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_2).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_2"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_3).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_3"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_4).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_4"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_5).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_5"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_6).textures(JModel.textures().var("resource", resourceTex).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_6"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_radial_stage_7).textures(JModel.textures().var("resource", resourceTex).var("resource_center", resourceTex + "_center").var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_7"));
	}

	public static String executeLogCheck(String input, Boolean isIncluded){
		if(isIncluded){
			return hasNoSide(input);
		}else{
			return input + "_top";
		}
	}

	public static void addLogCropStageModels(String modName, String cropName, String resourceTex, String gradientTex, String plantLeavesTex, String plantStemTex, Boolean isSideIncludeInLogTexName){
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_0).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_0"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_1).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_1"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_2).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_2"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_3).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_3"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_4).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_4"));		
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_5).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_5"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_stage_6).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_6"));
		ASSETS.addModel(JModel.modelKeepElements(blockPath_log_stage_7).textures(JModel.textures().var("resource", resourceTex).var("resource_top", executeLogCheck(resourceTex, isSideIncludeInLogTexName)).var("plant_leaves", plantLeavesTex).var("plant_stem", plantStemTex).var("gradient", gradientTex)
		), new Identifier(Mods.ResourceCrops, "block/crop_" + modName + "/" + cropName.toLowerCase() + "_stage_7"));
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
