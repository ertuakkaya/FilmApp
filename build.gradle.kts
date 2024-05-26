// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{

    dependencies{
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")

    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
    id("org.jetbrains.kotlin.kapt") version "1.6.10" apply false


}