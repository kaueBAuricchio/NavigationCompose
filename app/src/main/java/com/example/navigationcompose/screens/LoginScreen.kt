package com.example.navigationcompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.navigation.HOME_ROUTE
import com.example.navigationcompose.navigation.Screen

@Composable
fun LoginScreen(navController: NavController){
    
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            modifier = Modifier.clickable {
            navController.navigate(route = Screen.SignUp.route)
        },
            text = "Login",
            color = Color.Magenta,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold)
        
        Text(modifier = Modifier.padding(150.dp).clickable {
            navController.navigate(HOME_ROUTE){
                popUpTo(HOME_ROUTE)
            }
        },
            text = "Go Back",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium)
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(navController = rememberNavController())
}