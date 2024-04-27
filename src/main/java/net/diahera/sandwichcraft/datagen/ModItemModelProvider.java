package net.diahera.sandwichcraft.datagen;

import net.diahera.sandwichcraft.SandwichCraft;
import net.diahera.sandwichcraft.block.ModBlocks;
import net.diahera.sandwichcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
public class ModItemModelProvider extends ItemModelProvider {
        public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
            super(output, SandwichCraft.MOD_ID, existingFileHelper);
        }

    @Override
    protected void registerModels() {
       simpleItem(ModItems.FRIED_EGG);
       simpleItem(ModItems.CHICKEN_SANDWICH);
       simpleItem(ModItems.TOAST);


    }



    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SandwichCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
