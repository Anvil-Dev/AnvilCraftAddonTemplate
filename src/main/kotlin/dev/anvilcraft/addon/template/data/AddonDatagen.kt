package dev.anvilcraft.addon.template.data

import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate
import dev.anvilcraft.addon.template.data.lang.AddonLangHandler
import dev.anvilcraft.lib.v2.registrum.providers.ProviderType
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent

@EventBusSubscriber(modid = AnvilCraftAddonTemplate.MOD_ID)
class AddonDatagen {
    companion object {
        @SubscribeEvent
        @JvmStatic
        fun gatherData(event: GatherDataEvent) {
        }

        /**
         * 初始化生成器
         */
        fun init() {
            AnvilCraftAddonTemplate.REGISTRUM.addDataGenerator(ProviderType.LANG, AddonLangHandler::init)
        }
    }
}