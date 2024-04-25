package net.diahera.tutorialmod.item;

import net.diahera.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Chicken_Sandwich = ITEMS.register("Chicken_Sandwich",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
