package com.mememan.resourcecrops.lib;

import net.fabricmc.loader.api.FabricLoader;

public class Mods {
	public static final String COMMON = "c";
	public static final String C = COMMON;
	public static final String Aether = "the_aether";
	public static final String AetherShort = "aether";
	public static final String AE2 = "appliedenergistics2";
	public static final String AE2Short = "ae2";
	public static final String Biomemakeover = "biomemakeover";
	public static final String BMO = Biomemakeover;
	public static final String Bewitchment = "bewitchment";
	public static final String BWM = Bewitchment;
	public static final String Astromine = "astromine";
	public static final String Astro = Astromine;
	public static final String AstromineCore = "astromine-core";
	public static final String AstroCore = AstromineCore;
	public static final String BYG = "byg"; //Oh The Biome's You'll Go
	public static final String BetterEnd = "betterend";
	public static final String BetterE = BetterEnd;
	public static final String BetterNether = "betternether";
	public static final String BetterN = BetterNether;
	public static final String Blockus = "blockus";
	public static final String Botania = "botania";
	public static final String Bota = Botania;
	public static final String Conjuring = "conjuring";
	public static final String DeepMobLearning = "dml-refabricated";
	public static final String DML = DeepMobLearning;
	public static final String IndustrialRevolution = "indrev";
	public static final String IndustrialRevolutionShort = "industrialrevolution";
	public static final String MythicMetals = "mythicmetals";
	public static final String MythMet = MythicMetals;
	public static final String ResourceCrops = Strings.modId;
	public static final String ResCrop = ResourceCrops;
	public static final String TechReborn = "techreborn";
	public static final String TechReb = TechReborn;
	public static final String Vanilla = "minecraft";
	public static final String VanillaShort = "vanilla";

	public static final Boolean checkMod(String modName) {
		return FabricLoader.getInstance().isModLoaded(modName);
	}
	public static final Boolean checkDevEnv() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}
}
