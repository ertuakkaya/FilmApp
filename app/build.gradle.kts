plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.6.10"
    id("androidx.navigation.safeargs.kotlin")
    id("org.jetbrains.kotlin.kapt") version "1.6.10"
    id("kotlin-kapt")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
   
}

android {
    namespace = "com.example.filmlerapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.filmlerapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    //for binding
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}



dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.0") // it should be 2 5 0
    implementation("androidx.navigation:navigation-ui-ktx:2.5.0")   // it should be 2 5 0
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.room:room-runtime:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")


    // viewmodel  2 5 1
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    // activity ktx 1 6 1
    implementation("androidx.activity:activity-ktx:1.6.1")

    // hilt
    // hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
    //implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    //kapt ("androidx.hilt:hilt-compiler:1.2.0")
}