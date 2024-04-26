package net.diahera.sandwichcraft.item;

import net.diahera.sandwichcraft.SandwichCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SandwichCraft.MOD_ID);

    public static final RegistryObject<Item> CHICKEN_SANDWICH = ITEMS.register("chicken_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_SANDWICH)));

    public static final RegistryObject<Item> FRIED_EGG =ITEMS.register("fried_egg.json",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_EGG)));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
