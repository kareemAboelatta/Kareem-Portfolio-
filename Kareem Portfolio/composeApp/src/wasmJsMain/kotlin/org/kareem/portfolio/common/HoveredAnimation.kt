package org.kareem.portfolio.common

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.focusable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale


@Composable
fun HoveredAnimation(
    modifier: Modifier = Modifier,
    expandedScale: Float = 1.0f,
    collapsedScale: Float = 0.9f,
    content: @Composable () -> Unit
){
    val interactionSource = remember { MutableInteractionSource() }
    val interactions = remember { mutableStateListOf<Interaction>() }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> {
                    interactions.add(interaction)
                }
                is PressInteraction.Release -> {
                    interactions.remove(interaction.press)
                }
                is PressInteraction.Cancel -> {
                    interactions.remove(interaction.press)
                }
                is DragInteraction.Start -> {
                    interactions.add(interaction)
                }
                is DragInteraction.Stop -> {
                    interactions.remove(interaction.start)
                }
                is DragInteraction.Cancel -> {
                    interactions.remove(interaction.start)
                }
            }
        }
    }

    val isHovered = interactionSource.collectIsHoveredAsState().value
    val scale by animateFloatAsState(targetValue = if (isHovered) expandedScale else collapsedScale , label = "scale")



    Box(
        modifier = Modifier.scale(scale)
            .hoverable(interactionSource)
            .focusable(interactionSource = interactionSource),
    ){
        content()
    }
}