package com.ode.code.common.view

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType
import com.ode.code.common.screen.*

@Composable
fun AppUi() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        when (AppState.screenState()) {
            ScreenType.LoginScreen -> {
                LoginScreen()
            }

            ScreenType.CategoryScreen -> {
                CategoryScreen()
            }

            ScreenType.ProductScreen -> {
                ProductScreen()
            }

            ScreenType.OrderScreen -> {
                OrderScreen()
            }

            ScreenType.OrderDetailScreen -> {
                OrderDetailScreen()
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    AppUi()
}

