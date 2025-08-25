package dev.anvilcraft.addon.template.data.lang

import com.tterrag.registrate.providers.RegistrateLangProvider
import dev.anvilcraft.addon.template.AddonConfig
import dev.anvilcraft.lib.config.ConfigData

class LangHandler {
    companion object {
        /**
         * 语言文件初始化
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrateLangProvider) {
            ConfigData.readConfigClass(provider, AddonConfig::class.java)
        }
    }
}