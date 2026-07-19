package dev.anvilcraft.addon.template.init

import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.Companion.REGISTRUM
import dev.anvilcraft.lib.v2.registrum.util.entry.BlockEntry
import net.minecraft.world.level.block.Block

class AddonBlocks {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRUM.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_BLOCK: BlockEntry<Block> = REGISTRUM
            .block("example_block") { Block(it) }
            .simpleItem()
            .register()

        fun register() {
        }
    }
}