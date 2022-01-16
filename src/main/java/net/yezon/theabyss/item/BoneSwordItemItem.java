
package net.yezon.theabyss.item;

import net.yezon.theabyss.itemgroup.TheAbyssWeaponsItemGroup;
import net.yezon.theabyss.TheAbyss;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@TheAbyss.Processor.Tag
public class BoneSwordItemItem extends TheAbyss.Processor {
	@ObjectHolder("theabyss:bone_sword_item")
	public static final Item block = null;

	public BoneSwordItemItem(TheAbyss instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 64;
			}

			public float getEfficiency() {
				return 40f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 50;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FixedBoneItem.block));
			}
		}, 3, -1.9f, new Item.Properties().group(TheAbyssWeaponsItemGroup.tab)) {
		}.setRegistryName("bone_sword_item"));
	}
}
