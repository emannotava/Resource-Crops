package com.mememan.resourcecrops.lib;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {
	public static SoundEvent THURSTON = new SoundEvent(new Identifier(Strings.modId, "thurston"));
	public static final BlockSoundGroup THURSTON_BLOCK;

	static {
		THURSTON_BLOCK = new BlockSoundGroup(1.0F, 1.3F, THURSTON, THURSTON, THURSTON, THURSTON, THURSTON);
	 }
}
