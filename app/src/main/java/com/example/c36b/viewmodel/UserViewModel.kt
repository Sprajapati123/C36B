package com.example.c36b.viewmodel

import androidx.lifecycle.ViewModel
import com.example.c36b.model.UserModel
import com.example.c36b.repository.UserRepository
import com.google.firebase.auth.FirebaseUser

class UserViewModel(val repo : UserRepository) : ViewModel(){


    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    ){

    }

    //authentication ko function
    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    ){

    }

    //real time database ko function
    fun addUserToDatabase(
        userId: String, model: UserModel,
        callback: (Boolean, String) -> Unit
    ){

    }

    fun forgetPassword(email: String, callback: (Boolean, String) -> Unit){

    }


    fun getCurrentUser(): FirebaseUser?{

    }



    fun getUserFromDatabase(
        userId: String,
        callback: (Boolean, String, UserModel?) -> Unit
    ){

    }

    fun logout(callback: (Boolean, String) -> Unit){

    }

    fun editProfile(
        userId: String,
        data: MutableMap<String, Any?>,
        callback: (Boolean, String) -> Unit
    ){

    }

    fun deleteAccount(userId: String, callback: (Boolean, String) -> Unit){

    }

}