
package net.yezon.theabyss.item;

import net.yezon.theabyss.itemgroup.TheAbyssToolsItemGroup;
import net.yezon.theabyss.TheAbyss;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@TheAbyss.Processor.Tag
public class AboranysShovelItem extends TheAbyss.Processor {
	@ObjectHolder("theabyss:aboranys_shovel")
	public static final Item block = null;

	public AboranysShovelItem(TheAbyss instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 16;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AboranysGemItem.block));
			}
		}, 1, -3f, new Item.Properties().group(TheAbyssToolsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("aboranys_shovel"));
	}
}
