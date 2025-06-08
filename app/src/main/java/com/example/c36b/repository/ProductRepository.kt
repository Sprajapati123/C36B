package com.example.c36b.repository

import com.example.c36b.model.ProductModel

interface ProductRepository {

    //    {
//     "success": true,
//    "message":"product fetched succesfully"
//    }
    fun addProduct(
        productModel: ProductModel,
        callback: (Boolean, String) -> Unit
    )

    fun getProductById(
        productID: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    )

    fun getAllProduct(callback: (Boolean, String, List<ProductModel?>) -> Unit)

    fun updateProduct(
        productId: String,
        data: MutableMap<String, Any>?,
        callback: (Boolean, String) -> Unit
    )

    fun deleteProduct(
        productId: String, callback: (Boolean, String) -> Unit
    )

}