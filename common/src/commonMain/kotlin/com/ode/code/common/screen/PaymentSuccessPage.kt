package com.ode.code.common.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

@Composable
fun PaymentSuccessPage() {
    Box(modifier = Modifier.fillMaxSize()) {
        Icon(imageVector = Icons.Filled.Check, contentDescription = "Success", modifier = Modifier.fillMaxSize())
        Text("Payment Success", textAlign = TextAlign.Center, modifier = Modifier.align(Alignment.Center))
        Icon(imageVector = Icons.Filled.Home, contentDescription = null, modifier = Modifier.clickable {
            AppState.screenState(ScreenType.ProductScreen)
        })
    }
}