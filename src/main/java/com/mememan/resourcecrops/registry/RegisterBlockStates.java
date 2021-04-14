package com.mememan.resourcecrops.registry;

import static com.mememan.resourcecrops.Main.assets;

import com.mememan.resourcecrops.lib.Strings;

import net.devtech.arrp.json.blockstate.JBlockModel;
import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.blockstate.JVariant;
import net.minecraft.util.Identifier;

public class RegisterBlockStates {
	public static void initialize(){
		
	}

	public static void addBlockstate(String modName, String cropName, String cropModelType){
		JState Fred = JState.state(
			cropVariant(
				JState.model("resourcecrops:block/crop_generic/crop_stage0"),
				JState.model("resourcecrops:block/crop_generic/crop_stage1"),
				JState.model("resourcecrops:block/crop_generic/crop_stage2"),
				JState.model("resourcecrops:block/crop_generic/crop_stage3"),
				JState.model("resourcecrops:block/crop_generic/crop_stage4"),
				JState.model("resourcecrops:block/crop_generic/crop_stage5"),
				JState.model("resourcecrops:block/crop_generic/crop_stage6"),
				JState.model("resourcecrops:block/templates/" + cropModelType)
			)
		);
		assets.addBlockState(Fred, new Identifier(Strings.modId, "crop_" + modName + "/" + cropName));
	}
	public static JVariant cropVariant(JBlockModel age0, JBlockModel age1, JBlockModel age2, JBlockModel age3, JBlockModel age4, JBlockModel age5, JBlockModel age6, JBlockModel age7){
		JVariant variant = new JVariant();
		variant.put("age=0", age0)
			.put("age=1", age1)
			.put("age=2", age2)
			.put("age=3", age3)
			.put("age=4", age4)
			.put("age=5", age5)
			.put("age=6", age6)
			.put("age=7", age7);
		return variant;
	}

}
