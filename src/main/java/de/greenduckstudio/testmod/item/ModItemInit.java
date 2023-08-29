package de.greenduckstudio.testmod.item;


import de.greenduckstudio.testmod.Main;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> PHOENIX_FEATHER = ITEMS.register("phoenix_feather",
            () -> new Item(new Item.Properties()
                    .stacksTo(4)
                    .rarity(Rarity.create("MAGICAL", ChatFormatting.LIGHT_PURPLE))));

    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.create("MAGICAL", ChatFormatting.LIGHT_PURPLE))
                    .fireResistant()
                    .durability(40)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
