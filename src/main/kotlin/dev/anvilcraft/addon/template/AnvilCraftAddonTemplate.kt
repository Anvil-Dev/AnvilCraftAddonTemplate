package dev.anvilcraft.addon.template

import com.mojang.logging.LogUtils
import com.tterrag.registrate.Registrate
import dev.anvilcraft.addon.template.data.ModDatagen
import dev.anvilcraft.addon.template.init.AddonBlocks
import dev.anvilcraft.addon.template.init.AddonItemGroups
import dev.anvilcraft.addon.template.init.AddonItems
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.jetbrains.annotations.NotNull
import org.slf4j.Logger

@Mod(AnvilCraftAddonTemplate.MOD_ID)
class AnvilCraftAddonTemplate(modEventBus: IEventBus, modContainer: ModContainer) {
    companion object {
        const val MOD_ID: String = "anvilcraft_addon_template"
        val LOGGER: Logger = LogUtils.getLogger()
        val config: AddonConfig = AutoConfig.register(AddonConfig::class.java) { v1, v2 ->
            JanksonConfigSerializer(v1, v2)
        }.getConfig()
        val REGISTRATE: Registrate = Registrate.create(MOD_ID)

        @NotNull
        fun of(path: String): ResourceLocation {
            return ResourceLocation.fromNamespaceAndPath(MOD_ID, path)
        }
    }

    init {
        AddonItemGroups.register(modEventBus)
        AddonBlocks.register()
        AddonItems.register()
        ModDatagen.init()
    }
}