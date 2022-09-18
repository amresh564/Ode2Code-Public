package com.ode.code.android.core.firebase

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.ode.code.android.core.PreferenceManager

class OrderManager(private val context: Context) {
    private val prefManger = PreferenceManager(context)
    private val userCollection = Firebase.firestore.collection("users")
    private val firebaseStorageRef = FirebaseStorage.getInstance().reference
    private val mAuth = FirebaseAuth.getInstance()

}