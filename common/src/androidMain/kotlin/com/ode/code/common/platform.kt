package com.ode.code.common

import androidx.compose.ui.graphics.ImageBitmap
import com.ode.code.common.screen.Product

actual fun getPlatformName(): String {
    return "Android"
}

actual fun getImage(product: Product): ImageBitmap {
    return ImageBitmap(width = 56, height = 43)
}