package com.ahrondus.moreusefuleggs.init;

import com.ahrondus.moreusefuleggs.MoreUsefulEggs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MoreUsefulEggs.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MoreUsefulEggs.MOD_ID)
public class iteminit 
{
	public static final Item fried_eggs = null;
	public static final Item scrambled_eggs = null;
	public static final Item sliced_bread = null;
	public static final Item toast_bread = null;
	public static final Item egg_bowl_uncooked = null;
	public static final Item cheese_wedge = null;
	public static final Item scrambledcheese_eggs = null;
	public static final Item scrambledcheesebeef_eggs= null;
	public static final Item scrambledcheesepork_eggs= null;
	public static final Item scrambledcheesechicken_eggs= null;
	public static final Item toastfried_eggs= null;
	public static final Item toastscrambled_eggs= null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.5f).build())).setRegistryName("fried_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.67f).build())).setRegistryName("scrambled_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.5f).build())).setRegistryName("sliced_bread"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(1.5f).build())).setRegistryName("toast_bread"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.5f).effect(new EffectInstance(Effects.NAUSEA, 200, 1), 0.35f).build())).setRegistryName("egg_bowl_uncooked"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.75f).build())).setRegistryName("cheese_wedge"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.75f).build())).setRegistryName("scrambledcheese_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.75f).build())).setRegistryName("scrambledcheesebeef_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.75f).build())).setRegistryName("scrambledcheesepork_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.75f).build())).setRegistryName("scrambledcheesechicken_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.75f).build())).setRegistryName("toastfried_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.75f).build())).setRegistryName("toastscrambled_eggs"));
	}
}
