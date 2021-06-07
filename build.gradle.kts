buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()

    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}

group = "me.edwardjosephpegollo"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers/")
    }
}