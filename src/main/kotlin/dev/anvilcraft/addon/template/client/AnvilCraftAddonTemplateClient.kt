package dev.anvilcraft.addon.template.client

import dev.anvilcraft.addon.template.AddonConfig
import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate
import me.shedaniel.autoconfig.AutoConfig
import net.minecraft.client.gui.screens.Screen
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.client.gui.IConfigScreenFactory

@Mod(value = AnvilCraftAddonTemplate.MOD_ID, dist = [Dist.CLIENT])
class AnvilCraftAddonTemplateClient(modBus: IEventBus, container: ModContainer) {
    init {
        container.registerExtensionPoint<IConfigScreenFactory>(
            IConfigScreenFactory::class.java,
            IConfigScreenFactory { _, s ->
                AutoConfig.getConfigScreen<AddonConfig>(AddonConfig::class.java, s).get()
            }
        )
    }
}