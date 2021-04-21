package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;
import com.mememan.resourcecrops.lib.tex.VanillaTex;

import static com.mememan.resourcecrops.lib.ingredient.VanillaIngredient.*;

public class Vanilla {
	public static void init(){
		if(Mods.checkMod(Mods.Vanilla)==true){
			RegisterCrop.addCrop(Mods.VanillaShort, "acacia", Crops.ACACIA, Crops.ACACIA_ITEM, new String[]{VanillaTex.LOG_ACACIA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{ACACIA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "basalt", Crops.BASALT, Crops.BASALT_ITEM, new String[]{VanillaTex.BASALT}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BASALT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "birch", Crops.BIRCH, Crops.BIRCH_ITEM, new String[]{VanillaTex.LOG_BIRCH}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{BIRCH_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "blackstone", Crops.BLACKSTONE, Crops.BLACKSTONE_ITEM, new String[]{VanillaTex.BLACKSTONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLACKSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "blaze", Crops.BLAZE, Crops.BLAZE_ITEM, new String[]{VanillaTex.BLAZE, ResourceCropsTex.GRADIENT_ORANGE, VanillaTex.BLAZE_LEAVES, VanillaTex.BLAZE_STEM}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLAZE_ROD, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "brain_coral", Crops.BRAIN_CORAL, Crops.BRAIN_CORAL_ITEM, new String[]{VanillaTex.BRAIN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRAIN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "bubble_coral", Crops.BUBBLE_CORAL, Crops.BUBBLE_CORAL_ITEM, new String[]{VanillaTex.BUBBLE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BUBBLE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "coal", Crops.COAL, Crops.COAL_ITEM, new String[]{VanillaTex.COAL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{COAL, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "creeper", Crops.CREEPER, Crops.CREEPER_ITEM, new String[]{VanillaTex.CREEPER}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GUNPOWDER, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "crimson", Crops.CRIMSON, Crops.CRIMSON_ITEM, new String[]{VanillaTex.LOG_CRIMSON}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{CRIMSON_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dark_oak", Crops.DARK_OAK, Crops.DARK_OAK_ITEM, new String[]{VanillaTex.LOG_DARK_OAK}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{DARK_OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_brain_coral", Crops.DEAD_BRAIN_CORAL, Crops.DEAD_BRAIN_CORAL_ITEM, new String[]{VanillaTex.DEAD_BRAIN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_BRAIN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_bubble_coral", Crops.DEAD_BUBBLE_CORAL, Crops.DEAD_BUBBLE_CORAL_ITEM, new String[]{VanillaTex.DEAD_BUBBLE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_BUBBLE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_fire_coral", Crops.DEAD_FIRE_CORAL, Crops.DEAD_FIRE_CORAL_ITEM, new String[]{VanillaTex.DEAD_FIRE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_FIRE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_horn_coral", Crops.DEAD_HORN_CORAL, Crops.DEAD_HORN_CORAL_ITEM, new String[]{VanillaTex.DEAD_HORN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_HORN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dead_tube_coral", Crops.DEAD_TUBE_CORAL, Crops.DEAD_TUBE_CORAL_ITEM, new String[]{VanillaTex.DEAD_TUBE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DEAD_TUBE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "diamond", Crops.DIAMOND, Crops.DIAMOND_ITEM, new String[]{VanillaTex.DIAMOND_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DIAMOND, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dirt", Crops.DIRT, Crops.DIRT_ITEM, new String[]{VanillaTex.DIRT}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DIRT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "dragon_egg", Crops.DRAGON_EGG, Crops.DRAGON_EGG_ITEM, new String[]{VanillaTex.DRAGON_EGG}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGON_EGG, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "emerald", Crops.EMERALD, Crops.EMERALD_ITEM, new String[]{VanillaTex.EMERALD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{EMERALD, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "end", Crops.END, Crops.END_ITEM, new String[]{VanillaTex.END_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_STONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "enderman", Crops.ENDERMAN, Crops.ENDERMAN_ITEM, new String[]{VanillaTex.ENDERMAN}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENDER_PEARL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "fire_coral", Crops.FIRE_CORAL, Crops.FIRE_CORAL_ITEM, new String[]{VanillaTex.FIRE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FIRE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "ghast", Crops.GHAST, Crops.GHAST_ITEM, new String[]{VanillaTex.GHAST}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GHAST_TEAR, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "glass", Crops.GLASS, Crops.GLASS_ITEM, new String[]{VanillaTex.GLASS}, CropModelTypes.ALL, new Boolean[]{false,false}, new String[]{"", ""}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "glowstone", Crops.GLOWSTONE, Crops.GLOWSTONE_ITEM, new String[]{VanillaTex.GLOWSTONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GLOWSTONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "gold", Crops.GOLD, Crops.GOLD_ITEM, new String[]{VanillaTex.GOLD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GOLD_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "horn_coral", Crops.HORN_CORAL, Crops.HORN_CORAL_ITEM, new String[]{VanillaTex.HORN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HORN_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "iron", Crops.IRON, Crops.IRON_ITEM, new String[]{VanillaTex.IRON_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{IRON_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "jungle", Crops.JUNGLE, Crops.JUNGLE_ITEM, new String[]{VanillaTex.LOG_JUNGLE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{JUNGLE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "lapis", Crops.LAPIS, Crops.LAPIS_ITEM, new String[]{VanillaTex.LAPIS_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LAPIS_LAZULI, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether", Crops.NETHER, Crops.NETHER_ITEM, new String[]{VanillaTex.NETHERRACK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHERRACK, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "nether_star", Crops.NETHER_STAR, Crops.NETHER_STAR_ITEM, new String[]{VanillaTex.BEACON}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHER_STAR, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "netherite", Crops.NETHERITE, Crops.NETHERITE_ITEM, new String[]{VanillaTex.NETHERITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NETHERITE_INGOT, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "oak", Crops.OAK, Crops.OAK_ITEM, new String[]{VanillaTex.LOG_OAK}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "obsidian", Crops.OBSIDIAN, Crops.OBSIDIAN_ITEM, new String[]{VanillaTex.OBSIDIAN}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{OBSIDIAN, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "phantom", Crops.PHANTOM, Crops.PHANTOM_ITEM, new String[]{VanillaTex.PHANTOM}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PHANTOM_MEMBRANE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "prismarine", Crops.PRISMARINE, Crops.PRISMARINE_ITEM, new String[]{VanillaTex.PRISMARINE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PRISMARINE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "quartz", Crops.QUARTZ, Crops.QUARTZ_ITEM, new String[]{VanillaTex.QUARTZ_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "redstone", Crops.REDSTONE, Crops.REDSTONE_ITEM, new String[]{VanillaTex.REDSTONE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{REDSTONE_DUST, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "sand", Crops.SAND, Crops.SAND_ITEM, new String[]{VanillaTex.SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "skeleton", Crops.SKELETON, Crops.SKELETON_ITEM, new String[]{VanillaTex.SKELETON}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "spruce", Crops.SPRUCE, Crops.SPRUCE_ITEM, new String[]{VanillaTex.LOG_SPRUCE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{SPRUCE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "stone", Crops.STONE, Crops.STONE_ITEM, new String[]{VanillaTex.STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "tube_coral", Crops.TUBE_CORAL, Crops.TUBE_CORAL_ITEM, new String[]{VanillaTex.TUBE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TUBE_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "warped", Crops.WARPED, Crops.WARPED_ITEM, new String[]{VanillaTex.LOG_WARPED}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{WARPED_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "wither_skeleton", Crops.WITHER_SKELETON, Crops.WITHER_SKELETON_ITEM, new String[]{VanillaTex.WITHER_SKELETON}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WITHER_SKELETON_SKULL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.VanillaShort, "zombie", Crops.ZOMBIE, Crops.ZOMBIE_ITEM, new String[]{VanillaTex.ZOMBIE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ROTTEN_FLESH, Strings.Tier3}, true);
		}
	}
}
