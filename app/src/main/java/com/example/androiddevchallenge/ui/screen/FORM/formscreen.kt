package com.example.androiddevchallenge.ui.screen.FORM

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.screen.home.HomeViewModel


@Composable
fun formscreen(
    viewModel: HomeViewModel,
    navController: NavController
){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.ic_launcher_foreground),
            contentScale = ContentScale.FillBounds
        )


    ){

        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var contacts by remember { mutableStateOf("") }
        var location by remember { mutableStateOf("") }







        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){


            Image(
                painter = painterResource(id = R.drawable.parchment), contentDescription = "reg",
                modifier = Modifier.size(80.dp)
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        Box (

            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,



            ){


            Text(text = "REGISTER TO ADOPT",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = firstname, onValueChange = {firstname = it},
            placeholder = { Text(text = " firstname",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text ),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person")})

        Spacer(modifier = Modifier.height(15.dp))


        TextField(value = lastname, onValueChange = {lastname = it},
            placeholder = { Text(text = " lastname",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text ),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person")})

        Spacer(modifier = Modifier.height(15.dp))


        TextField(value = email, onValueChange = {email = it},
            placeholder = { Text(text = " Email Address",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email ),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email")})
        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = password, onValueChange = {password = it},
            placeholder = { Text(text = " password",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password ),

            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock")})
        Spacer(modifier = Modifier.height(15.dp))


        TextField(value = contacts, onValueChange = {contacts = it},
            placeholder = { Text(text = " contacts",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone ),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone")})

        Spacer(modifier = Modifier.height(20.dp))





        TextField(value = location, onValueChange = {location = it},
            placeholder = { Text(text = " location",
                Modifier.padding(5.dp))},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text ),
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "LocationOn")})

        Spacer(modifier = Modifier.height(20.dp))




        Box (

            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,


            ){


            Button(onClick = { /*TODO*/ }) {
                Text(text = "ADOPT")
            }
        }
        Spacer(modifier = Modifier.height(2.dp))







    }

}