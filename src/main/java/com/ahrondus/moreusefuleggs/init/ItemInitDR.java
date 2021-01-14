package com.ahrondus.moreusefuleggs.init;

import com.ahrondus.moreusefuleggs.MoreUsefulEggs;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitDR {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreUsefulEggs.MOD_ID);
	
	public static final RegistryObject<Item> fried_eggs = ITEMS.register("fried_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.5f).build())));	
	public static final RegistryObject<Item> scrambled_eggs = ITEMS.register("scrambled_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.5f).build())));	
	public static final RegistryObject<Item> sliced_bread = ITEMS.register("sliced_bread",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(1.0f).build())));	
	public static final RegistryObject<Item> toast_bread = ITEMS.register("toast_bread",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(1.0f).build())));	
	public static final RegistryObject<Item> egg_bowl_uncooked = ITEMS.register("egg_bowl_uncooked",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(1.0f).effect(new EffectInstance(Effects.NAUSEA, 150, 1), 0.35f).build())));	
	public static final RegistryObject<Item> cheese_wedge = ITEMS.register("cheese_wedge",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.5f).build())));	
	public static final RegistryObject<Item> scrambledcheese_eggs = ITEMS.register("scrambledcheese_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.5f).build())));	
	public static final RegistryObject<Item> scrambledcheesebeef_eggs = ITEMS.register("scrambledcheesebeef_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.75f).build())));	
	public static final RegistryObject<Item> scrambledcheesepork_eggs = ITEMS.register("scrambledcheesepork_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.75f).build())));	
	public static final RegistryObject<Item> scrambledcheesechicken_eggs = ITEMS.register("scrambledcheesechicken_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.75f).build())));	
	public static final RegistryObject<Item> toastfried_eggs = ITEMS.register("toastfried_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.75f).build())));	
	public static final RegistryObject<Item> toastscrambled_eggs = ITEMS.register("toastscrambled_eggs",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.75f).build())));
}
