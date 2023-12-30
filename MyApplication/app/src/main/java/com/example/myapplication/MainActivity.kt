package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AppImage("Jetpack Compose Tutorial", "Jetpack Compose is Android's recommended modern" +
                            " toolkit for building native UI. It simplifies and accelerates UI development on Android. Quickly bring your" +
                            " app to life with less code, powerful tools, and intuitive Kotlin APIs.",
                        "Compose addresses coupling issue that exists in the UI development with XML. When we initial" +
                                "ze our views written in XML in the code written in Java/Kotlin, it generates the possibility of Null Reference errors " +
                                "and makes it difficult to maintain. Jetpack Compose tries to minimize the coupling in the application.")
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, definition : String, meaning : String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            top = 10.dp,
            start = 10.dp,
            end = 10.dp
        )

    ){
        Text(
            text = title,
            fontSize = 24.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding()
        )
       Text(
            text = definition,
            fontSize = 10.sp,
            lineHeight = 8.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(
            text = meaning,
            fontSize = 10.sp,
            lineHeight = 8.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(10.dp)
        )


    }
}

@Composable
fun AppImage(title: String, definition : String, meaning : String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.download)
    Box (
        modifier = modifier.padding(
            end = 170.dp
        )
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            alpha = 0.9F
        )
        Greeting(
            title = title,
            definition = definition,
            meaning = meaning,
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
    MyApplicationTheme {
        AppImage("Jetpack Compose Tutorial", "Jetpack Compose is Android's recommended modern" +
                " toolkit for building native UI. It simplifies and accelerates UI" +
                " development on Android. Quickly bring your" +
                " app to life with less code, powerful tools, and intuitive Kotlin APIs.",
            "Compose addresses coupling issue that exists in the UI development with XML. When we initial" +
                    "ze our views written in XML in the code written in Java/Kotlin, it generates the po" +
                    "ssibility of Null Reference errors " +
                    "and makes it difficult to maintain. Jetpack Compose tries to minimize the coupling in the application.")
    }
}