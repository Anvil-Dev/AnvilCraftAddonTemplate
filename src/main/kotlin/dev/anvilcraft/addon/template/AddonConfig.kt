package dev.anvilcraft.addon.template

import dev.anvilcraft.lib.config.BoundedDiscrete
import dev.anvilcraft.lib.config.Comment
import dev.anvilcraft.lib.config.Config
import net.minecraft.world.item.Item

@Config(name = AnvilCraftAddonTemplate.MOD_ID)
class AddonConfig {
    @Comment("Whether to log the dirt block on common setup")
    var logDirtBlock: Boolean = false

    @Comment("A magic number")
    @BoundedDiscrete(max = 24.0, min = 2.0)
    var magicNumber: Int = 2

    @Comment("What you want the introduction message to be for the magic number")
    var magicNumberIntroduction: String = ""

    @Comment("A list of items to log on common setup.")
    var items: MutableSet<Item> = mutableSetOf()
}