package com.example.lazycolumnandlazyrow

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun HomePage(
    navController: NavController
){
    val data = arrayListOf(
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.gamburger,
            "Gamburger",
            23.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.lavash,
            "Lavash",
            25.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.chickenburger,
            "Chicken Burger",
            20.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.kfc,
            "KFC Basket",
            15.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.sandwich,
            "Sandwich",
            19.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.lang,
            "Long",
            24.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.shaverma,
            "Shaverma",
            30.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.pepsi,
            "Pepsi 0.5l",
            6.0,
        ),
        Product(
            com.example.lazycolumnandlazyrow.R.drawable.Pepsi,
            "Pepsi 1.5l",
            13.0,
        ),
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ){
        ProductList(list = data)
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(32.dp),
            onClick = {
                navController.navigate("add")
            }){
            Icon(
                painter = rememberVectorPainter(image = Icons.Default.Add),
                contentDescription = null
            )
        }
    }
}

@Composable
fun ItemProduct(
    product: Product
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(id = product.image),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
                    .align(Alignment.CenterStart),
                contentScale = ContentScale.Crop
            )
            Text(
                text = Product.,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
            )
        }
    }
}





@Composable
fun ProductList(
    list: MutableList<Product>
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(list){
            ItemProduct(product = it)
        }
    }
}

data class Product(
    val img: Int,
    val name: String,
    val price: Double
)



