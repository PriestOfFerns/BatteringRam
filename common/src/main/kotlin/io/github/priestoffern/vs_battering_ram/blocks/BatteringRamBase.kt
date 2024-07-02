package io.github.priestoffern.vs_battering_ram.blocks

import net.minecraft.core.BlockPos
import net.minecraft.server.level.ServerLevel
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.ButtonBlock
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock
import net.minecraft.world.level.block.HorizontalDirectionalBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.Property
import org.valkyrienskies.mod.common.getShipManagingPos
import java.util.*

class BatteringRamBase(properties: Properties) : FaceAttachedHorizontalDirectionalBlock(properties) {

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block?, BlockState?>) {
        builder.add(
            *arrayOf<Property<*>>(
                HorizontalDirectionalBlock.FACING,
                FaceAttachedHorizontalDirectionalBlock.FACE
            )
        )
    }

    override fun animateTick(state: BlockState, level: Level, pos: BlockPos, random: Random) {


        var ship = level.getShipManagingPos(pos)
        if (ship!=null) {
            println(ship.velocity)
        }

    }
}