package com.mememan.resourcecrops.config;

import com.mememan.resourcecrops.config.entry.MainConfigEntry;
import com.mememan.resourcecrops.lib.Strings;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@me.shedaniel.autoconfig.annotation.Config(name = Strings.modId + "/" + Strings.modId + "-test")
public class Config implements ConfigData {

	@ConfigEntry.Category("Overworld_Dimension")
	@ConfigEntry.Gui.CollapsibleObject
	public MainConfigEntry MainConfigEntry = new MainConfigEntry();
	
}