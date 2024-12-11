package org.kareem.portfolio

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

import kareemportfolio.composeapp.generated.resources.Res
import kareemportfolio.composeapp.generated.resources.compose_multiplatform
import kareemportfolio.composeapp.generated.resources.kareem
import org.kareem.portfolio.common.BaseTheme
import org.kareem.portfolio.common.HoveredAnimation

@Composable
fun App() {
    BaseTheme {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
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
                ContactSection()

            }
        }
    }
}

@Composable
fun IntroSection() {
    Card(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(40.dp),
        elevation = 10.dp,
        backgroundColor = MaterialTheme.colors.background
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f).padding(horizontal = 20.dp)
            ) {
                HoveredAnimation {
                    Text(
                        text = "Hi, I'm Kareem Aboelatta.",
                        style = MaterialTheme.typography.h1,
                        color = MaterialTheme.colors.primary
                    )
                }

                Text(
                    text = "I’m an Android developer passionate about building efficient, user-friendly mobile applications. With experience in Kotlin, Java, and Flutter, I strive to stay up-to-date with the latest technologies to deliver high-quality solutions. I’m always eager to learn, grow, and contribute to exciting projects.\n",
                    style = MaterialTheme.typography.h4
                )
            }

            HoveredAnimation(scaleRate = 1.2f) {
                Image(
                    painter = painterResource(Res.drawable.kareem),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(30.dp)
                        .clip(CircleShape)
                        .size(550.dp)
                )
            }
        }
    }
}

@Composable
fun AboutSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(40.dp)
    ) {
        HoveredAnimation {
            Text(
                text = "About Me",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary
            )
        }

        Text(
            text = "With a deep passion for software development, I enjoy crafting solutions that simplify user experiences. Over the years, I've developed Android applications using Kotlin, Java, and Flutter, and continue to refine my craft in this ever-evolving industry. I value both collaboration and self-learning, constantly seeking opportunities to grow as a developer.",
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun SkillsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0F7FA)) // Light blue background
            .padding(40.dp)
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
            Text(
                text = "• Kotlin, Java, Flutter",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "• MVVM, MVP, MVI Architecture",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "• Jetpack Compose, UI/UX Design",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "• Coroutines, RX Java",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "• Dependency Injection, Dagger Hilt, Koin",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "• Firebase, Room, Apollo GraphQL",
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Composable
fun ProjectsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFF59D)) // Light yellow background
            .padding(40.dp)
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

@Composable
fun ContactSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF80CBC4)) // Teal background
            .padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HoveredAnimation {
            Text(
                text = "Contact Me",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary
            )
        }

        Text(
            text = "Feel free to reach out to me for collaboration or inquiries. You can contact me via email, LinkedIn, or GitHub:",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(top = 20.dp)
        )

        Button(
            onClick = { /* Handle Contact Button Click */ },
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(text = "Contact Me")
        }
    }
}
