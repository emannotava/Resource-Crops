package com.mememan.resourcecrops.registry;

import net.devtech.arrp.json.loot.JLootTable;
import net.minecraft.util.Identifier;

// import net.minecraft.util.Identifier;
import static net.devtech.arrp.json.loot.JLootTable.*;

import com.google.gson.JsonObject;
// import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Strings;

import static com.mememan.resourcecrops.Main.assets;

public class RegisterLootTables {

	public static void initialize(){
		// assets.addLootTable(identifier, table)
		// lootTableCrop(new Identifier("certus"), 7, new Identifier("certus"), "certus", Mods.AE2Short);
		// addLootTable("certus", Mods.AE2Short, Strings.defaultCropAge);
		// addLootTable("rune_mana", Mods.Botania, 79);
		// addLootTable("rune_water", Mods.Botania, 79);
		// addLootTable("rune_air", Mods.Botania, 79);
		// addLootTable("rune_fire", Mods.Botania, 79);
		// addLootTable("rune_earth", Mods.Botania, 79);
		// addLootTable("rune_spring", Mods.Botania, 79);
		// addLootTable("rune_autumn", Mods.Botania, 79);
		// addLootTable("rune_winter", Mods.Botania, 79);
		// addLootTable("rune_summer", Mods.Botania, 79);
		// addLootTable("rune_envy", Mods.Botania, 79);
		// addLootTable("rune_lust", Mods.Botania, 79);
		// addLootTable("rune_sloth", Mods.Botania, 79);
		// addLootTable("rune_gluttony", Mods.Botania, 79);
		// addLootTable("rune_pride", Mods.Botania, 79);
		// addLootTable("rune_wrath", Mods.Botania, 79);
		// addLootTable("rune_greed", Mods.Botania, 79);
		// lootTableCrop(new Identifier("certus_charged"), 7, new Identifier("certus_charged"), "certus_charged", Mods.AE2Short);
		// lootTableCrop(new Identifier("certus_pure"), 7, new Identifier("certus_pure"), "certus_pure", Mods.AE2Short);
		// lootTableCrop(new Identifier("fluix"), 7, new Identifier("fluix"), "fluix", Mods.AE2Short);
		// lootTableCrop(new Identifier("fluix_pure"), 7, new Identifier("fluix_pure"), "fluix_pure", Mods.AE2Short);
		// lootTableCrop(new Identifier("quartz_pure"), 7, new Identifier("quartz_pure"), "quartz_pure", Mods.AE2Short);
	}

	public static void addLootTable(String name, String modId, int maxAge){
		addLootTable(name, modId, modId, maxAge);
	}

	public static void addLootTable(String name, String modId, String modIdShort, int maxAge){
		JLootTable lootTable;
		lootTable = lootTableCrop(name, maxAge, name, name, modIdShort);
		assets.addLootTable(new Identifier(Strings.modId, "blocks/crop_" + modIdShort + "/" + name), lootTable);
	}


	public static JLootTable lootTableRegular(String itemId) {
		return JLootTable.loot("minecraft:block").pool(
			pool().rolls(0).entry(
				entry().type("minecraft:item").name(itemId)
			).condition(
				predicate("minecraft:survives_explosion")
			)
		);
	}

	public static JLootTable lootTableCrop(String cropBlock, int maxAge, String seedItem, String outputEssence, String modId) {
        JsonObject properties = new JsonObject();
        properties.addProperty("age", maxAge);

        JsonObject blockState = new JsonObject();
        blockState.addProperty("block", Strings.modId + ":crop_" + modId + "/" + cropBlock);
        blockState.add("properties", properties);

		return JLootTable.loot("minecraft:block").pool(
			pool().rolls(0).entry(
				entry().type("minecraft:item").condition(
					predicate("minecraft:block_state_property"
				).set(blockState)).name(Strings.modId + ":essence_" + modId + "/" + outputEssence)
			)
		).pool(
			pool().rolls(1).entry(
				entry().type("minecraft:item").name(Strings.modId + ":crop_" + modId + "/" + seedItem)
			)
		);
    }
}
