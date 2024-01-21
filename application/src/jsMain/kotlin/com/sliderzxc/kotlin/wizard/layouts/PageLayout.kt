package com.sliderzxc.kotlin.wizard.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.sliderzxc.kotlin.wizard.sections.NavHeader
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.gridRow
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateRows
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.fr

@Composable
fun PageLayout(title: String, content: @Composable () -> Unit) {
    LaunchedEffect(title) {
        document.title = "Kobweb - $title"
    }

    Box(
        Modifier.fillMaxSize().gridTemplateRows { size(1.fr); size(auto) },
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            content()
        }
    }
}
