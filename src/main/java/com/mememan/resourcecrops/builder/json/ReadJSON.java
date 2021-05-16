package com.mememan.resourcecrops.builder.json;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.mememan.resourcecrops.lib.Strings;

import net.fabricmc.loader.api.FabricLoader;

public class ReadJSON {
	public static void read() throws IOException{
		Path local_config_path = FabricLoader.getInstance().getConfigDir().normalize().resolve(Strings.modId).resolve("crops");
		String[] subdirs = local_config_path.toFile().list(new FilenameFilter(){
			@Override
			public boolean accept(File current, String name){
				return new File(current, name).isDirectory();
			}
		});

		//loop through all Folders within "config/resourcecrops/crops/"
		for(int iDir = 0; iDir < subdirs.length; iDir++){
			Path local_config_path_arr = FabricLoader.getInstance().getConfigDir().normalize().resolve(Strings.modId).resolve("crops").resolve(subdirs[iDir]);
			String[] subfiles = local_config_path_arr.toFile().list(new FilenameFilter(){
				@Override
				public boolean accept(File current, String name){
					return new File(current, name).isFile();
				}
			});
			//loop through all JSON Files within "config/resourcecrops/crops/<mod_id_here>/"
			for(int iFile = 0; iFile < subfiles.length; iFile++){
				Path local_config_path_arr_arr = local_config_path_arr.resolve(subfiles[iFile]);
				File local_config_file = local_config_path_arr_arr.toFile();
				try {
					// create Gson instance
					Gson gson = new Gson();
				
					// create a reader
					Reader reader = Files.newBufferedReader(Paths.get(local_config_file.toURI()));
				
					// convert JSON string to CropBaseObject
					CropBaseObject crop = gson.fromJson(reader, CropBaseObject.class);
				
					// print crop object
					System.out.println(subdirs[iDir]);
					System.out.println("\t\t" + crop.JSONVersion);
					System.out.println("\t\t" + crop.isDefaultCrop);
					System.out.println("\t\t" + crop.crop_name);
					System.out.println("\t\t" + crop.origin_mod_id);
					System.out.println("\t\t" + crop.crop_model_type);
					for(int i = 0; i < crop.crop_textures.length; i++){
						System.out.println("\t\t" + crop.crop_textures[i]);
					}
					System.out.println("\t\t" + crop.enable_loot_table_drops);
					System.out.println("\t\t" + crop.hex_color);
					System.out.println("\t\t" + crop.custom_top_texture);
					System.out.println("\t\t" + crop.custom_top_texture);
					System.out.println("\t\t" + crop.tier);
					System.out.println("\t\t" + crop.enable_loot_table_drops);
					System.out.println("\t\t" + crop.recipe_type);
					System.out.println("\t\t" + crop.recipe_input_type);
					System.out.println("\t\t" + crop.recipe_input_item);
					for(int i = 0; i < crop.essence_recipe_pattern.length; i++){
						System.out.println("\t\t" + crop.essence_recipe_pattern[i]);
					}
					System.out.println("\t\t" + crop.essence_recipe_output_item);
					System.out.println("\t\t" + crop.essence_recipe_output_amount);
				
					// close reader
					reader.close();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}	
}