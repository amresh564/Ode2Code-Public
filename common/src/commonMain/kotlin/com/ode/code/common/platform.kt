package com.ode.code.common

import androidx.compose.ui.graphics.ImageBitmap
import com.ode.code.common.screen.Product

expect fun getPlatformName(): String
expect fun getImage(product: Product): ImageBitmap