package net.jota.uselesadditions.item;

import net.jota.uselesadditions.UselessAdditions;
import net.jota.uselesadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UselessAdditions.MODID);

    public static final Supplier<CreativeModeTab> USELESS_ADDITIONS_ITEMS_TAB = CREATIVE_MODE_TAB.register("useless_additions_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.PLATINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.uselesadditions.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PLATINUM_INGOT);
                        output.accept(ModItems.RAW_PLATINUM);
                        output.accept(ModItems.BESPINIUM_INGOT);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> USELESS_ADDITIONS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("useless_additions_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModBlocks.SLIME_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(UselessAdditions.MODID, "useless_additions_items_tab"))
                    .title(Component.translatable("creativetab.uselesadditions.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SLIME_ORE);
                        output.accept(ModBlocks.PLATINUM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
