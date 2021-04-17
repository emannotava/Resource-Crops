package com.mememan.resourcecrops.registry;

import com.mememan.resourcecrops.lib.Mods;

import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JKeys;
import net.devtech.arrp.json.recipe.JPattern;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.assets;

public class RegisterRecipe {
	public static final String[] seedPattern = {"IEI", "ESE", "IEI"};
	public static final String[] square = {"XXX", "XXX", "XXX"};
	public static final String[] squareHollow = {"XXX", "X X", "XXX"};

	public static void initialize(){
		/*8 Logs -> 4 Chests*/ assets.addRecipe(new Identifier("arrp", "8logs_to_4chests"), JRecipe.shaped(pattern(squareHollow), JKeys.keys().key("X", JIngredient.ingredient().item("minecraft:oak_log").item("minecraft:birch_log").item("minecraft:spruce_log").item("minecraft:jungle_log").item("minecraft:acacia_log").item("minecraft:dark_oak_log").item("minecraft:warped_stem").item("minecraft:crimson_stem")), output(Mods.Vanilla, "chest", 4)));
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
		assets.addRecipe(new Identifier("arrp", output[1]), JRecipe.shaped(pattern(seedPattern), JKeys.keys()
		.key("I", input(input[0], useTag))
		.key("E", input(input[1], false))
		.key("S", input(input[2], false))
		, output(output[0], output[1])));
	}
}