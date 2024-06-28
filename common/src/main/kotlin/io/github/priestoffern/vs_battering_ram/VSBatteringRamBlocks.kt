package io.github.priestoffern.vs_battering_ram

import dev.architectury.registry.registries.DeferredRegister
import dev.architectury.registry.registries.RegistrySupplier
import net.minecraft.core.Registry
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import io.github.priestoffern.battering_ram.VSBatteringRamMod
import io.github.priestoffern.vs_battering_ram.blocks.BatteringRamBase
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.level.block.Block

object VSBatteringRamBlocks {
    private val BLOCKS = DeferredRegister.create(VSBatteringRamMod.MOD_ID, Registry.BLOCK_REGISTRY)
    private val ITEMS = DeferredRegister.create(VSBatteringRamMod.MOD_ID, Registry.ITEM_REGISTRY)

    var BATTERING_RAM: RegistrySupplier<BatteringRamBase> = BLOCKS.register("wooden_battering_ram") { BatteringRamBase(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f).noOcclusion()) }

    fun register() {
        BLOCKS.register()
        registerItems()

    }
    fun registerItems() {
        for (block in BLOCKS) {
            ITEMS.register(block.id) { BlockItem(block.get(), Item.Properties().tab(CreativeModeTab.TAB_COMBAT)) }
        }
        ITEMS.register()
    }
}