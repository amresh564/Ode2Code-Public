package com.ode.code.common.view

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType
import com.ode.code.common.screen.*

@Composable
fun AppUi() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Gray
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

@Composable
fun preview() {
    AppUi()
}

fun showPopUpMessage(text: String, context: Context) {
    Toast.makeText(
        context,
        text,
        Toast.LENGTH_SHORT
    ).show()
}