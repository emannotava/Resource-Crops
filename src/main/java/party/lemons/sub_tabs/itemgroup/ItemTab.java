package party.lemons.sub_tabs.itemgroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;

public class ItemTab
{
	private final Tag<Item> itemTag;
	private final ItemStack icon;
	private final String name;

	public ItemTab(ItemStack icon, String name, Tag<Item> itemTag)
	{
		this.itemTag = itemTag;
		this.icon = icon;
		this.name = name;
	}

	public ItemStack getIcon()
	{
		return icon;
	}

	public boolean matches(Item item)
	{
		return itemTag == null || itemTag.contains(item);
	}

	public boolean matches(ItemStack stack)
	{
		return matches(stack.getItem());
	}

	public Tag<Item> getItemTag()
	{
		return itemTag;
	}

	public String getTranslationKey()
	{
		return "subtab." + name;
	}
}