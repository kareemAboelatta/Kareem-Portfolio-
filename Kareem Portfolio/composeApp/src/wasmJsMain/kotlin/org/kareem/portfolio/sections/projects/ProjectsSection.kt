package org.kareem.portfolio.sections.projects

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.kareem
import org.jetbrains.compose.resources.painterResource
import org.kareem.portfolio.common.DefaultTitle
import org.kareem.portfolio.common.HoveredAnimation
import org.kareem.portfolio.common.PaddingDimensions.Large
import org.kareem.portfolio.common.PaddingDimensions.Small

@Composable
fun ProjectsSection() {
    Card(
        modifier = Modifier
            .padding(Large),
        elevation = Large,
    ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Small)
            ) {
                HoveredAnimation {
                    Text(
                        text = "Projects",
                        style = MaterialTheme.typography.h3,
                        color = MaterialTheme.colors.primary
                    )
                }

                Column {
                    projects.forEach {
                        ProjectItem(it)
                    }
                }
            }



    }

}


@Composable
fun ProjectItem(project: Project) {
    Box(
        modifier = Modifier
            .padding(Small)
            .clip(RoundedCornerShape(Small))
    ) {
        Image(
            painter = painterResource(Res.drawable.kareem),
            contentDescription = null
        )
        DefaultTitle(project.title)
    }
}




















