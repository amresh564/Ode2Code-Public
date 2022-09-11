package com.ode.code.common

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.ode.code.common.screen.LoginPage

@Preview
@Composable
fun AppPreview() {
    MaterialTheme {
        LoginPage()
    }
}