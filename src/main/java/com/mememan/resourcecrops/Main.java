package com.mememan.resourcecrops;

import java.io.IOException;
import java.util.ArrayList;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.block.RegisterJewel;
import com.mememan.resourcecrops.block.RegisterMetal;
import com.mememan.resourcecrops.builder.json.CreateJSON;
import com.mememan.resourcecrops.builder.json.ReadJSON;
import com.mememan.resourcecrops.item.RegisterFood;
import com.mememan.resourcecrops.item.RegisterItem;
import com.mememan.resourcecrops.itemgroup.CreativeTab;
import com.mememan.resourcecrops.lib.CropModelTypes;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterEntityLoot;
import com.mememan.resourcecrops.registry.RegisterBlockModel;
import com.mememan.resourcecrops.registry.RegisterBlockStates;
import com.mememan.resourcecrops.registry.RegisterLootTables;
import com.mememan.resourcecrops.registry.RegisterRecipe;
import com.mememan.resourcecrops.entity.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Resource Crops");
	public static final Logger DEBUG_LOGGER = LogManager.getLogger("Resource Crops - DEBUG LOGGER");
	public static void logMessage(String input){LOGGER.info(input);}
	public static void logDebugMessage(String input){if(Mods.checkDevEnv()){DEBUG_LOGGER.info(input);}}

	public static ArrayList<Block> crops = new ArrayList<>();
	public static ArrayList<Block> ores = new ArrayList<>();
	public static ArrayList<Block> machines = new ArrayList<>();
	public static ArrayList<Block> cutOutBlocks = new ArrayList<>();

	public static final RuntimeResourcePack ASSETS = RuntimeResourcePack.create(Strings.modId + ":arrp");

	public static Boolean enableExperimetalCreativeSubTabs = false;

	public static ItemGroup GROUP;
	public static ItemGroup GROUP_MAIN;
	public static ItemGroup GROUP_SEEDS;
	public static ItemGroup GROUP_ESSENCE;
	public static ItemGroup GROUP_TOOLS;
	public static ItemGroup GROUP_EXPERIMENTAL;

	public static EntityType<EntityRainbowChicken> RAINBOW_CHICKEN_ENTITY;
	public static EntityType<EntityGoldenRainbowChicken> GOLDEN_RAINBOW_CHICKEN_ENTITY;

	public static final Boolean ENABLE_SELF = true;
	
	@Override
	public void onInitialize() {
		try {
			CreateJSON.create(
				"lorem_ipsum",
				"example_mod",
				CropModelTypes.ALL,
				new String[]{
					"minecraft:block/coal_block",
					"resourcecrops:block/gradient/white",
					"resourcecrops:block/plant_types/narcissus/leaves",
					"resourcecrops:block/plant_types/narcissus/stem"
				},
				"none",
				false,
				"0x000000",
				Strings.TIER_1,
				true,
				"CRAFTING_SHAPED",
				"ITEM",
				"minecraft:coal",
				RegisterRecipe.Essence.SQUARE_HOLLOW,
				"minecraft:coal",
				8
			);
			ReadJSON.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(Mods.checkDevEnv() && enableExperimetalCreativeSubTabs){
			GROUP = new CreativeTab(new Identifier(Strings.modId, Strings.modId));
		}
		GROUP_MAIN = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "all"), () -> new ItemStack(RegisterItem.MAIN_ICON));
		GROUP_SEEDS = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "seeds"), () -> new ItemStack(RegisterItem.SEEDS_ICON));
		GROUP_ESSENCE = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "essence"), () -> new ItemStack(RegisterItem.ESSENCE_ICON));
		GROUP_TOOLS = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "tools"), () -> new ItemStack(RegisterItem.TOOLS_ICON));
		GROUP_EXPERIMENTAL = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "experimental"), () -> new ItemStack(RegisterItem.EXPERIMENTAL_ICON));
		GOLDEN_RAINBOW_CHICKEN_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier(Mods.ResourceCrops, "golden_rainbow_chicken"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityGoldenRainbowChicken::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());
		RAINBOW_CHICKEN_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier(Mods.ResourceCrops, "rainbow_chicken"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityRainbowChicken::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());
		FabricDefaultAttributeRegistry.register(RAINBOW_CHICKEN_ENTITY, EntityRainbowChicken.createMobAttributes());
		FabricDefaultAttributeRegistry.register(GOLDEN_RAINBOW_CHICKEN_ENTITY, EntityGoldenRainbowChicken.createMobAttributes());
		RegisterBlockStates.initialize();
		RegisterBlockModel.initialize();
		Crops.initialize();
		RegisterItem.initialize();
		RegisterFood.initialize();
		RegisterBlock.initialize();
		RegisterCrop.initialize();
		RegisterRecipe.initialize();
		RegisterLootTables.initialize();
		RegisterEntityLoot.initialize();
		RegisterMetal.initialize();
		RegisterJewel.initialize();
		RRPCallback.EVENT.register(a -> a.add(ASSETS));
		LOGGER.info("Server-Side has been initialized!");
	}
	
}
