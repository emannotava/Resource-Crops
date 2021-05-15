package com.mememan.resourcecrops.builder.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mememan.resourcecrops.lib.CropModelTypes;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.registry.RegisterRecipe;

import net.fabricmc.loader.api.FabricLoader;

public class CreateJSON {

	public static void create(
		String crop_name, String origin_mod_id,
		String crop_model_type, String[] crop_textures,
		String custom_top_texture, String tier,
		Boolean enable_loot_table_drops, String recipe_type,
		String recipe_input_type, String recipe_input_item,
		String[] main_essence_recipe_pattern, String essence_recipe_output_item,
		int essence_recipe_output_amount
	) throws IOException{
		Path local_config_folder_path = FabricLoader.getInstance().getConfigDir().normalize().resolve(Strings.modId).resolve("crops").resolve(origin_mod_id);
		Path local_config_json_path = local_config_folder_path.resolve(crop_name + ".json");
		File local_config_folder_file = local_config_folder_path.toFile();
		File local_config_json_file = local_config_json_path.toFile();
		if(!local_config_folder_file.exists()) { local_config_folder_file.getParentFile().mkdirs(); }
		// if(!local_config_json_file.exists()) { local_config_json_file.createNewFile(); }
		// try (Writer writer = new FileWriter("crops/" + origin_mod_id + "/" + crop_name + ".json")) {
		try (Writer writer = new FileWriter(local_config_json_file.getName())) {
			// create user object
			CropBaseObject crop = new CropBaseObject(crop_name, origin_mod_id, crop_model_type, crop_textures, custom_top_texture, tier, enable_loot_table_drops, recipe_type, recipe_input_type, recipe_input_item, main_essence_recipe_pattern, essence_recipe_output_item, essence_recipe_output_amount);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(crop, writer);
		}catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		create(
			"lorem_ipsum",
			"example_mod",
			CropModelTypes.ALL,
			new String[]{
				"minecraft:block/coal_block",
				"resourcecrops:block/gradient/white",
				"resourcecrops:block/plant_types/narcissus/leaves",
				"resourcecrops:block/plant_types/narcissus/stem"
			},
			"disabled",
			Strings.TIER_1,
			true,
			"CRAFTING_SHAPED",
			"ITEM",
			"minecraft:coal",
			RegisterRecipe.Essence.SQUARE_HOLLOW,
			"minecraft:coal",
			8
		);
	}
}
