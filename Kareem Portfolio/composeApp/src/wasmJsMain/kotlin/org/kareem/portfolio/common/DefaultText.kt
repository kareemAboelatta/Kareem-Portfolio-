package org.kareem.portfolio.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.*


@Composable
fun DefaultText(
    text: String,
    modifier: Modifier = Modifier,

    textColor: Color = MaterialTheme.colors.primary,
    textStyle: TextStyle = MaterialTheme.typography.body1,
    fontSize: TextUnit = 25.sp
) {
    Text(
        text = text,
        modifier = modifier,
        style = textStyle,
        color = textColor,
        fontSize = fontSize,
    )
}

@Composable
fun DefaultTitle(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colors.primary,
    textStyle: TextStyle = MaterialTheme.typography.h2,
    fontSize: TextUnit = MaterialTheme.typography.h2.fontSize,
    expandedScale: Float = 1.0f,
    collapsedScale: Float = 0.9f,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration? = null,

    ) {
    HoveredAnimation(
        modifier = modifier,
        expandedScale = expandedScale,
        collapsedScale = collapsedScale,
    ) {
        Text(
            text = text,
            style = textStyle,
            color = textColor,
            fontSize = fontSize,
            textAlign = textAlign,
            textDecoration = textDecoration
        )
    }
}

