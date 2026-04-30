package net.amy.timeblades.datagen;


import net.amy.timeblades.item.CompleteTimebladeItem;
import net.amy.timeblades.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerCompleteTimebladeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.KRUX_TIME_BLADE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.CHRONOSTEEL_INGOT), category, result
                )
                .criterion("has_chronosteel_ingot", conditionsFromItem(ModItems.CHRONOSTEEL_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }

    @Override
    public void generate(RecipeExporter exporter) {

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_TIME_BLADE)
                .pattern("A A")
                .pattern("ANA")
                .pattern(" N ")
                .input('A', ModItems.CHRONOSTEEL_INGOT)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);*/
        offerCompleteTimebladeRecipe(exporter, ModItems.ACRONIX_TIME_BLADE, RecipeCategory.COMBAT, ModItems.COMPLETE_TIME_BLADE);



    }

}