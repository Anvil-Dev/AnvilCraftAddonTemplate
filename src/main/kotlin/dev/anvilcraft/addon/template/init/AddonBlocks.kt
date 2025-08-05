package dev.anvilcraft.addon.template.init

import com.tterrag.registrate.util.entry.BlockEntry
import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.Companion.REGISTRATE
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour

class AddonBlocks {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_BLOCK: BlockEntry<Block?> = REGISTRATE
            .block<Block?>(
                "example_block"
            ) { properties: BlockBehaviour.Properties -> Block(properties) }
            .simpleItem()
            .register()

        fun register() {
        }
    }
}