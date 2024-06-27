package io.github.priestoffern.vs_battering_ram.forge

import io.github.priestoffern.battering_ram.VSAddonTemplateMod
import io.github.priestoffern.battering_ram.VSAddonTemplateMod.init
import io.github.priestoffern.battering_ram.VSAddonTemplateMod.initClient
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(VSAddonTemplateMod.MOD_ID)
class VSAddonTemplateModForge {
    init {
        MOD_BUS.addListener { event: FMLClientSetupEvent? ->
            clientSetup(
                event
            )
        }
        init()
    }

    private fun clientSetup(event: FMLClientSetupEvent?) {
        initClient()
    }

    companion object {
        fun getModBus(): IEventBus = MOD_BUS
    }
}
