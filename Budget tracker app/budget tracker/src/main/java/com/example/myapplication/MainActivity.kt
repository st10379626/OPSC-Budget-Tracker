package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.walletwise.ui.theme.WalletWiseTheme
import androidx.compose.foundation.layout.Row as Row1
import androidx.compose.material3.Text as Text1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WalletWiseTheme {
                WalletWiseApp()
            }
        }
    }
}

@Composable
private fun WalletWiseApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text1("WalletWise") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                backgroundColor = Color.Black,
                contentColor = Color.White
            )
        }
    ) {
        WalletContent()
    }
}

@Composable
fun WalletContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF212738))
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)
        ) {
            Text1("BUDGET", color = Color.Black, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(12.dp))

        Card(
            Modifier.padding(16.dp), backgroundColor = Color.LightGray,
            elevation = 4.dp
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text1("Total balance: 60,28 ZAR", fontWeight = FontWeight.Bold)
                Text1("FNB account: 423,55", color = Color.Blue)
                Text1("CAPITEC account: 577,45", color = Color.Red)
                Text1("Cash: 0")
            }
        }

        Row1(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            TabButton("Transactions", selected = true)
            TabButton("Expenses", selected = false)
            TabButton("Goals", selected = false)
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            item { ExpandableItem("Total loans", "10000 rands") }
            item { ExpandableItem("Health", "1000 rands") }
            item { ExpandableItem("Education", "500 rands") }
            item { ExpandableItem("Bills", "550 rands") }
            item { ExpandableItem("Subscriptions", "50 rands") }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF6F00))
        ) {
            Text1("View Charts", color = Color.White)
        }
    }
}

fun Card(padding: Modifier, backgroundColor: Color, elevation: Dp, function: () -> Unit) {

}

@Composable
fun TabButton(text: String, selected: Boolean) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (selected) Color.White else Color.Gray
        ),
        modifier = Modifier.weight(1f)
    ) {
        Text1(text, color = Color.Black)
    }
}

@Composable
fun ExpandableItem(title: String, amount: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 2.dp,
        backgroundColor = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row1(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text1("▼ $title", fontSize = 16.sp)
            Text1(amount, fontWeight = FontWeight.Bold)
        }
    }
}
