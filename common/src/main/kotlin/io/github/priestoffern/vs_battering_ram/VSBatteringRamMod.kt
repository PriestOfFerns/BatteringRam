package io.github.priestoffern.battering_ram

import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry
import dev.architectury.registry.registries.DeferredRegister
import io.github.priestoffern.vs_battering_ram.VSBatteringRamBlockEntities
import io.github.priestoffern.vs_battering_ram.VSBatteringRamBlocks
import io.github.priestoffern.vs_battering_ram.blocks.SpeedGauge.SpeedGaugeRenderer
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider
import net.minecraft.core.Registry

object VSBatteringRamMod {
    const val MOD_ID = "vs_battering_ram"

    @JvmStatic
    fun init() {
        VSBatteringRamBlocks.register()
        VSBatteringRamBlockEntities.register()
    }

    @JvmStatic
    fun initClient() {

        BlockEntityRendererRegistry.register(VSBatteringRamBlockEntities.SPEED_GAUGE.get(),::SpeedGaugeRenderer)
    }
}
