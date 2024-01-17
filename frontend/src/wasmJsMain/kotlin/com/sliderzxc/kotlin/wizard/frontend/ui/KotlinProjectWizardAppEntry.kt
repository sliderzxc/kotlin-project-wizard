package com.sliderzxc.kotlin.wizard.frontend.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun KotlinProjectWizardAppEntry() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color(0xff1e1e1e)),
        contentAlignment = Alignment.Center
    ) {
        Text("Kotlin Project Wizard")
    }
}
