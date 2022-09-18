package com.ode.code.common.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

enum class ScreenType {
    LoginScreen, CategoryScreen, ProductScreen, ProductDetailsScreen, OrderScreen, OrderDetailScreen, PaymentSuccessScreen, PaymentFailedScreen, PaymentPage
}

object AppState {
    private var screen: MutableState<ScreenType>

    init {
        screen = mutableStateOf(ScreenType.LoginScreen)
    }

    fun screenState(): ScreenType {
        return screen.value
    }

    fun screenState(state: ScreenType) {
        screen.value = state
    }
}