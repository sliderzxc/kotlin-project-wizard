package com.sliderzxc.kotlin.wizard.frontend.app

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.sliderzxc.kotlin.wizard.frontend.ui.KotlinProjectWizardAppEntry
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.configureWebResources
import org.jetbrains.compose.resources.urlResource

@OptIn(ExperimentalResourceApi::class, ExperimentalComposeUiApi::class)
fun main() {
    configureWebResources {
        setResourceFactory { urlResource("./$it") }
    }
    CanvasBasedWindow("Kotlin Wizard", canvasElementId = "kotlinWizardCanvas") {
        KotlinProjectWizardAppEntry()
    }
}