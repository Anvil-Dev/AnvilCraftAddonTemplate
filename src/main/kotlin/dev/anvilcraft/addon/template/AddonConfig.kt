package dev.anvilcraft.addon.template

import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.annotation.ConfigEntry
import me.shedaniel.autoconfig.annotation.ConfigEntry.BoundedDiscrete
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
import net.minecraft.world.item.Item

@Config(name = AnvilCraftAddonTemplate.MOD_ID)
class AddonConfig : ConfigData {
    @Comment("Whether to log the dirt block on common setup")
    @ConfigEntry.Gui.Tooltip
    var logDirtBlock: Boolean = false

    @Comment("A magic number")
    @ConfigEntry.Gui.Tooltip
    @BoundedDiscrete(max = 24, min = 2)
    var magicNumber: Int = 0

    @Comment("What you want the introduction message to be for the magic number")
    @ConfigEntry.Gui.Tooltip
    var magicNumberIntroduction: String = ""

    @Comment("A list of items to log on common setup.")
    @ConfigEntry.Gui.Tooltip
    var items: MutableSet<Item> = mutableSetOf()
}