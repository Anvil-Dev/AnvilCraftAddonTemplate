package dev.anvilcraft.addon.template.data.lang

import com.tterrag.registrate.providers.RegistrateLangProvider

class LangHandler {
    companion object {
        /**
         * 语言文件初始化
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrateLangProvider) {
            ConfigScreenLang.init(provider)
        }
    }
}