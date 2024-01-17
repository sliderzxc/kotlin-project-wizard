import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("org.jetbrains.compose")
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        wasmJs {
            moduleName = "kotlin-wizard"
            browser {
                commonWebpackConfig {
                    outputFileName = "kotlin-wizard.js"
                }
            }
        }
        binaries.executable()
    }


    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                api(compose.components.resources)
            }
        }
    }
}

compose.experimental {
    web.application {}
}