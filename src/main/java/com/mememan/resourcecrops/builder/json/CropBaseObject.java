package com.mememan.resourcecrops.builder.json;

public class CropBaseObject {

	public String JSONVersion = "0.0.0";
	public Boolean isDefaultCrop = true;
	public String crop_name;
	public String origin_mod_id;
	public String crop_model_type;
	/* Index: 0 = texture of whatever material it is that <crop_name_here> produces
	 * Index: 1 = Gradient Texture, Will soon change to a HEX int cast as a String
	 * Index: 2 = Plant Leaves Texture
	 * Index: 3 = Plant Stem Texture
	 */
	public String[] crop_textures;
	public String custom_top_texture;
	public Boolean enable_color_overlay;
	public int hex_color;
	public String tier;
	public Boolean enable_loot_table_drops;
	/* Only valid options:
	 * CRAFTING_SHAPED
	 * SMELTING
	 */
	public String recipe_type;
	/* Only valid options:
	 * ITEM
	 * TAG
	 */
	public String recipe_input_type;
	public String recipe_input_item;

	public String[] essence_recipe_pattern;
	public String essence_recipe_output_item;
	public int essence_recipe_output_amount;

	public CropBaseObject(
		String crop_name, String origin_mod_id,
		String crop_model_type, String[] crop_textures,
		String custom_top_texture, Boolean enable_color_overlay, String hex_color, String tier,
		Boolean enable_loot_table_drops, String recipe_type,
		String recipe_input_type, String recipe_input_item,
		String[] essence_recipe_pattern, String essence_recipe_output_item,
		int essence_recipe_output_amount
	){
		this.crop_name = crop_name;
		this.origin_mod_id = origin_mod_id;
		this.crop_model_type = crop_model_type;
		this.crop_textures = crop_textures;
		if(custom_top_texture == "disabled" || custom_top_texture == "no" || custom_top_texture == "off" || custom_top_texture == "ignore" || custom_top_texture == "ignored" || custom_top_texture == "none"){
			this.custom_top_texture = crop_textures[0];
		}else{
			this.custom_top_texture = custom_top_texture;
		}
		this.enable_color_overlay = enable_color_overlay;
		if(enable_color_overlay){
			this.hex_color = Integer.decode(hex_color);
		}else{
			this.hex_color = Integer.decode("0x000000");
		}
		this.tier = tier;
		this.enable_loot_table_drops = enable_loot_table_drops;
		this.recipe_type = recipe_type;
		this.recipe_input_type = recipe_input_type;
		this.recipe_input_item = recipe_input_item;
		this.essence_recipe_pattern = essence_recipe_pattern;
		this.essence_recipe_output_item = essence_recipe_output_item;
		this.essence_recipe_output_amount = essence_recipe_output_amount;
	}

}
