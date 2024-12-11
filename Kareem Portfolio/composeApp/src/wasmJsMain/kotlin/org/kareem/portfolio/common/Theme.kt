package org.kareem.portfolio.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalViewConfiguration

private val LightColors = lightColors(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    error = md_theme_light_error,
    onError = md_theme_light_onError,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,

    )


private val DarkColors = darkColors(

    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    error = md_theme_dark_error,
    onError = md_theme_dark_onError,
    background = Color.Black,
    onBackground =Color.Black,
    surface = Color.Black,
    onSurface = md_theme_dark_onSurface,
)


@Composable
fun BaseTheme(
    darkTheme: Boolean = true,//isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> LightColors
        else -> LightColors
    }
    val view = LocalViewConfiguration.current

    MaterialTheme(
        colors = colorScheme,
        typography = getTypography(),
        shapes = shapes,
        content = content
    )


}