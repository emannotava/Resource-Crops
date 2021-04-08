package com.mememan.resourcecrops.item;

import com.mememan.resourcecrops.lib.Sounds;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DebugItem extends Item {

	public DebugItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
		player.playSound(Sounds.THURSTON, 1.0F, 1.0F);
		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, player.getStackInHand(hand));
	}

}
