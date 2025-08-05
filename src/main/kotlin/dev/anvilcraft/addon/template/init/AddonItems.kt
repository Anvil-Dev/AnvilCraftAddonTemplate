package dev.anvilcraft.addon.template.init

import com.tterrag.registrate.util.entry.ItemEntry
import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.Companion.REGISTRATE
import net.minecraft.world.item.Item

class AddonItems {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_ITEM: ItemEntry<Item> = REGISTRATE
            .item("example_item") { properties: Item.Properties -> Item(properties) }
            .register()

        fun register() {
        }
    }
}