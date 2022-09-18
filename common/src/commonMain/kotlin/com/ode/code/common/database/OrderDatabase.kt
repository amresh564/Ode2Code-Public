package com.ode.code.common.database

import com.ode.code.common.screen.Product

object OrderDatabase {


    var count: Int = 0
    val listOfProduct: MutableList<Product> = mutableListOf()

    init {
        listOfProduct.add(
            Product(
                "RedMi 10 Prime",
                25156.00,
                "mi10.jpg",
                "Redmi 10i",
                "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
            )
        )
        listOfProduct.add(
            Product(
                "RedMi 10 Prime",
                25156.00,
                "mi10.jpg",
                "Redmi 10i",
                "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
            )
        )

        listOfProduct.add(
            Product(
                "RedMi 10 Prime",
                25156.00,
                "mi10.jpg",
                "Redmi 10i",
                "Redmi 10 Prime (Phantom Black 4GB RAM 64GB | Helio G88 with extendable RAM Upto 2GB | FHD+ 90Hz Adaptive Sync Display)"
            )
        )
    }

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

    fun getTotalPrice(): Double {
        var sum: Double = 0.0
        for (prod in listOfProduct) sum += prod.pPrice
        return sum
    }
}