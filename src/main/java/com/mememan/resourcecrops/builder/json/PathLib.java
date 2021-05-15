package com.mememan.resourcecrops.builder.json;

import java.io.File;
import java.nio.file.Path;

import com.mememan.resourcecrops.lib.Strings;

import net.fabricmc.loader.api.FabricLoader;

public class PathLib {
	public static Path localConfigFolderPath(String origin_mod_id){
		return FabricLoader.getInstance().getConfigDir().normalize().resolve(Strings.modId).resolve("crops").resolve(origin_mod_id);
	}
	public static Path localConfigJSONPath(String crop_name, String origin_mod_id){
		return localConfigFolderPath(origin_mod_id).resolve(crop_name + ".json");
	}

	public static Path localConfigPath(String crop_name, String origin_mod_id){
		return FabricLoader.getInstance().getConfigDir().normalize().resolve(Strings.modId).resolve("crops").resolve(origin_mod_id).resolve(crop_name + ".json");
	}

	public static File localConfigFolderFile(String origin_mod_id){
		return localConfigFolderPath(origin_mod_id).toFile();
	}
	public static File localConfigJSONFile(String crop_name, String origin_mod_id){
		return localConfigJSONPath(crop_name, origin_mod_id).toFile();
	}

	public static File localConfigFile(String crop_name, String origin_mod_id){
		return localConfigPath(crop_name, origin_mod_id).toFile();
	}
}
