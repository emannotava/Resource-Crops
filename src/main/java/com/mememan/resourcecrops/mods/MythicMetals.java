package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.MythicMetalsTex;

import static com.mememan.resourcecrops.lib.ingredient.MythicMetalsIngredient.*;

public class MythicMetals {
	public static void init(){
		if(Mods.checkMod(Mods.MythicMetals)==true){
			RegisterCrop.addCrop(Mods.MythicMetals, "adamantite", Crops.ADAMANTITE, Crops.ADAMANTITE_ITEM, new String[]{MythicMetalsTex.ADAMANTITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ADAMANTITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "aetherium", Crops.AETHERIUM, Crops.AETHERIUM_ITEM, new String[]{MythicMetalsTex.AETHERIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AETHERIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "aquarium", Crops.AQUARIUM, Crops.AQUARIUM_ITEM, new String[]{MythicMetalsTex.AQUARIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AQUARIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "argonium", Crops.ARGONIUM, Crops.ARGONIUM_ITEM, new String[]{MythicMetalsTex.ARGONIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ARGONIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "banglum", Crops.BANGLUM, Crops.BANGLUM_ITEM, new String[]{MythicMetalsTex.BANGLUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BANGLUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "carmot", Crops.CARMOT, Crops.CARMOT_ITEM, new String[]{MythicMetalsTex.CARMOT_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CARMOT_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "celestium", Crops.CELESTIUM, Crops.CELESTIUM_ITEM, new String[]{MythicMetalsTex.CELESTIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CELESTIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "discordium", Crops.DISCORDIUM, Crops.DISCORDIUM_ITEM, new String[]{MythicMetalsTex.DISCORDIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DISCORDIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "durasteel", Crops.DURASTEEL, Crops.DURASTEEL_ITEM, new String[]{MythicMetalsTex.DURASTEEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DURASTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "etherite", Crops.ETHERITE, Crops.ETHERITE_ITEM, new String[]{MythicMetalsTex.ETHERITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ETHERITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "hallowed", Crops.HALLOWED, Crops.HALLOWED_ITEM, new String[]{MythicMetalsTex.HALLOWED_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HALLOWED_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "kyber", Crops.KYBER, Crops.KYBER_ITEM, new String[]{MythicMetalsTex.KYBER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{KYBER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "manganese", Crops.MANGANESE, Crops.MANGANESE_ITEM, new String[]{MythicMetalsTex.MANGANESE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANGANESE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "midas_gold", Crops.MIDAS_GOLD, Crops.MIDAS_GOLD_ITEM, new String[]{MythicMetalsTex.MIDAS_GOLD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MIDAS_GOLD_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "mythril", Crops.MYTHRIL, Crops.MYTHRIL_ITEM, new String[]{MythicMetalsTex.MYTHRIL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MYTHRIL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "orichalcum", Crops.ORICHALCUM, Crops.ORICHALCUM_ITEM, new String[]{MythicMetalsTex.ORICHALCUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ORICHALCUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "prometheum", Crops.PROMETHEUM, Crops.PROMETHEUM_ITEM, new String[]{MythicMetalsTex.PROMETHEUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PROMETHEUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "quadrillum", Crops.QUADRILLUM, Crops.QUADRILLUM_ITEM, new String[]{MythicMetalsTex.QUADRILLUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUADRILLUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "quicksilver", Crops.QUICKSILVER, Crops.QUICKSILVER_ITEM, new String[]{MythicMetalsTex.QUICKSILVER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUICKSILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "runite", Crops.RUNITE, Crops.RUNITE_ITEM, new String[]{MythicMetalsTex.RUNITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RUNITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "slowsilver", Crops.SLOWSILVER, Crops.SLOWSILVER_ITEM, new String[]{MythicMetalsTex.SLOWSILVER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SLOWSILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "starrite", Crops.STARRITE, Crops.STARRITE_ITEM, new String[]{MythicMetalsTex.STARRITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STARRITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "stormyx", Crops.STORMYX, Crops.STORMYX_ITEM, new String[]{MythicMetalsTex.STORMYX_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STORMYX_SHELL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "tantalite", Crops.TANTALITE, Crops.TANTALITE_ITEM, new String[]{MythicMetalsTex.TANTALITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TANTALITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "truesilver", Crops.TRUESILVER, Crops.TRUESILVER_ITEM, new String[]{MythicMetalsTex.TRUESILVER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TRUESILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "unobtainium", Crops.UNOBTAINIUM, Crops.UNOBTAINIUM_ITEM, new String[]{MythicMetalsTex.UNOBTAINIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UNOBTAINIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "vermiculite", Crops.VERMICULITE, Crops.VERMICULITE_ITEM, new String[]{MythicMetalsTex.VERMICULITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{VERMICULITE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "ur", Crops.UR, Crops.UR_ITEM, new String[]{MythicMetalsTex.UR_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UR_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "metallurgium", Crops.METALLURGIUM, Crops.METALLURGIUM_ITEM, new String[]{MythicMetalsTex.METALLURGIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{METALLURGIUM_INGOT, Strings.Tier5}, true);
		}
	}
}
