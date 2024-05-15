package com.example.androiddevchallenge.model
class User {
    var firstname:String = ""
    var lastname:String = ""
    var EmsilAddress:String = ""
    var password:String = ""
    var contacts:String = ""
    var location:String = ""

    constructor(firstname: String, lastname: String, email: String, password: String,contacts :String,location: String) {
        this.firstname = firstname
        this.lastname = lastname
        this.EmsilAddress = email
        this.password = password
        this.contacts = contacts
        this.location = location
    }

    constructor()
}