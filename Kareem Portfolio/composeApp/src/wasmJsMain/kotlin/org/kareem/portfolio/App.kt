package org.kareem.portfolio

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kareem.portfolio.common.BaseTheme
import org.kareem.portfolio.common.DefaultText
import org.kareem.portfolio.common.DefaultTitle
import org.kareem.portfolio.common.HoveredAnimation
import org.kareem.portfolio.sections.footor.Footer
import org.kareem.portfolio.sections.footor.IconLink
import org.kareem.portfolio.sections.footor.socials
import org.kareem.portfolio.sections.intro.IntroSection
import org.kareem.portfolio.sections.intro.PaddingDimensions
import org.kareem.portfolio.sections.intro.PaddingDimensions.Large
import org.kareem.portfolio.sections.intro.PaddingDimensions.Medium
import org.kareem.portfolio.sections.intro.PaddingDimensions.Small

@Composable
fun App() {


    val state = rememberLazyListState()
    BaseTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colors.onBackground).fillMaxSize(),
            contentAlignment = Alignment.CenterEnd,
        ) {
            LazyColumn(
                state = state,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    IntroSection()
                }
                item {
                    AboutSection()
                }
                item {
                    SkillsSection()
                }

                item {
                    ProjectsSection()

                }
                item {
                    Footer()
                }
            }
            AnimatedVisibility(
                (state.firstVisibleItemIndex > 0).not()
            ) {
                VerticalSocials()
            }
        }



    }

}


@Composable
fun VerticalSocials(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(PaddingDimensions.xxxxLarge),
        elevation = PaddingDimensions.xxLarge,
        backgroundColor = MaterialTheme.colors.onBackground
    ) {
        Column(
            modifier = Modifier.padding(
                Small
            )
        ) {
            socials.forEach {
                IconLink(
                    modifier = Modifier.padding(
                       vertical =  Large,
                        horizontal = Small
                    ),
                    image = it.image,
                    link = it.link,
                    contentDescription = it.contentDescription
                )
            }

        }
    }
}

@Preview
@Composable
fun AboutSection() {
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
            DefaultTitle(
                text = "About Me",
            )

            DefaultText(
                modifier = Modifier.padding(start = PaddingDimensions.xLarge),
                text = "With over four years of experience in the industry, I bring a keen eye for detail, a passion for problem-solving," +
                        " and a commitment to delivering solutions that truly meet my clients’ needs. I take pride in clear communication," +
                        " reliable results, and the ability to adapt quickly to new challenges. Whether working independently or as part of a team," +
                        " I approach every project with professionalism, creativity, and the drive to help businesses thrive." +
                        "I value both collaboration and self-learning, constantly seeking opportunities to grow as a developer. " +
                        "I strive to stay up-to-date with the latest technologies to deliver high-quality solutions." +
                        " I’m always eager to learn, grow, and contribute to exciting projects.",
            )
        }
    }

}

@Composable
fun SkillsSection() {
    Card(
        modifier = Modifier
            .padding(Large),
        elevation = Large,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingDimensions.Small)
        ) {
            HoveredAnimation {
                Text(
                    text = "Skills",
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.primary
                )
            }

            Column(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                DefaultText(
                    text = "• Kotlin, Java, Flutter",
                )
                DefaultText(
                    text = "• MVVM, MVP, MVI Architecture",
                )
                DefaultText(
                    text = "• Jetpack Compose, UI/UX Design",
                )
                DefaultText(
                    text = "• Coroutines, RX Java",
                )
                DefaultText(
                    text = "• Dependency Injection, Dagger Hilt, Koin",
                )
                DefaultText(
                    text = "• Firebase, Room, Apollo GraphQL",
                )
            }
        }
    }

}

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
                .padding(PaddingDimensions.Small)
        ) {
            HoveredAnimation {
                Text(
                    text = "Projects",
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.primary
                )
            }

            Text(
                text = "Here are some of the applications I've worked on:\n\n• **Otluo**: A Quranic app with over 100,000 downloads.\n• **Tmeny**: A parenting app with over 50,000 downloads.\n• **Mind More**: A mental health support app with features like real-time video counseling.\n",
                style = MaterialTheme.typography.body1
            )
        }
    }

}



