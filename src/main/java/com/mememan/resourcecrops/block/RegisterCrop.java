package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.ItemSeeds;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterCropLoot;
// import com.mememan.resourcecrops.loot.RegisterCropLoot;
// import com.mememan.resourcecrops.mods.*;
import com.mememan.resourcecrops.registry.*;

import net.minecraft.block.Block;
// import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mememan.resourcecrops.Main.crops;

public class RegisterCrop {

	public String tooltipContent = "PlaceHolder_Content";
	public static void initialize() {
		// ResourceCrops.init();
		// Vanilla.init();
		// Common.init();
		// AE2.init();
		// Aether.init();
		// Astromine.init();
		// BetterEnd.init();
		// Bewitchment.init();
		// Biomemakeover.init();
		// Blockus.init();
		// Botania.init();
		// BYG.init();
		// Conjuring.init();
		// DeepMobLearning.init();
		// IndustrialRevolution.init();
		// MythicMetals.init();
		// TechReborn.init();
	}

	public static Block addCrop(String modName, String name, Block blockDeclaration, ItemSeeds itemDeclaration, String[] resourceTex, String modelType, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable) {
		addCrop(modName, modName, name.toLowerCase(), blockDeclaration, itemDeclaration, resourceTex, modelType, addRecipe, ingredients, addLootTable);
		return null;
	}

	public static Block addCrop(String modName, String modNameShort, String name, Block blockDeclaration, ItemSeeds itemDeclaration, String[] resourceTex, String modelType, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable) {
		crops.add(blockDeclaration);
		String NAME_LOWERCASE = name.toLowerCase();
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + NAME_LOWERCASE), blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + NAME_LOWERCASE), itemDeclaration);
		if(addLootTable==true){
			//RegisterCropLoot.addToLootTable(blockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + name));
			RegisterLootTables.addLootTable(NAME_LOWERCASE, modNameShort, Strings.defaultCropAge);
		}
		if(addRecipe[0]==true){
			if(ingredients.length < 3){
				RegisterRecipe.addSeedRecipe(
					new String[]{
						Mods.ResourceCrops,
						"crop_" + modNameShort + "/" + NAME_LOWERCASE
					},
					new String[]{
						ingredients[0],
						Mods.ResourceCrops + ":essence_" + Mods.ResourceCrops + "/tier_" + ingredients[1].toLowerCase(),
						Mods.ResourceCrops + ":crop_" + Mods.ResourceCrops + "/tier_" + ingredients[1].toLowerCase()
					},
					addRecipe[1]);
			}else{
				RegisterRecipe.addSeedRecipe(
					new String[]{
						Mods.ResourceCrops,
						"crop_" + modNameShort + "/" + NAME_LOWERCASE
					},
					new String[]{
						ingredients[0],
						Mods.ResourceCrops + ":essence_" + Mods.ResourceCrops + "/tier_" + ingredients[1].toLowerCase(),
						ingredients[2]
					},
					addRecipe[1]);
			}
		}
		// RegisterLootTables.addLootTable("ultimate", Mods.ResourceCrops, Strings.defaultCropAge);
		RegisterBlockStates.addCropBlockstate(modNameShort, name);
		if(resourceTex.length==1){
			RegisterBlockModel.registerCropModel(modName, NAME_LOWERCASE, resourceTex[0], modelType);
		}else if(resourceTex.length==2){
			RegisterBlockModel.registerCropModel(modName, NAME_LOWERCASE, resourceTex[0], resourceTex[1], modelType);
		}else if(resourceTex.length==3){
			RegisterBlockModel.registerCropModel(modName, NAME_LOWERCASE, resourceTex[0], resourceTex[1], resourceTex[2], modelType);
		}else{
			RegisterBlockModel.registerCropModel(modName, NAME_LOWERCASE, resourceTex[0], resourceTex[1], resourceTex[2], resourceTex[3], modelType);
		}
		RegisterCropLoot.addToLootTable(blockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
		return blockDeclaration;
	}
}