package io.github.priestoffern.vs_battering_ram.blocks.SpeedGauge

import com.simibubi.create.content.equipment.goggles.IHaveGoggleInformation
import com.simibubi.create.content.kinetics.base.IRotate
import com.simibubi.create.content.kinetics.base.KineticBlockEntity
import com.simibubi.create.foundation.utility.Components
import io.github.priestoffern.vs_battering_ram.VSBatteringRamBlockEntities
import net.minecraft.ChatFormatting
import net.minecraft.core.BlockPos
import net.minecraft.network.chat.Component
import net.minecraft.world.level.block.state.BlockState
import org.valkyrienskies.mod.common.getShipManagingPos

class SpeedGaugeBlockEntity(pos: BlockPos, blockState: BlockState) : KineticBlockEntity(VSBatteringRamBlockEntities.SPEED_GAUGE.get(), pos, blockState),
    IHaveGoggleInformation {

    override fun addToGoggleTooltip(tooltip: MutableList<Component?>, isPlayerSneaking: Boolean): Boolean {
        tooltip.add(Components.empty())
        tooltip.add(Components.literal("Speed:")
            .withStyle(ChatFormatting.GRAY))
        tooltip.add(Components.literal(getShipSpeed().toInt().toString()+" m/s")
            .withStyle(ChatFormatting.GOLD))


        return true
    }

    fun getShipSpeed(): Double {
        var ship = level.getShipManagingPos(blockPos)
        if (ship!=null) {
            return ship.velocity.length()
        }
        return 0.0
    }
}
