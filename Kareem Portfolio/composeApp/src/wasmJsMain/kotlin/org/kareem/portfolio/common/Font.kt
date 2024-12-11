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
        Res.font.app_font, FontWeight.Normal, FontStyle.Normal
    )
)

@Composable
fun getTypography(): Typography {
    return androidx.compose.material.Typography(

        /** display **/
        h1 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 57.sp,  // Recommended size for displayLarge in Material 3
            letterSpacing = (-0.25).sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),

        h2 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 45.sp,  // Recommended size for displayMedium in Material 3
            letterSpacing = 0.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),

        h3 = TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,  // Recommended size for displaySmall in Material 3
            letterSpacing = 0.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),

        /** headline **/
        h4 = TextStyle(
            fontFamily = nunitoSemiBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,  // Recommended size for headlineLarge in Material 3
            letterSpacing = 0.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),


        /** body **/
        body1 = TextStyle(
            fontFamily = nunitoRegular(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,  // Recommended size for bodyLarge in Material 3
            letterSpacing = 0.5.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),
        body2 = TextStyle(
            fontFamily = nunitoRegular(),
            fontWeight = FontWeight.Thin,
            fontSize = 14.sp,  // Recommended size for bodyMedium in Material 3
            letterSpacing = 0.25.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.onBackground
        ),
        button =  TextStyle(
            fontFamily = nunitoBold(),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,  // Recommended size for displayMedium in Material 3
            letterSpacing = 0.sp,  // Recommended letterSpacing
            color = MaterialTheme.colors.primary
        ),

    )

}
