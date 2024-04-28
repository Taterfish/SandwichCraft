package net.diahera.sandwichcraft.item;

import net.diahera.sandwichcraft.SandwichCraft;
import net.diahera.sandwichcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SandwichCraft.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.CHICKEN_SANDWICH.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FRIED_EGG.get());
                        pOutput.accept(ModItems.CHICKEN_SANDWICH.get());
                        pOutput.accept(ModItems.TOAST.get());
                        pOutput.accept(ModItems.CRUST.get());

                        pOutput.accept(ModBlocks.CRUST_BLOCK.get());
                        pOutput.accept(ModBlocks.SANDWICH_STATION.get());

                        pOutput.accept(ModItems.CRUST_SWORD.get());
                        pOutput.accept(ModItems.CRUST_PICKAXE.get());
                        pOutput.accept(ModItems.CRUST_AXE.get());
                        pOutput.accept(ModItems.CRUST_HOE.get());
                        pOutput.accept(ModItems.CRUST_SHOVEL.get());

                        pOutput.accept(ModItems.CRUST_HELMET.get());
                        pOutput.accept(ModItems.CRUST_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUST_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUST_BOOTS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
