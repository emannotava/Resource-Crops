package com.mememan.resourcecrops.item;
import com.mememan.resourcecrops.lib.Sounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemIngot extends Item {

	public ItemIngot(Settings settings) {
		super(settings);
		settings.group(ItemGroup.MATERIALS);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
		player.playSound(Sounds.THURSTON, 1.0F, 1.0F);
		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, player.getStackInHand(hand));
	}

}