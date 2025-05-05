package net.jota.uselesadditions.item;

import net.jota.uselesadditions.UselessAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UselessAdditions.MODID);

    public static final DeferredItem<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
            ()-> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
