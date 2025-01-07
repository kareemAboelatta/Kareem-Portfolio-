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
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.kareem
import org.jetbrains.compose.resources.painterResource
import org.kareem.portfolio.common.DefaultTitle
import org.kareem.portfolio.common.InfiniteScaleAnimation
import org.kareem.portfolio.common.PaddingDimensions.Large
import org.kareem.portfolio.common.PaddingDimensions.Medium
import org.kareem.portfolio.common.PaddingDimensions.Small
import org.kareem.portfolio.common.ResponsiveScaling

@Composable
fun IntroSection() {
    Card(
        modifier = Modifier.padding(Large),
        elevation = 10.dp,
    ) {
        BoxWithConstraints {
            val width = maxWidth
            val isSmallScreen = width < 700.dp

            if (isSmallScreen) {
                VerticallyLayout(width = width)
            } else {
                HorizontallyLayout(width = width)
            }
        }
    }
}

@Composable
private fun VerticallyLayout(width: Dp) {
    // Example: scale image sizes for small screens as well
    val cardSize = ResponsiveScaling.scaledDp(
        width = width,
        minWidth = 300.dp,
        maxWidth = 700.dp,
        minSize = 150.dp,
        maxSize = 250.dp
    )
    val imageRatio = 1.25f // You can adjust this ratio if needed
    val imageSize = cardSize * imageRatio

    // Scale text sizes as needed (for vertical layout, you might keep smaller fonts)
    val titleFontSize = ResponsiveScaling.scaledFontSize(
        width = width,
        minWidth = 300.dp,
        maxWidth = 700.dp,
        minSize = 20f,
        maxSize = 40f
    ).sp

    Column(
        modifier = Modifier
            .padding(Small)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultTitle(
            text = "Hello, I'm Kareem Aboelatta",
            textAlign = TextAlign.Center,
            fontSize = titleFontSize
        )

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
                        .padding(Medium)
                        .clip(CircleShape)
                        .size(imageSize)
                )
            }
        }

        DefaultTitle(
            text = "Mobile Developer",
            fontSize = (titleFontSize * 1.2f), // Slightly larger than the above titleFontSize
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

@Composable
private fun HorizontallyLayout(width: Dp) {
    // Scale font size based on width
    val titleFontSize = ResponsiveScaling.scaledFontSize(width).sp

    // Scale card and image sizes:
    val cardSize = ResponsiveScaling.scaledDp(
        width = width,
        minWidth = 700.dp,
        maxWidth = 1200.dp,
        minSize = 200.dp,
        maxSize = 400.dp
    )

    val imageRatio = 1.375f
    val imageSize = cardSize * imageRatio

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
                fontSize = (titleFontSize * 0.35f) // Slightly smaller variant if you want
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
