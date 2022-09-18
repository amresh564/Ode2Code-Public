package com.ode.code.common.screen

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

data class Product(
    val pName: String,
    val pPrice: Double,
    val pImage: String,
    val pImageDesc: String = "",
    val fullName: String
)

@Composable
fun ProductScreen() {

}

@Composable
fun productDisplay(product: Product) {
    val bitmap = useResource("/images/${product.pImage}") {
        loadImageBitmap(it)
    }

    Column(
        modifier = Modifier.padding(8.dp)
            .shadow(2.dp)
            .padding(8.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Start),
            text = product.pName,
            fontFamily = FontFamily.Monospace
        )
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


@Preview
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