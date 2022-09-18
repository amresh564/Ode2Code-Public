package com.ode.code.common

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import com.ode.code.common.screen.Product

actual fun getPlatformName(): String {
    return "Desktop"
}

actual fun getImage(product: Product): ImageBitmap {
    return useResource("/images/${product.pImage}") {
        loadImageBitmap(it)
    }
}

