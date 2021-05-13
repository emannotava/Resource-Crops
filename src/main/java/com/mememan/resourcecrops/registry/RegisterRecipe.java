package com.mememan.resourcecrops.registry;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.ingredient.CommonIngredient;
import com.mememan.resourcecrops.lib.ingredient.IndustrialRevolutionIngredient;
import com.mememan.resourcecrops.lib.ingredient.ResourceCropsIngredient;
import com.mememan.resourcecrops.lib.ingredient.VanillaIngredient;

import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JKeys;
import net.devtech.arrp.json.recipe.JPattern;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.ASSETS;

import com.mememan.resourcecrops.Main;

public class RegisterRecipe {
	public static final String[] SEED_PATTERN = {"IEI", "ESE", "IEI"};
	public static final String[] SQUARE = {"XXX", "XXX", "XXX"};
	public static final String[] ONE_ITEM = {"X"};
	public static final String[] SQUARE_HOLLOW = {"XXX", "X X", "XXX"};
	
	public static class Essence{
		public static final String[] SQUARE = RegisterRecipe.SQUARE;
		public static final String[] SQUARE_HOLLOW = RegisterRecipe.SQUARE_HOLLOW;
		public static final String[] STAR = {" X ", "XXX", " X "};
		public static final String[] STAR_HOLLOW = {" X ", "X X", " X "};
		public static final String[] CROSS = {"X X", " X ", "X X"};
		public static final String[] LINE_VERTICAL = {"X", "X", "X"};
		public static final String[] LINE_HORIZONTAL = {"XXX"};
		public static final String[] LINE_DIAGONAL_TOP_LEFT_TO_DOWN_RIGHT = {"X  ", " X ", "  X"};
		public static final String[] LINE_DIAGONAL_TOP_RIGHT_TO_DOWN_LEFT = {"  X", " X ", "X  "};
		public static final String[] PETAL = {" XX", "XXX", "XX "};
		public static final String[] TWO_BY_TWO = {"XX", "XX"};
		public static final String[] TOP_LEFT_EMPTY = {" XX", "XXX", "XXX"};
		public static final String[] TOP_MIDDLE_EMPTY = {"X X", "XXX", "XXX"};
		public static final String[] TOP_RIGHT_EMPTY = {"XX ", "XXX", "XXX"};
		public static final String[] MIDDLE_LEFT_EMPTY = {"XXX", " XX", "XXX"};
		public static final String[] MIDDLE_MIDDLE_EMPTY = {"XXX", "X X", "XXX"};
		public static final String[] MIDDLE_RIGHT_EMPTY = {"XXX", "XX ", "XXX"};
		public static final String[] BOTTOM_LEFT_EMPTY = {"XXX", "XXX", " XX"};
		public static final String[] BOTTOM_MIDDLE_EMPTY = {"XXX", "XXX", "X X"};
		public static final String[] BOTTOM_RIGHT_EMPTY = {"XXX", "XXX", "XX "};
		public static final String[] SQUARE_HOLLOW_2KEY = {"IXI", "X X", "IXI"};
		public static final String[] CROSSED_SQUARE_2KEY = {"XIX", "IXI", "XIX"};
	}
	
	public static class Unique_Items{
		public static final String[] ONE = {"A"};
		public static final String[] ONE_SMALL = {"AA", "AA"};
		public static final String[] ONE_LARGE = {"AAA", "AAA", "AAA"};
		public static final String[] TWO = {"AB"};
		public static final String[] TWO_SMALL = {"AB", "AB"};
		public static final String[] TWO_LARGE = {"ABA", "BAB", "AB"};
		public static final String[] THREE = {"ABC"};
		public static final String[] THREE_SMALL = {"AB", "C"};
		public static final String[] THREE_LARGE = {"ABC", "ABC", "ABC"};
		public static final String[] FOUR = {"ABC", "D"};
		public static final String[] FOUR_SMALL = FOUR;
		public static final String[] FOUR_LARGE = {"ABC", "DAB", "CD"};
		public static final String[] FIVE = {"ABC", "DE"};
		public static final String[] FIVE_LARGE = FIVE;
		public static final String[] SIX = {"ABC", "DEF"};
		public static final String[] SIX_LARGE = SIX;
		public static final String[] SEVEN = {"ABC", "DEF", "G"};
		public static final String[] SEVEN_LARGE = SEVEN;
		public static final String[] EIGHT = {"ABC", "DEF", "GH"};
		public static final String[] EIGHT_LARGE = EIGHT;
		public static final String[] NINE = {"ABC", "DEF", "GHI"};
		public static final String[] NINE_LARGE = NINE;
	}
	
