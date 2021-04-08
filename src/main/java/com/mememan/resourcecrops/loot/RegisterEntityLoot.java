package com.mememan.resourcecrops.loot;

//import java.lang.reflect.Array;

import com.mememan.resourcecrops.item.RegisterItem;
import com.mememan.resourcecrops.lib.Entities;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Item;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class RegisterEntityLoot {

	//private static final Identifier CREEPER_LOOT_TABLE = new Identifier("minecraft", "entities/creeper");

	public static void initialize(){
		initVanilla();
	}

	public static void initVanilla(){
		//Passive
		loopThroughArrays(RegisterItem.essence_tier_1, 1, 5, 5F, Entities.vanillaPassive);

		//Neutral
		loopThroughArrays(RegisterItem.essence_tier_1, 1, 5, 5F, Entities.vanillaNeutral);
		loopThroughArrays(RegisterItem.essence_tier_2, 1, 5, 1F, Entities.vanillaNeutral);
		
		//Hostile
		loopThroughArrays(RegisterItem.essence_tier_1, 1, 5, 5.3F, Entities.vanillaHostile);
		loopThroughArrays(RegisterItem.essence_tier_2, 1, 5, 1F, Entities.vanillaHostile);
		loopThroughArrays(RegisterItem.essence_tier_3, 1, 5, 0.1F, Entities.vanillaHostile);

		//Boss
		loopThroughArrays(RegisterItem.essence_tier_5, Entities.vanillaBoss);
		loopThroughArrays(RegisterItem.essence_tier_6, 3, 9, 0.1F, Entities.vanillaBoss);
	}


	public static void loopThroughArrays(Item item, Identifier array[]) {
		for (int i=0;i<array.length;i++) {
			addToLootTable(item, array[i]);
		}
	}
	public static void loopThroughArrays(Item item, float floatValue, Identifier array[]) {
		for (int i=0;i<array.length;i++) {
			addToLootTable(item, floatValue, array[i]);
		}
	}
	public static void loopThroughArrays(Item item, int minRoll, int maxRoll, Identifier array[]) {
		for (int i=0;i<array.length;i++) {
			addToLootTable(item, minRoll, maxRoll, array[i]);
		}
	}
	public static void loopThroughArrays(Item item, int minRoll, int maxRoll, float floatValue, Identifier array[]) {
		for (int i=0;i<array.length;i++) {
			addToLootTable(item, minRoll, maxRoll, floatValue, array[i]);
		}
	}



	public static void addToLootTable(Item item, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(0, 5));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}

	public static void addToLootTable(Item item, float changeForRollToOccur, Identifier identifier) {

		float localFloat = ((1.0F / 100F) * changeForRollToOccur);
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(0, 5));
				builder.conditionally(RandomChanceLootCondition.builder(localFloat));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}

	public static void addToLootTable(Item item, int minRoll, int maxRoll, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(minRoll, maxRoll));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}

	public static void addToLootTable(Item item, int minRoll, int maxRoll, float changeForRollToOccur, Identifier identifier) {
		float localFloat = ((1.0F / 100F) * changeForRollToOccur);
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(minRoll, maxRoll));
				builder.conditionally(RandomChanceLootCondition.builder(localFloat));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}
}