package com.mememan.resourcecrops.config.entry;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

public class MainConfigEntry {

	@ConfigEntry.Gui.PrefixText
	@ConfigEntry.Gui.CollapsibleObject
	public MainOptions MainOptions = new MainOptions();

	public static class MainOptions {
		@Comment(value = "\nIf this menu entry appears, then the config test succeeded\nthis does nothing yet btw")
		public boolean Generate = true;
	}
}