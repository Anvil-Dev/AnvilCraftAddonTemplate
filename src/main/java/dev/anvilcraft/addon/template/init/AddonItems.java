package dev.anvilcraft.addon.template.init;

import dev.anvilcraft.lib.v2.registrum.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.REGISTRUM;

public class AddonItems {
    static {
        REGISTRUM.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.getKey());
    }

    public static final ItemEntry<Item> EXAMPLE_ITEM = REGISTRUM
        .item("example_item", Item::new)
        .register();

    public static void register() {
    }
}
