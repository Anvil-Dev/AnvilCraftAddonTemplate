package dev.anvilcraft.addon.template.init

import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.Companion.REGISTRUM
import dev.anvilcraft.lib.v2.registrum.util.entry.ItemEntry
import net.minecraft.world.item.Item

class AddonItems {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRUM.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_ITEM: ItemEntry<Item> = REGISTRUM
            .item("example_item") { Item(it) }
            .register()

        fun register() {
        }
    }
}