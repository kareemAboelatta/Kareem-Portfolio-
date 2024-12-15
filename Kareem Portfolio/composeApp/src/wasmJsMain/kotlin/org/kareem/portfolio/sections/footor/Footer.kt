package org.kareem.portfolio.sections.footor

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kareemportfolio.composeapp.generated.resources.*
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.kareem
import kareemportfolio.composeapp.generated.resources.linkedin
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

import org.kareem.portfolio.common.BaseTheme
import org.kareem.portfolio.common.HoveredAnimation


// Footer section
@Composable
fun Footer() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Contact Me",
            style = MaterialTheme.typography.h2.copy(fontWeight = FontWeight.Bold),
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp), modifier = Modifier.padding(top = 10.dp)
        ) {
            // Instagram Icon
            socials.forEach {
                IconLink(
                    image = it.image,
                    link = it.link,
                    contentDescription = it.contentDescription
                )
            }
        }
    }
}

// IconLink Composable to handle individual icon linking
@Composable
fun IconLink(
    modifier: Modifier = Modifier,

    image: DrawableResource,
    link: String,
    contentDescription: String
) {


    val uriHandler = LocalUriHandler.current

    HoveredAnimation(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = contentDescription,
            modifier = Modifier.size(60.dp).clickable {
                uriHandler.openUri(link)
            })
    }

}

