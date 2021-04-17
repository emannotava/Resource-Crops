package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.VanillaIngredient.*;

public class Vanilla {
	public static void init(){
		if(Mods.checkMod(Mods.Vanilla)==true){
			RegisterCrop.addCrop(Mods.VanillaShort, "acacia", Crops.ACACIA, Crops.ACACIA_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ACACIA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "basalt", Crops.BASALT, Crops.BASALT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BASALT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "birch", Crops.BIRCH, Crops.BIRCH_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BIRCH_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "blackstone", Crops.BLACKSTONE, Crops.BLACKSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLACKSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "blaze", Crops.BLAZE, Crops.BLAZE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLAZE_ROD, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "brain_coral", Crops.BRAIN_CORAL, Crops.BRAIN_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRAIN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "bubble_coral", Crops.BUBBLE_CORAL, Crops.BUBBLE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BUBBLE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "coal", Crops.COAL, Crops.COAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{COAL, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "creeper", Crops.CREEPER, Crops.CREEPER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GUNPOWDER, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "crimson", Crops.CRIMSON, Crops.CRIMSON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CRIMSON_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dark_oak", Crops.DARK_OAK, Crops.DARK_OAK_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DARK_OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_brain_coral", Crops.DEAD_BRAIN_CORAL, Crops.DEAD_BRAIN_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_BRAIN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_bubble_coral", Crops.DEAD_BUBBLE_CORAL, Crops.DEAD_BUBBLE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_BUBBLE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_fire_coral", Crops.DEAD_FIRE_CORAL, Crops.DEAD_FIRE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_FIRE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_horn_coral", Crops.DEAD_HORN_CORAL, Crops.DEAD_HORN_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_HORN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_tube_coral", Crops.DEAD_TUBE_CORAL, Crops.DEAD_TUBE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_TUBE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "diamond", Crops.DIAMOND, Crops.DIAMOND_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DIAMOND, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dirt", Crops.DIRT, Crops.DIRT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DIRT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dragon_egg", Crops.DRAGON_EGG, Crops.DRAGON_EGG_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGON_EGG, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "emerald", Crops.EMERALD, Crops.EMERALD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{EMERALD, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "end", Crops.END, Crops.END_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_STONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "enderman", Crops.ENDERMAN, Crops.ENDERMAN_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENDER_PEARL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "fire_coral", Crops.FIRE_CORAL, Crops.FIRE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FIRE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "ghast", Crops.GHAST, Crops.GHAST_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GHAST_TEAR, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "glass", Crops.GLASS, Crops.GLASS_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GLASS, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "glowstone", Crops.GLOWSTONE, Crops.GLOWSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GLOWSTONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "gold", Crops.GOLD, Crops.GOLD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GOLD_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "horn_coral", Crops.HORN_CORAL, Crops.HORN_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HORN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "iron", Crops.IRON, Crops.IRON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{IRON_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "jungle", Crops.JUNGLE, Crops.JUNGLE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{JUNGLE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "lapis", Crops.LAPIS, Crops.LAPIS_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LAPIS_LAZULI, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether", Crops.NETHER, Crops.NETHER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHERRACK, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether_star", Crops.NETHER_STAR, Crops.NETHER_STAR_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHER_STAR, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "netherite", Crops.NETHERITE, Crops.NETHERITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHERITE_INGOT, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "oak", Crops.OAK, Crops.OAK_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "obsidian", Crops.OBSIDIAN, Crops.OBSIDIAN_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{OBSIDIAN, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "phantom_membrane", Crops.PHANTOM_MEMBRANE, Crops.PHANTOM_MEMBRANE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PHANTOM_MEMBRANE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "prismarine", Crops.PRISMARINE, Crops.PRISMARINE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PRISMARINE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "quartz", Crops.QUARTZ, Crops.QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "redstone", Crops.REDSTONE, Crops.REDSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{REDSTONE_DUST, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "sand", Crops.SAND, Crops.SAND_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "skeleton", Crops.SKELETON, Crops.SKELETON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "spruce", Crops.SPRUCE, Crops.SPRUCE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SPRUCE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "stone", Crops.STONE, Crops.STONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "tube_coral", Crops.TUBE_CORAL, Crops.TUBE_CORAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TUBE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "warped", Crops.WARPED, Crops.WARPED_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WARPED_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "wither_skeleton", Crops.WITHER_SKELETON, Crops.WITHER_SKELETON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WITHER_SKELETON_SKULL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "zombie", Crops.ZOMBIE, Crops.ZOMBIE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ROTTEN_FLESH, Strings.Tier3}, true);
		}
	}
}
