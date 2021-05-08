package com.mememan.resourcecrops.config;

import com.mememan.resourcecrops.lib.Mods;

public class ConfigDevEnv {
	public static class MOD_SUPPORT{
		public static final Boolean ALL = true;

		public static final Boolean ResourceCrops = returnBool(true);
		public static final Boolean Vanilla = returnBool(true);
		public static final Boolean Common = returnBool(true);
		public static final Boolean AE2 = returnBool(true);
		public static final Boolean Aether = returnBool(true);
		public static final Boolean Astromine = returnBool(true);
		public static final Boolean BetterEnd = returnBool(true);
		public static final Boolean Bewitchment = returnBool(true);
		public static final Boolean Biomemakeover = returnBool(true);
		public static final Boolean Blockus = returnBool(true);
		public static final Boolean Botania = returnBool(true);
		public static final Boolean BYG = returnBool(true);
		public static final Boolean Conjuring = returnBool(true);
		public static final Boolean DeepMobLearning = returnBool(true);
		public static final Boolean IndustrialRevolution = returnBool(true);
		public static final Boolean MythicMetals = returnBool(true);
		public static final Boolean TechReborn = returnBool(true);
	}

	public static Boolean returnBool(Boolean input){
		if(Mods.checkDevEnv()){
			return input;
		}else if(MOD_SUPPORT.ALL==false){
			return false;
		}else{
			return true;
		}
	}
}
