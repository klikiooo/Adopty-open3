package com.example.androiddevchallenge.data


import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController:NavHostController, var context:Context) {
    val mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun signup(
        firstname: String,
        lastname: String,
        EmailAddress: String,
        password: String,
        contacts: String,
        location: String
    ) {
        progress.show()
        mAuth.createUserWithEmailAndPassword(EmailAddress, password).addOnCompleteListener {
            var userId = mAuth.currentUser!!.uid
            var userProfile = User(firstname, lastname, EmailAddress, password, contacts, location)
            // Create a reference table called Users inside of the Firebase database
            var usersRef = FirebaseDatabase.getInstance().getReference()
                .child("Users/$userId")
            usersRef.setValue(userProfile).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful) {
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}