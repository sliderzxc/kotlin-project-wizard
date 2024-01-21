package com.sliderzxc.kotlin.wizard.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.Anchor
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun NavHeader() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        KotlinWizardLogo()
        Text("Hello World")
    }
}

@Composable
fun KotlinWizardLogo() {
    Anchor(
        href = "/",
    ) {
        Box(Modifier.margin(4.px)) {
            Img(
                "images/kotlin-logo.svg",
                attrs = Modifier.height(32.px).toAttrs()
            )
        }
    }
}