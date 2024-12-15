package org.kareem.portfolio.sections.footor

import kareemportfolio.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource

data class Social(
    val image: DrawableResource,
    val link: String,
    val contentDescription: String

)

val socials = listOf(
    Social(
        image =  Res.drawable.linkedin,
        link = "https://www.linkedin.com/in/kareem-aboelatta-893080203/",
        contentDescription = "linkedin"
    ),
    Social(
        image =  Res.drawable.facebook,
        link = "https://www.facebook.com/ktoto180/",
        contentDescription = "facebook"
    ),
    Social(
        image =  Res.drawable.whatsapp,
        link = "https://wa.me/201009051798",
        contentDescription = "whatsapp"
    ),
    Social(
        image = Res.drawable.instagram,
        link = "https://www.instagram.com/kareemaboelatta/",
        contentDescription = "instagram"
    ),


    Social(
        image =  Res.drawable.github,
        link = "https://github.com/kareemAboelatta",
        contentDescription = "github"
    )
)
