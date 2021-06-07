plugins {
    kotlin("js")
}

repositories{
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.3")

    implementation("org.jetbrains:kotlin-react:17.0.2-pre.154-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-react-dom:17.0.2-pre.154-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-react-router-dom:5.2.0-pre.148-kotlin-1.4.21")
    implementation(npm("react", "17.0.2"))
    implementation(npm("react-dom", "17.0.2"))

    implementation("org.jetbrains:kotlin-styled:5.2.3-pre.154-kotlin-1.5.0")
    implementation(npm("styled-components", "~5.2.3"))

    implementation(project(":shared"))
}

kotlin {
    js(IR) {
        browser{
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}