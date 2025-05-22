plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kafka)
    implementation(libs.org.json)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

application {
    // Define the main class for the application.
    mainClass.set("com.enterprises.baca.StockTradeProducerSimulatorKt")
}
