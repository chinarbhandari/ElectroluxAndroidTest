

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.chinar.electroluxapp.android"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))

    // Android Support Dependencies
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")

    //NAVIGATION
    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.4.1")

    //COMPOSE
    implementation("androidx.compose.ui:ui:1.1.0")
    implementation("androidx.compose.material:material:1.1.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("androidx.activity:activity-compose:1.4.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.0")
    implementation("io.coil-kt:coil-compose:1.4.0")

    //DI
    implementation("io.insert-koin:koin-core:3.1.2")
    implementation("io.insert-koin:koin-test:3.1.2")
    implementation("io.insert-koin:koin-test-junit4:3.1.2")
    implementation("io.insert-koin:koin-android:3.1.2")
    implementation("io.insert-koin:koin-androidx-compose:3.1.2")
}