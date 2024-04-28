package net.diahera.sandwichcraft.item;

import net.diahera.sandwichcraft.SandwichCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SandwichCraft.MOD_ID);

    public static final RegistryObject<Item> CHICKEN_SANDWICH = ITEMS.register("chicken_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_SANDWICH)));

    public static final RegistryObject<Item> FRIED_EGG =ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_EGG)));

    public static final RegistryObject<Item> TOAST =ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoods.TOAST)));

    public static final RegistryObject<Item> CRUST =ITEMS.register("crust",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CRUST_SWORD = ITEMS.register("crust_sword",
            () -> new SwordItem(ModToolTiers.CRUST, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_PICKAXE = ITEMS.register("crust_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRUST, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_AXE = ITEMS.register("crust_axe",
            () -> new AxeItem(ModToolTiers.CRUST, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_SHOVEL = ITEMS.register("crust_shovel",
            () -> new ShovelItem(ModToolTiers.CRUST, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_HOE = ITEMS.register("crust_hoe",
            () -> new HoeItem(ModToolTiers.CRUST, 0, 0, new Item.Properties()));


    public static final RegistryObject<Item> CRUST_HELMET = ITEMS.register("crust_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRUST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_CHESTPLATE = ITEMS.register("crust_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRUST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_LEGGINGS = ITEMS.register("crust_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRUST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUST_BOOTS = ITEMS.register("crust_boots",
            () -> new ArmorItem(ModArmorMaterials.CRUST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
