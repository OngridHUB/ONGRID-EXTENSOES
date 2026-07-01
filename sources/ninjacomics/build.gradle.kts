plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Ninja Comics"
    versionCode = 1
    contentWarning = ContentWarning.SAFE
    libVersion = "1.4"
    theme = "madara"

    source {
        lang = "pt-BR"
        baseUrl = "https://ninjacomics.xyz"
    }
}
