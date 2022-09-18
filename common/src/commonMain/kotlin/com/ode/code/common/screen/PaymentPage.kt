package com.ode.code.common.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ode.code.common.database.OrderDatabase
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

@Composable
fun PaymentPage() {

    Box(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        Column(

        ) {
            Row {
                Icon(modifier = Modifier.clickable {
                    AppState.screenState(ScreenType.OrderDetailScreen)
                }, imageVector = Icons.Filled.ArrowBack, contentDescription = "goback")
                Text("Product Catalogue")
            }

            Card {
                Column {
                    Text("Hello User")
                    Text("Your Total Order count in ${OrderDatabase.getCartCount()}")
                    Text("Total Billing Amount : ${OrderDatabase.getTotalPrice()}")
                }
            }

            Button(
                onClick = { AppState.screenState(ScreenType.PaymentSuccessScreen) }
            ) {
                Text("Click to Proceed")
            }
        }
    }
}