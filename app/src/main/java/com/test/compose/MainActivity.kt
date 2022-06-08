package com.test.compose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.compose.ui.theme.MyComposeFirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeFirstTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    //Greeting("Android")
                    MessageCard(msg= Message("Colleague","take a look at Jetpack Compose"))
                }
            }
        }
    }
}

data class Message(val author:String,val body:String)

@Composable
fun MessageCard(msg:Message){
    Row{
        Image(painter = painterResource(id = R.drawable.emailicon),
            contentDescription = "fb login",
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondaryVariant)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = msg.author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle1
            )
            Text(text = msg.body,
            modifier = Modifier.padding(all = 4.dp),
            style = MaterialTheme.typography.body1
                )
        }
    }


}
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg= Message("Colleague","take a look at Jetpack Compose"))
}

/**
 * 夜間模式，代碼報錯
 */
/*@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)*/

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeFirstTheme {
        Greeting("Android")
    }
}