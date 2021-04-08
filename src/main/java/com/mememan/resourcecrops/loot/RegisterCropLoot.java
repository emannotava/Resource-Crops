package com.mememan.resourcecrops.loot;

//import java.lang.reflect.Array;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class RegisterCropLoot {
	public static void addToLootTable(Block item, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(0, 5));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
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
	
	public static void addToLootTable(Block item, float changeForRollToOccur, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(0, 5));
				builder.conditionally(RandomChanceLootCondition.builder(changeForRollToOccur));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}

	public static void addToLootTable(Item item, float changeForRollToOccur, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(0, 5));
				builder.conditionally(RandomChanceLootCondition.builder(changeForRollToOccur));
				builder.with(ItemEntry.builder(item));
				supplier.pool(builder);
			}
		});
	}
	
	public static void addToLootTable(Block item, int minRoll, int maxRoll, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(minRoll, maxRoll));
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
	
	public static void addToLootTable(Block itemStack, int minRoll, int maxRoll, float changeForRollToOccur, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(minRoll, maxRoll));
				builder.conditionally(RandomChanceLootCondition.builder(changeForRollToOccur));
				builder.with(ItemEntry.builder(itemStack));
				supplier.pool(builder);
			}
		});
	}
	public static void addToLootTable(Item itemStack, int minRoll, int maxRoll, float changeForRollToOccur, Identifier identifier) {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (identifier.equals(id)) {
				FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
				builder.rolls(UniformLootTableRange.between(minRoll, maxRoll));
				builder.conditionally(RandomChanceLootCondition.builder(changeForRollToOccur));
				builder.with(ItemEntry.builder(itemStack));
				supplier.pool(builder);
			}
		});
	}
}