package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.ItemSeeds;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
// import com.mememan.resourcecrops.loot.RegisterCropLoot;
import com.mememan.resourcecrops.mods.*;
import com.mememan.resourcecrops.registry.RegisterLootTables;

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

	public static Block addCrop(String modName, String name, Block BlockDeclaration, ItemSeeds ItemDeclaration, Boolean addLootTable) {
		addCrop(modName, modName, name, BlockDeclaration, ItemDeclaration, addLootTable);
		return null;
	}

	public static Block addCrop(String modName, String modNameShort, String name, Block BlockDeclaration, ItemSeeds ItemDeclaration, Boolean addLootTable) {
		crops.add(BlockDeclaration);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), ItemDeclaration);
		if(addLootTable==true){
			//RegisterCropLoot.addToLootTable(BlockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + name));
			RegisterLootTables.addLootTable(name, modNameShort, Strings.defaultCropAge);
		}
		RegisterLootTables.addLootTable("ultimate", Mods.ResourceCrops, Strings.defaultCropAge);
		// RegisterCropLoot.addToLootTable(BlockDeclaration, 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
		return BlockDeclaration;
	}

	// public static Block addCrop(String modNameShort, String name, Block[] BlockDeclaration, int arrayEntry) {
	// 	crops.add(BlockDeclaration[arrayEntry]);
	// 	Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), BlockDeclaration[arrayEntry]);
	// 	Registry.register(Registry.ITEM, new Identifier(Strings.modId, "crop_" + modNameShort + "/" + name), new BlockItem(BlockDeclaration[arrayEntry], new FabricItemSettings().group(Main.resourcecrops_groupSeeds)));
	// 	RegisterCropLoot.addToLootTable(BlockDeclaration[arrayEntry], 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + name));
	// 	RegisterCropLoot.addToLootTable(BlockDeclaration[arrayEntry], 1, 1, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
	// 	return BlockDeclaration[arrayEntry];
	// }
}