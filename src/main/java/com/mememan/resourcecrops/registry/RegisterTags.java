package com.mememan.resourcecrops.registry;

import net.devtech.arrp.json.tags.JTag;
import net.minecraft.util.Identifier;

import static com.mememan.resourcecrops.Main.ASSETS;

public class RegisterTags {

	public static void addToTag(String item, String path){
		ASSETS.addTag(identifyItem(item), identifyItemTag(path));
		ASSETS.addTag(identifyTagTag(item), identifyItemTag(path));
	}

	public static Identifier identifyItem(String item) {
		String[] MEOW = item.split(":");
		return new Identifier(MEOW[0], MEOW[1]);
	}

	public static JTag identifyItemTag(String itemTag) {
		String[] MEOW = itemTag.split(":");
		return JTag.tag().add(new Identifier(MEOW[0], MEOW[1]));
	}

	public static Identifier identifyTagTag(String tagTag) {
		String[] MEOW = tagTag.split(":");
		return new Identifier(MEOW[0], MEOW[1] + "s");
	}

}
