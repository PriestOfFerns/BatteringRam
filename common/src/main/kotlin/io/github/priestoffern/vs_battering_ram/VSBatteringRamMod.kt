package io.github.priestoffern.battering_ram

import dev.architectury.registry.registries.DeferredRegister
import io.github.priestoffern.vs_battering_ram.VSBatteringRamBlocks
import net.minecraft.core.Registry

object VSBatteringRamMod {
    const val MOD_ID = "vs_battering_ram"

    @JvmStatic
    fun init() {
        VSBatteringRamBlocks.register()
    }

    @JvmStatic
    fun initClient() {
    }
}
