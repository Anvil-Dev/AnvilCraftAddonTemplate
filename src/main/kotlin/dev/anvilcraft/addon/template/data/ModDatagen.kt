package dev.anvilcraft.addon.template.data

import com.tterrag.registrate.providers.ProviderType
import com.tterrag.registrate.providers.RegistrateLangProvider
import com.tterrag.registrate.util.nullness.NonNullConsumer
import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate
import dev.anvilcraft.addon.template.data.lang.LangHandler
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent

@EventBusSubscriber(modid = AnvilCraftAddonTemplate.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
class ModDatagen {
    companion object {
        @SubscribeEvent
        @JvmStatic
        fun gatherData(event: GatherDataEvent) {
        }

        /**
         * 初始化生成器
         */
        fun init() {
            AnvilCraftAddonTemplate.REGISTRATE.addDataGenerator(
                ProviderType.LANG
            ) {
                LangHandler.init(it)
            }
        }
    }
}