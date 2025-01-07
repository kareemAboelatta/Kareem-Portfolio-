package org.kareem.portfolio.common

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times

/**
 * A reusable utility object holding scaling functions for both dp and font sizes.
 * Adjust min/max widths and sizes as needed.
 */
object ResponsiveScaling {
    fun scaledDp(
        width: Dp,
        minWidth: Dp,
        maxWidth: Dp,
        minSize: Dp,
        maxSize: Dp
    ): Dp {
        val clampedWidth = width.coerceIn(minWidth, maxWidth)
        val fraction = (clampedWidth - minWidth) / (maxWidth - minWidth)
        return minSize + (fraction * (maxSize - minSize))
    }

    fun scaledFontSize(
        width: Dp,
        minWidth: Dp = 700.dp,
        maxWidth: Dp = 1200.dp,
        minSize: Float = 40f,
        maxSize: Float = 120f
    ): Float {
        val clampedWidth = width.coerceIn(minWidth, maxWidth)
        val fraction = (clampedWidth - minWidth).value / (maxWidth - minWidth).value
        return (minSize + (fraction * (maxSize - minSize)))
    }
}
