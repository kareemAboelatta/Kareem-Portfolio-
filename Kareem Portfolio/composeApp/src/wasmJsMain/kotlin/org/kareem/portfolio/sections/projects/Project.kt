package org.kareem.portfolio.sections.projects

data class Project(
    val title: String,
    val description: String,
    val imageUrl: String,
    val link: String
)

val projects = listOf(
    Project(
        title = "Tmeny",
        description = "A trusted companion for parents seeking reliable medical advice for their children. Tmeny has made a significant impact with over 50,000 downloads on Google Play, offering expert guidance and intuitive features to ensure parents get the help they need at the right time. Its seamless design and user-friendly interface make it a go-to app for families, providing peace of mind through its wealth of trusted resources.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/tmeny_app.png?alt=media",
        link = "https://play.google.com/store/apps/details?id=com.drwlady.app"
    ),
    Project(
        title = "MindMore",
        description = "A comprehensive mental health app designed to provide counseling services and educational assessments in one platform. MindMore helps users connect with professionals through real-time audio and video calls, creating a responsive and supportive environment for mental well-being. With its clear design and engaging features, the app empowers individuals to prioritize their mental health effortlessly.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/mindmore_app.png?alt=media",
        link = "https://www.mindmore.co.uk/"
    ),
    Project(
        title = "Otluo",
        description = "A complete Quranic mobile application that combines functionality with spiritual value. Otluo stands out by offering high-quality audio for multiple Qirat styles, helping users deepen their connection with the Quran. With over 100,000+ downloads, it has become a trusted app for millions worldwide, making spiritual content more accessible and immersive.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/Quran%20App.PNG?alt=media",
        link = "https://play.google.com/store/apps/details?id=com.quran7m.free.main&hl=en_AU"
    ),
    Project(
        title = "Music App",
        description = "Discover the ultimate music experience with this modern and immersive music app. From a captivating splash screen to intuitive controls for playback, pause, and skip – even when your screen is off – every detail is designed for a seamless journey. Integrated with notifications for easy control, the app offers an extensive song library backed by reliable Firebase technology, ensuring top performance and an uninterrupted musical experience.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/Music%20app.JPG?alt=media",
        link = ""
    ),
    Project(
        title = "Mehany Express",
        description = "Your all-in-one solution for building maintenance and repair services. Mehany Express connects homeowners and businesses with professional plumbers, electricians, HVAC experts, and more. With a seamless booking process, transparent pricing, and highly vetted service providers, it ensures quality and speed for all your maintenance needs. Whether you require emergency fixes or routine work, Mehany Express is the smart choice for maintaining a safe and efficient space.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/mehany-%20express.png?alt=media",
        link = "https://play.google.com/store/apps/details?id=com.aait.mehany_express"
    ),
    Project(
        title = "Mehany Express (Provider)",
        description = "An essential app for professionals offering their expertise on the Mehany Express platform. Designed to streamline service provider operations, this app enables plumbers, electricians, HVAC technicians, and others to efficiently manage requests, communicate with clients, and track job progress. Its intuitive interface ensures that every professional delivers outstanding service while optimizing their workflow and time management.",
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/kareem-portfolio-1f8da.appspot.com/o/mehany_provider.png?alt=media",
        link = "https://play.google.com/store/apps/details?id=com.aait.mihani_express_provider"
    )
)
