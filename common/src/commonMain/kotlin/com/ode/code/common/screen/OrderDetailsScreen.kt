package com.ode.code.common.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ode.code.common.database.OrderDatabase
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

@Composable
fun OrderDetailScreen() {
    val listOfProducts by remember { mutableStateOf<MutableList<Product>>(OrderDatabase.listOfProduct) }
    Box(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {

        Column {
            Row {
                Icon(modifier = Modifier.clickable {
                    AppState.screenState(ScreenType.CategoryScreen)
                }, imageVector = Icons.Filled.ArrowBack, contentDescription = "goback")
                Text("Order Details Page")
            }
            for (prod in listOfProducts) productDisplay(prod, true)
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { AppState.screenState(ScreenType.PaymentPage) }
            ) {
                Text("Pay")
            }
        }

    }
}

@Composable
fun previewOrderDetailsScreen() {
    val tempListOfProduct = mutableStateListOf<Product>()
    tempListOfProduct.add(
        Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        )
    )
    tempListOfProduct.add(
        Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        )
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        displayListOfProducts(tempListOfProduct, false)
        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = {}
        ) {
            Text("Continue")
        }
    }
}