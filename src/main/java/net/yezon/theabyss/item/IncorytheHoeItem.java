
package net.yezon.theabyss.item;

import net.yezon.theabyss.itemgroup.TheAbyssToolsItemGroup;
import net.yezon.theabyss.TheAbyss;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@TheAbyss.Processor.Tag
public class IncorytheHoeItem extends TheAbyss.Processor {
	@ObjectHolder("theabyss:incorythe_hoe")
	public static final Item block = null;

	public IncorytheHoeItem(TheAbyss instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 10.5f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(IncorytheGemItem.block));
			}
		}, 0, -.2f, new Item.Properties().group(TheAbyssToolsItemGroup.tab)) {
		}.setRegistryName("incorythe_hoe"));
	}
}
