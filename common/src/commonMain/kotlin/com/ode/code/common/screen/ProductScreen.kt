package com.ode.code.common.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.ode.code.common.database.OrderDatabase
import com.ode.code.common.getImage
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

data class Product(
    val pName: String,
    val pPrice: Double,
    val pImage: String,
    val pImageDesc: String = "",
    val fullName: String,
)

@Composable
fun ProductScreen() {
    val stateOfCart = remember { mutableStateOf(OrderDatabase.count) }
    val listOfProduct = listOf(
        Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        ), Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        ), Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        ), Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        ), Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        )
    )

    Box(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        Column {
            Row {
                Icon(modifier = Modifier.clickable {
                    AppState.screenState(ScreenType.CategoryScreen)
                }, imageVector = Icons.Filled.ArrowBack, contentDescription = "goback")
                Text("Product Catalogue")
            }

            for (product in listOfProduct)
                productDisplay(product)

            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { AppState.screenState(ScreenType.OrderDetailScreen) }
            ) {
                Icon(Icons.Filled.ShoppingCart, "Cart")
                Text(stateOfCart.value.toString())
                Text("Goto Payment Page")
            }
        }

    }
}

@Composable
fun productDisplay(product: Product, isRemovable: Boolean = false) {
    val bitmap = getImage(product)

    Column(
        modifier = Modifier.padding(8.dp)
            .shadow(2.dp)
            .padding(8.dp)
            .clickable {
                OrderDatabase.addProduct(product)
            }
    ) {
        Row {
            Text(
                text = product.pName,
                fontFamily = FontFamily.Monospace
            )
            if (isRemovable) {
                Icon(
                    modifier = Modifier.padding(8.dp, 0.dp).clickable {
                        OrderDatabase.removeProduct(product)
                    },
                    imageVector = Icons.Filled.Close,
                    contentDescription = "close"
                )
            }
        }
        Image(
            modifier = Modifier.heightIn(90.dp, 200.dp).padding(8.dp),
            bitmap = bitmap,
            contentDescription = product.pImageDesc
        )
        Text(
            modifier = Modifier.wrapContentSize(unbounded = false),
            text = product.fullName,
            maxLines = 1,
            fontFamily = FontFamily.Serif,
        )

    }
}


@Composable
fun productScreenPreview() {
    productDisplay(
        Product(
            "RedMi 10 Prime",
            25156.00,
            "mi10.jpg",
            "Redmi 10i",
            "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
        )
    )
}