package com.example.c36b.repository

import com.example.c36b.model.ProductModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ProductRepositoryImpl : ProductRepository {
    val database: FirebaseDatabase = FirebaseDatabase.getInstance()
    val ref: DatabaseReference = database.reference.child("products")

    override fun addProduct(
        productModel: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        val id = ref.push().key.toString()
        productModel.productId = id
        ref.child(productModel.productId).setValue(productModel).addOnCompleteListener {
            if (it.isSuccessful) {
                callback(true, "Product added successfully")
            } else {
                callback(false, "${it.exception?.message}")
            }
        }
    }

    override fun getProductById(
        productID: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    ) {
        ref.child(productID).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    var products = snapshot.getValue(ProductModel::class.java)
                    if (products != null) {
                        callback(true, "Product fetched", products)
                    }
//                    products.let {
//                        callback(true, "Product fetched", it)
//                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false, error.message, null)
            }
        })
    }

    override fun getAllProduct(callback: (Boolean, String, List<ProductModel?>) -> Unit) {
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    var allProducts = mutableListOf<ProductModel>()
                    for (eachProduct in snapshot.children) {
                        var products = eachProduct.getValue(ProductModel::class.java)
                        if (products != null) {
                            allProducts.add(products)
                        }
                    }
                    callback(true, "Product fetched", allProducts)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false, error.message, emptyList())
            }
        })
    }

    //create -> setValue
    //Update -> updateChildren
    //delete -> removeValue
    override fun updateProduct(
        productId: String,
        data: MutableMap<String, Any?>,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(productId).updateChildren(data).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Product updated succesfully")
            }else{
                callback(false,"${it.exception?.message}")
            }
        }
    }

    override fun deleteProduct(
        productId: String,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(productId).removeValue().addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Product deleted succesfully")
            }else{
                callback(false,"${it.exception?.message}")
            }
        }
    }
}