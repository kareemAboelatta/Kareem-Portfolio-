package org.kareem.portfolio.sections.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.kareem
import org.jetbrains.compose.resources.painterResource
import org.kareem.portfolio.common.DefaultTitle
import org.kareem.portfolio.common.InfiniteScaleAnimation
import org.kareem.portfolio.common.PaddingDimensions.Large
import org.kareem.portfolio.common.PaddingDimensions.Medium
import org.kareem.portfolio.common.PaddingDimensions.Small


@Composable
fun IntroSection() {

    Card(
        modifier = Modifier
            .padding(Large),
        elevation = 10.dp,
    ) {
        BoxWithConstraints {
            val width = maxWidth
            val isSmallScreen = width < 700.dp

            print("isSmallScreen: $isSmallScreen")
            if (isSmallScreen) {
                Vertically()
            } else
                Horizontally(maxWidth)

        }


    }
}


@Composable
private fun Vertically() {
    Column(
        modifier = Modifier.padding(Small).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultTitle(
            text = "Hello, I'm Kareem Aboelatta",
            textAlign = TextAlign.Center
        )

        Box(
            contentAlignment = Alignment.BottomCenter
        ) {
            Card(
                modifier = Modifier
                    .size(200.dp),
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
                        .size(250.dp)
                )
            }
        }

        DefaultTitle(
            text = "Mobile Developer",
            fontSize = 30.sp,
            textStyle = MaterialTheme.typography.h1,
            collapsedScale = 1f,
            expandedScale = 1.05f,
            textAlign = TextAlign.Center

        )

        DefaultTitle(
            text = "Contact Me",
            textStyle = MaterialTheme.typography.h3,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center,
            textColor = MaterialTheme.colors.secondary
        )

    }

}

fun scaledDpFromWidth(
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

@Composable
fun scaledFontSizeFromWidth(width: Dp): Float {
    // Define a range for width and corresponding font sizes
    val minWidth = 700.dp
    val maxWidth = 1200.dp
    val minSize = 40f
    val maxSize = 130f

    val clampedWidth = width.coerceIn(minWidth, maxWidth)
    val fraction = (clampedWidth - minWidth).value / (maxWidth - minWidth).value
    return (minSize + (fraction * (maxSize - minSize)))
}


@Composable
private fun Horizontally(maxWidth: Dp) {
    val titleFontSize = scaledFontSizeFromWidth(maxWidth).sp

    // Scale card size between 200dp and 400dp as width goes from 700dp to 1200dp
    val cardSize = scaledDpFromWidth(
        width = maxWidth,
        minWidth = 700.dp,
        maxWidth = 1200.dp,
        minSize = 200.dp,
        maxSize = 400.dp
    )

    // Let's say we keep the same ratio between image and card.
    // If originally 400dp card had a 550dp image, ratio = 550/400 = 1.375.
    val imageSize = cardSize * 1.375f


    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp)
        ) {
            DefaultTitle(
                text = "Hello, I'm Kareem Aboelatta",
            )

            DefaultTitle(
                text = "Mobile Developer",
                fontSize = titleFontSize,
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

        Box(contentAlignment = Alignment.BottomCenter) {
            Card(
                modifier = Modifier.size(cardSize),
                backgroundColor = MaterialTheme.colors.primary
            ) {}
            InfiniteScaleAnimation {
                Image(
                    painter = painterResource(Res.drawable.kareem),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(16.dp)
                        .clip(CircleShape)
                        .size(imageSize)
                )
            }
        }
    }
}
