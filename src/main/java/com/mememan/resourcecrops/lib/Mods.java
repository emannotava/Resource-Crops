package com.mememan.resourcecrops.lib;

import net.fabricmc.loader.api.FabricLoader;

public class Mods {
	public static final String COMMON = "c";
	public static final String Aether = "the_aether";
	public static final String AetherShort = "aether";
	public static final String AE2 = "appliedenergistics2";
	public static final String AE2Short = "ae2";
	public static final String Astromine = "astromine";
	public static final String AstromineCore = "astromine-core";
	public static final String BYG = "byg"; //Oh The Biome's You'll Go
	public static final String BetterEnd = "betterend";
	public static final String BetterNether = "betternether";
	public static final String Blockus = "blockus";
	public static final String Botania = "botania";
	public static final String Conjuring = "conjuring";
	public static final String IndustrialRevolution = "indrev";
	public static final String IndustrialRevolutionShort = "industrialrevolution";
	public static final String MythicMetals = "mythicmetals";
	public static final String ResourceCrops = "resourcecrops";
	public static final String TechReborn = "techreborn";
	public static final String Vanilla = "minecraft";
	public static final String VanillaShort = "vanilla";

	public static final Boolean checkMod(String modName) {
		return FabricLoader.getInstance().isModLoaded(modName);
	}
	public static final Boolean checkDevEnv() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}
}
