package dev.anvilcraft.addon.template.data.lang

import dev.anvilcraft.addon.template.AddonConfig
import dev.anvilcraft.lib.v2.config.ConfigData
import dev.anvilcraft.lib.v2.registrum.providers.RegistrumLangProvider

class AddonLangHandler {
    companion object {
        /**
         * 语言文件初始化
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrumLangProvider) {
            ConfigData.readConfigClass(provider, AddonConfig::class.java)
        }
    }
}