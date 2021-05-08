package com.mememan.resourcecrops.registry;

import static com.mememan.resourcecrops.Main.ASSETS;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

import net.devtech.arrp.json.blockstate.JBlockModel;
import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.blockstate.JVariant;
import net.minecraft.util.Identifier;

public class RegisterBlockStates {
	public static void initialize(){
		addOreBlockstates(Mods.VanillaShort, "stone");
		addOreBlockstates(Mods.VanillaShort, "diorite");
		addOreBlockstates(Mods.VanillaShort, "andesite");
		addOreBlockstates(Mods.VanillaShort, "granite");
		addOreBlockstates(Mods.VanillaShort, "netherrack");
		addOreBlockstates(Mods.VanillaShort, "end_stone");
		if(Mods.checkMod(Mods.Aether)){
			addOreBlockstates(Mods.AetherShort, "holystone");
		}
	}

	public static void addOreBlockstates(String modName, String baseName){
		if(Main.ENABLE_SELF){
			JState tier_1 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_1")));
			JState tier_2 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_2")));
			JState tier_3 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_3")));
			JState tier_4 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_4")));
			JState tier_5 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_5")));
			JState tier_6 = JState.state(defaulVariant(JState.model("resourcecrops:block/ore/" + modName + "/" + baseName + "_tier_6")));
			ASSETS.addBlockState(tier_1, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_1"));
			ASSETS.addBlockState(tier_2, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_2"));
			ASSETS.addBlockState(tier_3, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_3"));
			ASSETS.addBlockState(tier_4, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_4"));
			ASSETS.addBlockState(tier_5, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_5"));
			ASSETS.addBlockState(tier_6, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_6"));
		}
	}

	public static void addCropBlockstate(String modName, String cropName){
		if(Main.ENABLE_SELF){
			JState Fred = JState.state(
				cropVariant(
					JState.model("resourcecrops:block/crop_generic/crop_stage0"),
					JState.model("resourcecrops:block/crop_generic/crop_stage1"),
					JState.model("resourcecrops:block/crop_generic/crop_stage2"),
					JState.model("resourcecrops:block/crop_generic/crop_stage3"),
					JState.model("resourcecrops:block/crop_generic/crop_stage4"),
					JState.model("resourcecrops:block/crop_generic/crop_stage5"),
					JState.model("resourcecrops:block/crop_generic/crop_stage6"),
					JState.model("resourcecrops:block/crop_" + modName.toLowerCase() + "/" + cropName.toLowerCase())
					// JState.model("resourcecrops:block/templates/" + cropModelType)
				)
			);
			ASSETS.addBlockState(Fred, new Identifier(Strings.modId, "crop_" + modName + "/" + cropName));
		}
	}

	public static void addCropBlockstateNew(String modName, String cropName){
		if(Main.ENABLE_SELF){
			JState Fred = JState.state(
				cropVariant(
					JState.model("resourcecrops:block/crop_generic/crop_stage0"),
					JState.model("resourcecrops:block/crop_generic/crop_stage1"),
					JState.model("resourcecrops:block/crop_generic/crop_stage2"),
					JState.model("resourcecrops:block/crop_generic/crop_stage3"),
					JState.model("resourcecrops:block/crop_generic/crop_stage4"),
					JState.model("resourcecrops:block/crop_generic/crop_stage5"),
					JState.model("resourcecrops:block/crop_" + modName.toLowerCase() + "/" + cropName.toLowerCase() + "_stage_6"),
					JState.model("resourcecrops:block/crop_" + modName.toLowerCase() + "/" + cropName.toLowerCase() + "_stage_7")
					// JState.model("resourcecrops:block/templates/" + cropModelType)
				)
			);
			ASSETS.addBlockState(Fred, new Identifier(Strings.modId, "crop_" + modName + "/" + cropName));
		}
	}

	public static JVariant cropVariant(JBlockModel age0, JBlockModel age1, JBlockModel age2, JBlockModel age3, JBlockModel age4, JBlockModel age5, JBlockModel age6, JBlockModel age7){
		JVariant variant = new JVariant();
		variant.put("age=0", age0)
			.put("age=1", age1)
			.put("age=2", age2)
			.put("age=3", age3)
			.put("age=4", age4)
			.put("age=5", age5)
			.put("age=6", age6)
			.put("age=7", age7);
		return variant;
	}
	public static JVariant defaulVariant(JBlockModel model){
		JVariant variant = new JVariant();
		variant.put("", model);
		return variant;
	}

}
