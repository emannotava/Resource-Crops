package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class MythicMetals {
	public static void init(){
		if(Mods.checkMod(Mods.MythicMetals)==true){
			RegisterCrop.addCrop(Mods.MythicMetals, "adamantite", Crops.adamantite);
			RegisterCrop.addCrop(Mods.MythicMetals, "aetherium", Crops.aetherium);
			RegisterCrop.addCrop(Mods.MythicMetals, "aquarium", Crops.aquarium);
			RegisterCrop.addCrop(Mods.MythicMetals, "argonium", Crops.argonium);
			RegisterCrop.addCrop(Mods.MythicMetals, "banglum", Crops.banglum);
			RegisterCrop.addCrop(Mods.MythicMetals, "carmot", Crops.carmot);
			RegisterCrop.addCrop(Mods.MythicMetals, "celestium", Crops.celestium);
			RegisterCrop.addCrop(Mods.MythicMetals, "discordium", Crops.discordium);
			RegisterCrop.addCrop(Mods.MythicMetals, "durasteel", Crops.durasteel);
			RegisterCrop.addCrop(Mods.MythicMetals, "etherite", Crops.etherite);
			RegisterCrop.addCrop(Mods.MythicMetals, "hallowed", Crops.hallowed);
			RegisterCrop.addCrop(Mods.MythicMetals, "kyber", Crops.kyber);
			RegisterCrop.addCrop(Mods.MythicMetals, "manganese", Crops.manganese);
			RegisterCrop.addCrop(Mods.MythicMetals, "metallurgium", Crops.metallurgium);
			RegisterCrop.addCrop(Mods.MythicMetals, "midas_gold", Crops.midas_gold);
			RegisterCrop.addCrop(Mods.MythicMetals, "mythril", Crops.mythril);
			RegisterCrop.addCrop(Mods.MythicMetals, "orichalcum", Crops.orichalcum);
			RegisterCrop.addCrop(Mods.MythicMetals, "prometheum", Crops.prometheum);
			RegisterCrop.addCrop(Mods.MythicMetals, "quadrillum", Crops.quadrillum);
			RegisterCrop.addCrop(Mods.MythicMetals, "quicksilver", Crops.quicksilver);
			RegisterCrop.addCrop(Mods.MythicMetals, "runite", Crops.runite);
			RegisterCrop.addCrop(Mods.MythicMetals, "slowsilver", Crops.slowsilver);
			RegisterCrop.addCrop(Mods.MythicMetals, "starrite", Crops.starrite);
			RegisterCrop.addCrop(Mods.MythicMetals, "stormyx", Crops.stormyx);
			RegisterCrop.addCrop(Mods.MythicMetals, "tantalite", Crops.tantalite);
			RegisterCrop.addCrop(Mods.MythicMetals, "truesilver", Crops.truesilver);
			RegisterCrop.addCrop(Mods.MythicMetals, "unobtainium", Crops.unobtainium);
			RegisterCrop.addCrop(Mods.MythicMetals, "ur", Crops.ur);
			RegisterCrop.addCrop(Mods.MythicMetals, "vermiculite", Crops.vermiculite);
		}
	}
}
