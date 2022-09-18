package com.ode.code.common.database

import com.ode.code.common.screen.Product

class OrderDatabase {
    var count: Int = 0
    val listOfProduct: MutableList<Product> = mutableListOf()

    fun getCartCount(): Int {
        return if (count > 0) count
        else 0
    }

    fun addProduct(product: Product) {
        count++
        listOfProduct.add(product)
    }

    fun removeProduct(product: Product) {
        count--
        listOfProduct.remove(product)
    }

    fun removeAllProduct() {
        listOfProduct.clear()
    }
}