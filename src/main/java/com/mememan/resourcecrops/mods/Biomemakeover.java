package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.BiomemakeoverTex;

import static com.mememan.resourcecrops.lib.ingredient.BiomemakeoverIngredient.*;

public class Biomemakeover {
	public static void init(){
		if(Mods.checkMod(Mods.Biomemakeover)==true){
			RegisterCrop.addCrop(Mods.Biomemakeover, "ancient_oak_log", Crops.LOG_ANCIENT_OAK, Crops.LOG_ANCIENT_OAK_ITEM, new String[]{BiomemakeoverTex.LOG_ANCIENT_OAK}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_ANCIENT_OAK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "blighted_balsa_log", Crops.LOG_BLIGHTED_BALSA, Crops.LOG_BLIGHTED_BALSA_ITEM, new String[]{BiomemakeoverTex.LOG_BLIGHTED_BALSA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_BLIGHTED_BALSA, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "blighted_cobblestone", Crops.BLIGHTED_COBBLESTONE, Crops.BLIGHTED_COBBLESTONE_ITEM, new String[]{BiomemakeoverTex.BLIGHTED_COBBLESTONE},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLIGHTED_COBBLESTONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "cladded_stone", Crops.CLADDED_STONE, Crops.CLADDED_STONE_ITEM, new String[]{BiomemakeoverTex.CLADDED_STONE},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CLADDED_STONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "glowshroom_stem", Crops.GLOWSHROOM_STEM, Crops.GLOWSHROOM_STEM_ITEM, new String[]{BiomemakeoverTex.GLOWSHROOM_STEM}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GLOWSHROOM_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "illunite_block", Crops.ILLUNITE_BLOCK, Crops.ILLUNITE_BLOCK_ITEM, new String[]{BiomemakeoverTex.ILLUNITE_BLOCK},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ILLUNITE_BLOCK, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "mesmerite", Crops.MESMERITE, Crops.MESMERITE_ITEM, new String[]{BiomemakeoverTex.MESMERITE},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MESMERITE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "orange_glowshroom_block", Crops.ORANGE_GLOWSHROOM_BLOCK, Crops.ORANGE_GLOWSHROOM_BLOCK_ITEM, new String[]{BiomemakeoverTex.ORANGE_GLOWSHROOM_BLOCK},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ORANGE_GLOWSHROOM_BLOCK, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "purple_glowshroom_block", Crops.PURPLE_GLOWSHROOM_BLOCK, Crops.PURPLE_GLOWSHROOM_BLOCK_ITEM, new String[]{BiomemakeoverTex.PURPLE_GLOWSHROOM_BLOCK},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PURPLE_GLOWSHROOM_BLOCK, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "swamp_cypress_log", Crops.LOG_SWAMP_CYPRESS, Crops.LOG_SWAMP_CYPRESS_ITEM, new String[]{BiomemakeoverTex.LOG_SWAMP_CYPRESS}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_SWAMP_CYPRESS, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Biomemakeover, "willow_log", Crops.LOG_WILLOW, Crops.LOG_WILLOW_ITEM, new String[]{BiomemakeoverTex.LOG_WILLOW}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_WILLOW, Strings.Tier1}, true);
		}
	}
}
