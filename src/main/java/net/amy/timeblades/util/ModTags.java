package net.amy.timeblades.util;

import net.amy.timeblades.Timeblades;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CHRONOSTEEL_TOOL = createTag("needs_chronosteel_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHRONOSTEEL_TOOL = createTag("incorrect_for_chronosteel_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Timeblades.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Timeblades.MOD_ID, name));
        }
    }
}
