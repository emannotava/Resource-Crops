package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Vanilla {
	public static void init(){
		if(Mods.checkMod(Mods.Vanilla)==true){
			RegisterCrop.addCrop(Mods.VanillaShort, "oak", Crops.oak);
			RegisterCrop.addCrop(Mods.VanillaShort, "birch", Crops.birch);
			RegisterCrop.addCrop(Mods.VanillaShort, "spruce", Crops.spruce);
			RegisterCrop.addCrop(Mods.VanillaShort, "jungle", Crops.jungle);
			RegisterCrop.addCrop(Mods.VanillaShort, "dark_oak", Crops.dark_oak);
			RegisterCrop.addCrop(Mods.VanillaShort, "acacia", Crops.acacia);
			RegisterCrop.addCrop(Mods.VanillaShort, "crimson", Crops.crimson);
			RegisterCrop.addCrop(Mods.VanillaShort, "warped", Crops.warped);
			RegisterCrop.addCrop(Mods.VanillaShort, "dirt", Crops.dirt);
			RegisterCrop.addCrop(Mods.VanillaShort, "stone", Crops.stone);
			RegisterCrop.addCrop(Mods.VanillaShort, "sand", Crops.sand);
			RegisterCrop.addCrop(Mods.VanillaShort, "glass", Crops.glass);
			RegisterCrop.addCrop(Mods.VanillaShort, "basalt", Crops.basalt);
			RegisterCrop.addCrop(Mods.VanillaShort, "blackstone", Crops.blackstone);
			RegisterCrop.addCrop(Mods.VanillaShort, "coal", Crops.coal);
			RegisterCrop.addCrop(Mods.VanillaShort, "diamond", Crops.diamond);
			RegisterCrop.addCrop(Mods.VanillaShort, "emerald", Crops.emerald);
			RegisterCrop.addCrop(Mods.VanillaShort, "gold", Crops.gold);
			RegisterCrop.addCrop(Mods.VanillaShort, "iron", Crops.iron);
			RegisterCrop.addCrop(Mods.VanillaShort, "lapis", Crops.lapis);
			RegisterCrop.addCrop(Mods.VanillaShort, "netherite", Crops.netherite);
			RegisterCrop.addCrop(Mods.VanillaShort, "quartz", Crops.quartz);
			RegisterCrop.addCrop(Mods.VanillaShort, "redstone", Crops.redstone);
			RegisterCrop.addCrop(Mods.VanillaShort, "obsidian", Crops.obsidian);
			RegisterCrop.addCrop(Mods.VanillaShort, "prismarine", Crops.prismarine);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether", Crops.nether);
			RegisterCrop.addCrop(Mods.VanillaShort, "glowstone", Crops.glowstone);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether_star", Crops.nether_star);
			RegisterCrop.addCrop(Mods.VanillaShort, "end", Crops.end);
			RegisterCrop.addCrop(Mods.VanillaShort, "creeper", Crops.creeper);
			RegisterCrop.addCrop(Mods.VanillaShort, "dragon_egg", Crops.dragon_egg);
			RegisterCrop.addCrop(Mods.VanillaShort, "skeleton", Crops.skeleton);
			RegisterCrop.addCrop(Mods.VanillaShort, "wither_skeleton", Crops.wither_skeleton);
			RegisterCrop.addCrop(Mods.VanillaShort, "blaze", Crops.blaze);
			RegisterCrop.addCrop(Mods.VanillaShort, "enderman", Crops.enderman);
			RegisterCrop.addCrop(Mods.VanillaShort, "ghast", Crops.ghast);
			RegisterCrop.addCrop(Mods.VanillaShort, "zombie", Crops.zombie);
			RegisterCrop.addCrop(Mods.VanillaShort, "phantom_membrane", Crops.phantom_membrane);
		}
	}
}
