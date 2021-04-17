package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.ItemSeeds;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
// import com.mememan.resourcecrops.loot.RegisterCropLoot;
import com.mememan.resourcecrops.mods.*;
import com.mememan.resourcecrops.registry.*;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mememan.resourcecrops.Main.crops;

public class RegisterCrop {

	public String tooltipContent = "PlaceHolder_Content";
	public static void initialize() {
		ResourceCrops.init();
		Vanilla.init();
		AE2.init();
		Aether.init();
		Astromine.init();
		BetterEnd.init();
		Botania.init();
		BYG.init();
		Conjuring.init();
		IndustrialRevolution.init();
		MythicMetals.init();
		TechReborn.init();
	}

	public static Block addCrop(String modName, String name, Block blockDeclaration, ItemSeeds itemDeclaration, String modelType, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable) {
		addCrop(modName, modName, name, blockDeclaration, itemDeclaration, modelType, addRecipe, ingredients, addLootTable);
		return null;
	}

	public static Block addCrop(String modName, String modNameShort, String name, Block blockDeclaration, ItemSeeds itemDeclaration, String modelType, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable) {
		crops.add(blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), itemDeclaration);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), blockDeclaration);
		if(addLootTable==true){
			//RegisterCropLoot.addToLootTable(blockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + name));
			RegisterLootTables.addLootTable(name, modNameShort, Strings.defaultCropAge);
		}
		if(addRecipe[0]==true){
			if(ingredients.length < 3){
				RegisterRecipe.addSeedRecipe(
					new String[]{
						Mods.ResourceCrops,
						"crop_" + modNameShort + "/" + name
					},
					new String[]{
						ingredients[0],
						Mods.ResourceCrops + ":essence_" + Mods.ResourceCrops + "/tier_" + ingredients[1],
						Mods.ResourceCrops + ":crop_" + Mods.ResourceCrops + "/tier_" + ingredients[1]
					},
					addRecipe[1]);
			}else{
				RegisterRecipe.addSeedRecipe(
					new String[]{
						Mods.ResourceCrops,
						"crop_" + modNameShort + "/" + name
					},
					new String[]{
						ingredients[0],
						Mods.ResourceCrops + ":essence_" + Mods.ResourceCrops + "/tier_" + ingredients[1],
						ingredients[2]
					},
					addRecipe[1]);
			}
		}
		RegisterLootTables.addLootTable("ultimate", Mods.ResourceCrops, Strings.defaultCropAge);
		RegisterBlockStates.addBlockstate(modNameShort, name, modelType);
		// RegisterCropLoot.addToLootTable(blockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
		return blockDeclaration;
	}

	// public static Block addCrop(String modNameShort, String name, Block[] blockDeclaration, int arrayEntry) {
	// 	crops.add(blockDeclaration[arrayEntry]);
	// 	Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), blockDeclaration[arrayEntry]);
	// 	Registry.register(Registry.ITEM, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), new BlockItem(blockDeclaration[arrayEntry], new FabricItemSettings().group(Main.resourcecrops_groupSeeds)));
	// 	RegisterCropLoot.addToLootTable(blockDeclaration[arrayEntry], 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + name));
	// 	RegisterCropLoot.addToLootTable(blockDeclaration[arrayEntry], 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
	// 	return blockDeclaration[arrayEntry];
	// }
}