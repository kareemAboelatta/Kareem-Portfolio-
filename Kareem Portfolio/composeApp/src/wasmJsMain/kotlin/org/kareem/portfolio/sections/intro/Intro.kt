package org.kareem.portfolio.sections.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.kareem
import org.jetbrains.compose.resources.painterResource
import org.kareem.portfolio.common.DefaultTitle
import org.kareem.portfolio.common.HoveredAnimation
import org.kareem.portfolio.common.InfiniteScaleAnimation
import org.kareem.portfolio.sections.intro.PaddingDimensions.Large
import org.kareem.portfolio.sections.intro.PaddingDimensions.Medium
import org.kareem.portfolio.sections.intro.PaddingDimensions.Small


@Composable
fun IntroSection() {
    Card(
        modifier = Modifier
            .padding(Large),
        elevation = 10.dp,
    ) {
        Row(
            modifier = Modifier.padding(Small).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f).padding(horizontal = Small)
            ) {
                DefaultTitle(
                    text = "Hello, I'm Kareem Aboelatta",
                )


                DefaultTitle(
                    text = "Mobile Developer",
                    fontSize = 150.sp,
                    textStyle = MaterialTheme.typography.h1,
                    collapsedScale = 1f,
                    expandedScale = 1.05f,
                )

                DefaultTitle(
                    text = "Contact Me",
                    textStyle = MaterialTheme.typography.h3,
                    textDecoration = TextDecoration.Underline,
                    textColor = MaterialTheme.colors.secondary
                )

            }

            Box(
                contentAlignment = Alignment.BottomCenter
            ) {
                Card(
                    modifier = Modifier
                        .size(400.dp),
                    backgroundColor = MaterialTheme.colors.primary
                ) {}
                InfiniteScaleAnimation(
                ) {
                    Image(
                        painter = painterResource(Res.drawable.kareem),
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(Medium)
                            .clip(CircleShape)
                            .size(550.dp)
                    )
                }
            }

        }
    }
}


object PaddingDimensions {


    val Mini
        @Stable
        @Composable get() = 5.dp
    val VerySmall
        @Stable
        @Composable get() = 10.dp
    val Small
        @Stable
        @Composable get() = 20.dp
    val Medium
        @Stable
        @Composable get() = 30.dp
    val Large
        @Stable
        @Composable get() = 40.dp
    val xLarge
        @Stable
        @Composable get() = 50.dp
    val xxLarge
        @Stable
        @Composable get() = 60.dp
    val xxxLarge
        @Stable
        @Composable get() = 70.dp
    val xxxxLarge
        @Stable
        @Composable get() = 80.dp
    val xxxxxLarge
        @Stable
        @Composable get() = 90.dp
}