	public static void initialize(){
		/*8 Logs -> 4 Chests*/ ASSETS.addRecipe(new Identifier("arrp", "8logs_to_4chests"), JRecipe.shaped(pattern(SQUARE_HOLLOW), JKeys.keys().key("X", JIngredient.ingredient().tag("minecraft:logs")), output(VanillaIngredient.CHEST, 4)));
		ASSETS.addRecipe(catI("arrp", "jeb_wool"), JRecipe.shaped(pattern(Unique_Items.NINE), JKeys.keys()
		.key("A", JIngredient.ingredient().item(VanillaIngredient.RED_WOOL))
		.key("B", JIngredient.ingredient().item(VanillaIngredient.ORANGE_WOOL))
		.key("C", JIngredient.ingredient().item(VanillaIngredient.YELLOW_WOOL))
		.key("D", JIngredient.ingredient().item(VanillaIngredient.GREEN_WOOL))
		.key("E", JIngredient.ingredient().item(VanillaIngredient.BLUE_WOOL))
		.key("F", JIngredient.ingredient().item(VanillaIngredient.PURPLE_WOOL))
		.key("G", JIngredient.ingredient().item(VanillaIngredient.LIGHT_BLUE_WOOL))
		.key("H", JIngredient.ingredient().item(VanillaIngredient.PINK_WOOL))
		.key("I", JIngredient.ingredient().item(VanillaIngredient.WHITE_WOOL)),
		output(ResourceCropsIngredient.JEB_WOOL, 1)));
		ASSETS.addRecipe(catI("arrp", "jeb_wool_carpet"), JRecipe.shaped(pattern(Essence.LINE_HORIZONTAL), JKeys.keys()
		.key("X", JIngredient.ingredient().item(ResourceCropsIngredient.JEB_WOOL)),
		output(ResourceCropsIngredient.JEB_WOOL_CARPET, 3)));
		ASSETS.addRecipe(catI("arrp", "dragon_egg_fragment_makes_dragon_egg_piece"), JRecipe.shaped(pattern(SQUARE), JKeys.keys().key("X", JIngredient.ingredient().item(ResourceCropsIngredient.DRAGON_EGG_FRAGMENT)), output(ResourceCropsIngredient.DRAGON_EGG_PIECE, 1)));
		ASSETS.addRecipe(catI("arrp", "dragon_egg_piece_makes_dragon_egg"), JRecipe.shaped(pattern(Essence.SQUARE), JKeys.keys().key("X", JIngredient.ingredient().item(ResourceCropsIngredient.DRAGON_EGG_PIECE)), output(VanillaIngredient.DRAGON_EGG, 1)));
		
		//Vanilla
		add2KeyEssenceRecipe(cat(Mods.Vanilla, "dirt"), cat(Mods.Vanilla, "crimson"), Essence.SQUARE_HOLLOW_2KEY, VanillaIngredient.CRIMSON_NYLIUM, 2);
		add2KeyEssenceRecipe(cat(Mods.Vanilla, "dirt"), cat(Mods.Vanilla, "warped"), Essence.SQUARE_HOLLOW_2KEY, VanillaIngredient.WARPED_NYLIUM, 2);
		add2KeyEssenceRecipe(cat(Mods.Vanilla, "dirt"), cat(VanillaIngredient.GRAVEL), Essence.SQUARE_HOLLOW_2KEY, VanillaIngredient.COARSE_DIRT, 4, false);
		add2KeyEssenceRecipe(cat(Mods.Vanilla, "quartz"), cat(Mods.Vanilla, "nether"), Essence.CROSSED_SQUARE_2KEY, VanillaIngredient.NETHER_QUARTZ_ORE, 2);

		add1KeyEssenceRecipe(cat(Mods.Vanilla, "spider"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.SPIDER_EYE, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "dirt"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.PODZOL, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "end"), Essence.STAR_HOLLOW, VanillaIngredient.POPPED_CHORUS_FRUIT, 4);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "end"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.END_STONE_BRICKS, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "obsidian"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.CRYING_OBSIDIAN, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "chicken"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.FEATHER, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "cow"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.LEATHER, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "creeper"), Essence.SQUARE, VanillaIngredient.CREEPER_HEAD, 1);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "skeleton"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.BONE_MEAL, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "skeleton"), Essence.SQUARE, VanillaIngredient.SKELETON_SKULL, 1);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "zombie"), Essence.SQUARE, VanillaIngredient.ZOMBIE_HEAD, 1);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "prismarine"), Essence.STAR, VanillaIngredient.PRISMARINE_CRYSTAL, 4);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "glowstone"), Essence.TWO_BY_TWO, VanillaIngredient.GLOWSTONE, 4);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "nether"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.SOUL_SAND, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "nether"), Essence.BOTTOM_MIDDLE_EMPTY, VanillaIngredient.SOUL_SOIL, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "stone"), Essence.MIDDLE_RIGHT_EMPTY, VanillaIngredient.COBBLESTONE, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "stone"), Essence.BOTTOM_LEFT_EMPTY, VanillaIngredient.ANDESITE, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "stone"), Essence.BOTTOM_MIDDLE_EMPTY, VanillaIngredient.DIORITE, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "stone"), Essence.BOTTOM_RIGHT_EMPTY, VanillaIngredient.GRANITE, 8);
		add1KeyEssenceRecipe(cat(Mods.Vanilla, "stone"), Essence.TWO_BY_TWO, VanillaIngredient.GRAVEL, 4);

		//Industrial Revolution
		if(Mods.checkMod(Mods.IndustrialRevolution)){
			add2KeyEssenceRecipe(cat(Mods.IndustrialRevolutionShort, "nikolite"), new String[]{Mods.Vanilla, "iron"}, Essence.SQUARE_HOLLOW_2KEY, IndustrialRevolutionIngredient.NIKOLITE_INGOT, 4);
			add2KeyEssenceRecipe(cat(Mods.IndustrialRevolutionShort, "enriched_nikolite"), new String[]{Mods.IndustrialRevolutionShort, "nikolite"}, Essence.SQUARE_HOLLOW_2KEY, IndustrialRevolutionIngredient.ENRICHED_NIKOLITE_INGOT, 4);
		}
		addSeedSmeltingRecipe(cat(Mods.Vanilla, "sand"), cat(Mods.Vanilla, "glass"));
		addSeedSmeltingRecipe(cat(Mods.Vanilla, "chicken"), cat(Mods.Vanilla, "BBQ_chicken".toLowerCase()));
		addSeedSmeltingRecipe(cat(Mods.Vanilla, "cow"), cat(Mods.Vanilla, "grilled_cow"));
		if(Mods.checkMod(Mods.Aether)){
			addSeedSmeltingRecipe(cat(Mods.AetherShort, "quicksoil"), cat(Mods.AetherShort, "quicksoil_glass"));
		}

	}

	public static String[] cat(String a, String b){
		return new String[]{a, b};
	}
	public static String[] cat(String b){
		return new String[]{b, "meow"};
	}
	public static Identifier catI(String a, String b){
		return new Identifier(a, b);
	}
	public static Identifier catI(String b){
		return new Identifier(b, "meow");
	}

	public static void add1KeyEssenceRecipe(String[] ingredient, String[] pattern, String output, int outputAmount){
		//I realized that I don't need to split at the ";" character but I'm too lazy to change it
		//So I added "meow:" to make sure it has something to split and doesn't throw an index OoB error
		String NAME_DIRTY = ("meow:essence_" + ingredient[0] + "/" + ingredient[1]);
		String[] INGREDIENT_SPLIT = NAME_DIRTY.split(":");
		String[] INGREDIENT_SPLIT2 = INGREDIENT_SPLIT[1].split("/");
		String[] OUTPUT_SPLIT = output.toLowerCase().split(":");

		String MOD_NAME_TO_LABEL = ingredient[0];
		String INGREDIENT_NAME = INGREDIENT_SPLIT2[1].toLowerCase();
		String NAME = INGREDIENT_SPLIT2[1] + "_makes_" + OUTPUT_SPLIT[1].toLowerCase();
		try {
			ASSETS.addRecipe(
				new Identifier("arrp", "essence_" + MOD_NAME_TO_LABEL + "/" + NAME),
				JRecipe.shaped(pattern(pattern),
				JKeys.keys()
				.key("X", JIngredient.ingredient().item(Mods.ResourceCrops + ":essence_" + MOD_NAME_TO_LABEL + "/" + INGREDIENT_NAME)),
				output(output, outputAmount))
			);
		} catch (Exception error) {
			Main.DEBUG_LOGGER.info("What on earth are you trying to do? The Recipe \"" + "essence_" + MOD_NAME_TO_LABEL + "/" + NAME + "\" failed to register, for more info see the error below:\n" + error);
		}
	}


	public static void add2KeyEssenceRecipe(String[] ingredient, String[] ingredientSecondKey, String[] pattern, String output, int outputAmount){
		add2KeyEssenceRecipe(ingredient, ingredientSecondKey, pattern, output, outputAmount, true);
	}
	public static void add2KeyEssenceRecipe(String[] ingredient, String[] ingredientSecondKey, String[] pattern, String output, int outputAmount, Boolean isSecondIngredientEssence){
		//I realized that I don't need to split at the ";" character but I'm too lazy to change it
		//So I added "meow:" to make sure it has something to split and doesn't throw an index OoB error
		String NAME_DIRTY = ("meow:essence_" + ingredient[0] + "/" + ingredient[1]);
		String SECOND_NAME_DIRTY;
		String[] INGREDIENT_SPLIT = NAME_DIRTY.split(":");
		String[] INGREDIENT_SPLIT2 = INGREDIENT_SPLIT[1].split("/");
		String[] INGREDIENT_SECOND_KEY_SPLIT;
		String[] INGREDIENT_SECOND_KEY_SPLIT2;
		
		String MOD_NAME_TO_LABEL = ingredient[0];
		String INGREDIENT_NAME = "";
		if(isSecondIngredientEssence && INGREDIENT_SPLIT2.length > 1){
			INGREDIENT_NAME = INGREDIENT_SPLIT2[1];
		}else{
			INGREDIENT_NAME = ingredientSecondKey[1];
		}
		String SECOND_MOD_NAME_TO_LABEL = "";
		String SECOND_INGREDIENT_NAME = "";
		if(isSecondIngredientEssence){
			//I realized that I don't need to split at the ";" character but I'm too lazy to change it
			//So I added "meow:" to make sure it has something to split and doesn't throw an index OoB error
			SECOND_NAME_DIRTY = ("meow:essence_" + ingredientSecondKey[0] + "/" + ingredientSecondKey[1]);
			INGREDIENT_SECOND_KEY_SPLIT = SECOND_NAME_DIRTY.split(":");
			INGREDIENT_SECOND_KEY_SPLIT2 = INGREDIENT_SECOND_KEY_SPLIT[1].split("/");
			SECOND_MOD_NAME_TO_LABEL = ingredientSecondKey[0];
			SECOND_INGREDIENT_NAME = INGREDIENT_SECOND_KEY_SPLIT2[1];
		}else{
			SECOND_INGREDIENT_NAME = ingredientSecondKey[0];
		}
		String[] OUTPUT_SPLIT = output.split(":");
		
		String NAME = INGREDIENT_SPLIT2[1] + "_makes_" + OUTPUT_SPLIT[1];

		try {
			if(isSecondIngredientEssence){
				ASSETS.addRecipe(
					new Identifier("arrp", "essence_" + MOD_NAME_TO_LABEL + "/" + NAME),
					JRecipe.shaped(pattern(pattern),
					JKeys.keys()
					.key("X", JIngredient.ingredient().item(Mods.ResourceCrops + ":essence_" + MOD_NAME_TO_LABEL + "/" + INGREDIENT_NAME))
					.key("I", JIngredient.ingredient().item(Mods.ResourceCrops + ":essence_" + SECOND_MOD_NAME_TO_LABEL + "/" + SECOND_INGREDIENT_NAME)),
					output(output, outputAmount))
				);
			}else{
				ASSETS.addRecipe(
					new Identifier("arrp", "essence_" + MOD_NAME_TO_LABEL + "/" + NAME),
					JRecipe.shaped(pattern(pattern),
					JKeys.keys()
					.key("X", JIngredient.ingredient().item(Mods.ResourceCrops + ":essence_" + MOD_NAME_TO_LABEL + "/" + INGREDIENT_NAME))
					.key("I", JIngredient.ingredient().item(SECOND_INGREDIENT_NAME)),
					output(output, outputAmount))
				);
			}
		} catch (Exception error) {
			Main.logMessage("What on earth are you trying to do? The Recipe \"" + "essence_" + MOD_NAME_TO_LABEL + "/" + NAME + "\" failed to register, for more info see the error below:\n" + error);
		}
	}

	public static JIngredient input(String item, Boolean useTag){
		if(useTag==false){
			return JIngredient.ingredient().item(item);
		}else{
			return JIngredient.ingredient().tag(item);
		}
	}

	public static JResult output(String itemModID, String itemName){
		return JResult.result(itemModID + ":" + itemName);
	}
	public static JResult output(String itemModID, String itemName, int outputAmount){
		return JResult.stackedResult(itemModID + ":" + itemName, outputAmount);
	}
	public static JResult output(String input){
		return JResult.result(input);
	}
	public static JResult output(String input, int outputAmount){
		return JResult.stackedResult(input, outputAmount);
	}

	public static JPattern pattern(String[] pattern){
		if(pattern.length==1){
			return JPattern.pattern(pattern[0]);
		}else if(pattern.length==2){
			return JPattern.pattern(pattern[0], pattern[1]);
		}else {
			return JPattern.pattern(pattern[0], pattern[1], pattern[2]);
		}
	}

	public static void addSeedRecipe(String[] output, String[] input, Boolean useTag){
		ASSETS.addRecipe(new Identifier("arrp", output[1]), JRecipe.shaped(pattern(SEED_PATTERN), JKeys.keys()
		.key("I", input(input[0], useTag))
		.key("E", input(input[1], false))
		.key("S", input(input[2], false))
		, output(output[0], output[1])));
	}
	public static void addIngotToBlockRecipe(String output, String[] input){
		String[] OUTPUT = output.split(":");
		ASSETS.addRecipe(new Identifier("arrp", "auto_tag_recipes/" + OUTPUT[1]), JRecipe.shaped(pattern(SQUARE), JKeys.keys()
		.key("X", input(CommonIngredient.convertTagToCommonMetalItem(input[0]), true))
		, output(OUTPUT[0], OUTPUT[1])));
	}

	public static void addBlockToIngotRecipe(String output, String[] input){
		String[] OUTPUT = output.split(":");
		ASSETS.addRecipe(new Identifier("arrp", "auto_tag_recipes/" + OUTPUT[1]), JRecipe.shaped(pattern(ONE_ITEM), JKeys.keys()
		.key("X", input(CommonIngredient.convertTagToCommonMetalItem(input[0]), true))
		, output(OUTPUT[0], OUTPUT[1])));
	}

	public static void addIngotToNuggetRecipe(String output, String[] input){
		String[] OUTPUT = output.split(":");
		ASSETS.addRecipe(new Identifier("arrp", "auto_tag_recipes/" + OUTPUT[1]), JRecipe.shaped(pattern(ONE_ITEM), JKeys.keys()
		.key("X", input(CommonIngredient.convertTagToCommonMetalItem(input[0]), true))
		, output(OUTPUT[0], OUTPUT[1])));
	}

	public static void addSmeltingRecipe(String input, String output){
		String[] OUTPUT = output.split(":");
		ASSETS.addRecipe(new Identifier("arrp", "auto_item_smelting/" + OUTPUT[1]), JRecipe.smelting(
			JIngredient.ingredient().item(input), JResult.result(output)
		));
	}
	public static void addSeedSmeltingRecipe(String[] input, String[] output){
		// String[] OUTPUT = output.split(":");
		ASSETS.addRecipe(new Identifier("arrp", "auto_item_smelting/crop_" + input[0] + "/" + input[1] + "_seeds_melt_into_" + output[1] + "_seeds"),
		JRecipe.smelting(
			JIngredient.ingredient().item(Mods.ResourceCrops + ":crop_" + input[0] + "/" + input[1]),
			JResult.result(Mods.ResourceCrops + ":crop_" + output[0] + "/" + output[1])
		));
	}
}