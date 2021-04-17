package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.MythicMetalsIngredient.*;

public class MythicMetals {
	public static void init(){
		if(Mods.checkMod(Mods.MythicMetals)==true){
			RegisterCrop.addCrop(Mods.MythicMetals, "adamantite", Crops.ADAMANTITE, Crops.ADAMANTITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ADAMANTITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "aetherium", Crops.AETHERIUM, Crops.AETHERIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AETHERIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "aquarium", Crops.AQUARIUM, Crops.AQUARIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AQUARIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "argonium", Crops.ARGONIUM, Crops.ARGONIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ARGONIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "banglum", Crops.BANGLUM, Crops.BANGLUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BANGLUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "carmot", Crops.CARMOT, Crops.CARMOT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CARMOT_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "celestium", Crops.CELESTIUM, Crops.CELESTIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CELESTIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "discordium", Crops.DISCORDIUM, Crops.DISCORDIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DISCORDIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "durasteel", Crops.DURASTEEL, Crops.DURASTEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DURASTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "etherite", Crops.ETHERITE, Crops.ETHERITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ETHERITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "hallowed", Crops.HALLOWED, Crops.HALLOWED_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HALLOWED_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "kyber", Crops.KYBER, Crops.KYBER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{KYBER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "manganese", Crops.MANGANESE, Crops.MANGANESE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANGANESE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "midas_gold", Crops.MIDAS_GOLD, Crops.MIDAS_GOLD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MIDAS_GOLD_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "mythril", Crops.MYTHRIL, Crops.MYTHRIL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MYTHRIL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "orichalcum", Crops.ORICHALCUM, Crops.ORICHALCUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ORICHALCUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "prometheum", Crops.PROMETHEUM, Crops.PROMETHEUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PROMETHEUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "quadrillum", Crops.QUADRILLUM, Crops.QUADRILLUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUADRILLUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "quicksilver", Crops.QUICKSILVER, Crops.QUICKSILVER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUICKSILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "runite", Crops.RUNITE, Crops.RUNITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RUNITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "slowsilver", Crops.SLOWSILVER, Crops.SLOWSILVER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SLOWSILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "starrite", Crops.STARRITE, Crops.STARRITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STARRITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "stormyx", Crops.STORMYX, Crops.STORMYX_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STORMYX_SHELL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "tantalite", Crops.TANTALITE, Crops.TANTALITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TANTALITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "truesilver", Crops.TRUESILVER, Crops.TRUESILVER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TRUESILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "unobtainium", Crops.UNOBTAINIUM, Crops.UNOBTAINIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UNOBTAINIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "vermiculite", Crops.VERMICULITE, Crops.VERMICULITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{VERMICULITE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "ur", Crops.UR, Crops.UR_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UR_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.MythicMetals, "metallurgium", Crops.METALLURGIUM, Crops.METALLURGIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{METALLURGIUM_INGOT, Strings.Tier5}, true);
		}
	}
}
