package com.ode.code.android.core.firebase

import android.content.Context
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.ode.code.android.core.PreferenceManager

//q23WPGRnJHQESjfAzFx15lLFJzh2
class StoreManager(private val context: Context) {
    private val prefManger = PreferenceManager(context)
    private val userCollection = Firebase.firestore.collection("users")
    private val firebaseStorageRef = FirebaseStorage.getInstance().reference
    private val mAuth = FirebaseAuth.getInstance()
    private val TAG = "StoreManager"
    fun createNewCategory(storeId: String, categoryName: String) {
        Log.d(TAG, "createNewCategory: ${firebaseStorageRef.name}")
    }

    fun getCategories(storeId: String) {

    }

    fun getProductFromCategory(storeId: String, category: String) {

    }

    fun addProductInCategory(storeId: String, category: String) {

    }
}