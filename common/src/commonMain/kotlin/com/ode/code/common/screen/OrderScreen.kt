package com.ode.code.common.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ode.code.common.database.OrderDatabase
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

@Composable
fun OrderScreen() {
    val listOfProducts by remember { mutableStateOf<MutableList<Product>>(OrderDatabase.listOfProduct) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        displayListOfProducts(listOfProducts)
        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = { AppState.screenState(ScreenType.OrderDetailScreen) }
        ) {
            Text("Continue")
        }
    }
}


@Composable
fun displayListOfProducts(listOfProducts: MutableList<Product>, isRemovable: Boolean = true) {
    Column {
        for (prod in listOfProducts) productDisplay(prod, isRemovable)
    }
}

@Composable
fun previewOrderDetails() {
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
        displayListOfProducts(tempListOfProduct)
        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = {}
        ) {
            Text("Continue")
        }
    }
}