package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Aether {
	public static void init(){
		if(Mods.checkMod(Mods.Aether)==true){
			RegisterCrop.addCrop(Mods.AetherShort, "aether_dirt", Crops.aether_dirt);
			RegisterCrop.addCrop(Mods.AetherShort, "holystone", Crops.holystone);
			RegisterCrop.addCrop(Mods.AetherShort, "holystone_mossy", Crops.holystone_mossy);
			RegisterCrop.addCrop(Mods.AetherShort, "icestone", Crops.icestone);
			RegisterCrop.addCrop(Mods.AetherShort, "quicksoil", Crops.quicksoil);
			RegisterCrop.addCrop(Mods.AetherShort, "quicksoil_glass", Crops.quicksoil_glass);
			RegisterCrop.addCrop(Mods.AetherShort, "skyroot_log", Crops.skyroot_log);
			RegisterCrop.addCrop(Mods.AetherShort, "golden_oak", Crops.golden_oak);
			RegisterCrop.addCrop(Mods.AetherShort, "crystal_log", Crops.crystal_log);
			RegisterCrop.addCrop(Mods.AetherShort, "wisteria_log", Crops.wisteria_log);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_blue", Crops.aercloud_blue);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_cold", Crops.aercloud_cold);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_gold", Crops.aercloud_gold);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_pink", Crops.aercloud_pink);
			RegisterCrop.addCrop(Mods.AetherShort, "aerogel", Crops.aerogel);

			RegisterCrop.addCrop(Mods.AetherShort, "blue_berry", Crops.blue_berry);
			RegisterCrop.addCrop(Mods.AetherShort, "enchanted_blue_berry", Crops.enchanted_blue_berry);
			RegisterCrop.addCrop(Mods.AetherShort, "candy_cane", Crops.candy_cane);
			RegisterCrop.addCrop(Mods.AetherShort, "ginger_bread_man", Crops.ginger_bread_man);
			RegisterCrop.addCrop(Mods.AetherShort, "gummy_swet_blue", Crops.gummy_swet_blue);
			RegisterCrop.addCrop(Mods.AetherShort, "gummy_swet_gold", Crops.gummy_swet_gold);
			RegisterCrop.addCrop(Mods.AetherShort, "swet_ball", Crops.swet_ball);
			RegisterCrop.addCrop(Mods.AetherShort, "white_apple", Crops.white_apple);
			RegisterCrop.addCrop(Mods.AetherShort, "golden_amber", Crops.golden_amber);
			RegisterCrop.addCrop(Mods.AetherShort, "aechor_petal", Crops.aechor_petal);

			RegisterCrop.addCrop(Mods.AetherShort, "ambrosium_shard", Crops.ambrosium_shard);
			RegisterCrop.addCrop(Mods.AetherShort, "zanite_gemstone", Crops.zanite_gemstone);
			RegisterCrop.addCrop(Mods.AetherShort, "gravitite_gemstone", Crops.gravitite_gemstone);

			RegisterCrop.addCrop(Mods.AetherShort, "angelic", Crops.angelic);
			RegisterCrop.addCrop(Mods.AetherShort, "angelic_light", Crops.angelic_light);
			RegisterCrop.addCrop(Mods.AetherShort, "carved", Crops.carved);
			RegisterCrop.addCrop(Mods.AetherShort, "hellfire", Crops.hellfire);
			RegisterCrop.addCrop(Mods.AetherShort, "hellfire_light", Crops.hellfire_light);
			RegisterCrop.addCrop(Mods.AetherShort, "sentry", Crops.sentry);
			RegisterCrop.addCrop(Mods.AetherShort, "sentry_light", Crops.sentry_light);
		}
	}
}
