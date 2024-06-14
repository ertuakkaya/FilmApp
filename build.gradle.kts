// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies{
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")

        // hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48.1")

    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.jetbrains.kotlin.kapt") version "1.8.10" apply false

    //firebase
    id("com.google.gms.google-services") version "4.4.2" apply false


}