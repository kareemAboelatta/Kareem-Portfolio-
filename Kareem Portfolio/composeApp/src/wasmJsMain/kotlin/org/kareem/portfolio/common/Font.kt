package org.kareem.portfolio.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.app_font
import org.jetbrains.compose.resources.Font

@Composable
fun nunitoRegular() = FontFamily(
    Font(
        Res.font.app_font, FontWeight.W500, FontStyle.Normal
    )
)

@Composable
fun nunitoSemiBold() = FontFamily(
    Font(
        Res.font.app_font, FontWeight.SemiBold, FontStyle.Normal
    )
)

@Composable
fun nunitoBold() = FontFamily(
    Font(
        Res.font.app_font, FontWeight.Bold, FontStyle.Normal
    )
)

@Composable
fun getTypography(): Typography {
    val colors = MaterialTheme.colors

    return Typography(
        h1 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 57.sp,
            letterSpacing = (-0.25).sp,
            color = colors.onBackground // Headline text uses onBackground
        ),
        h2 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 45.sp,
            color = colors.onBackground // Headline text uses onBackground
        ),
        h3 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = colors.onBackground // Headline text uses onBackground
        ),
        h4 = TextStyle(
            fontFamily = nunitoSemiBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = colors.onBackground // Headline text uses onBackground
        ),
        body1 = TextStyle(
            fontFamily = nunitoRegular(),
            fontWeight = FontWeight.Normal,
            fontSize = 25.sp,
            letterSpacing = 0.5.sp,
            color = colors.primary // Body text uses onSurface
        ),
        body2 = TextStyle(
            fontFamily = nunitoRegular(),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            letterSpacing = 0.25.sp,
            color = colors.onSurface // Body text uses onSurface
        ),
        button = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = colors.onPrimary // Button text uses onPrimary since buttons often have primary backgrounds
        ),

    )
}
