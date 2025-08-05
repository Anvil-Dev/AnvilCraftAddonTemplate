package dev.anvilcraft.addon.template.data.lang

import com.google.gson.annotations.SerializedName
import com.tterrag.registrate.providers.RegistrateLangProvider
import dev.anvilcraft.addon.template.AddonConfig
import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate
import dev.dubhe.anvilcraft.util.FormattingUtil
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.TransitiveObject
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment

class ConfigScreenLang {
    companion object {
        /**
         * 初始化配置语言
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrateLangProvider) {
            provider.add("text.autoconfig.${AnvilCraftAddonTemplate.MOD_ID}.title", "Mod Config")
            readConfigClass(AddonConfig::class.java, provider, null)
        }

        private fun readConfigClass(
            configClass: Class<*>, provider: RegistrateLangProvider, parent: String?
        ) {
            for (field in configClass.getDeclaredFields()) {
                var fieldName = field.name
                val name: String
                if (field.isAnnotationPresent(CollapsibleObject::class.java)
                    || field.isAnnotationPresent(TransitiveObject::class.java)
                ) {
                    readConfigClass(field.type, provider, fieldName)
                }
                if (field.isAnnotationPresent(SerializedName::class.java)) {
                    name = field.getAnnotation(SerializedName::class.java).value
                } else {
                    name = FormattingUtil.toEnglishName(FormattingUtil.toLowerCaseUnder(fieldName))
                }
                if (parent != null) {
                    fieldName = "${parent}.${fieldName}"
                }
                provider.add("text.autoconfig.${AnvilCraftAddonTemplate.MOD_ID}.option.${fieldName}", name)
                if (field.isAnnotationPresent(Comment::class.java)) {
                    val comment = field.getAnnotation(Comment::class.java)
                    provider.add(
                        "text.autoconfig.${AnvilCraftAddonTemplate.MOD_ID}.option.${fieldName}.@Tooltip",
                        comment.value
                    )
                }
            }
        }
    }
}