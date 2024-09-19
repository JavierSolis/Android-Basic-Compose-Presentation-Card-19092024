package codelab.javiersolis.presentationcard19092024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import codelab.javiersolis.presentationcard19092024.ui.theme.AndroidComposeBasicPresentationCard19092024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidComposeBasicPresentationCard19092024Theme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    ScreenContactView(
                        modifier =
                        Modifier
                            .fillMaxSize()
                            .background(color =
                                colorResource(id = R.color.background)
                            )
                            .padding(bottom = 70.dp)
                    )
                }


            }
        }
    }
}

@Composable
fun ScreenContactView(modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.background)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            LogoView(
                name = "Javier J. Solis Flores",
                title = "Android Developer Senior",
            )
        }


        ContactView(
            contacts = arrayListOf(
                "🐙 github/JavierSolis",
                "💼 linkedin/javier-solis-flores",
                "🖼 behance/JavierJSolis"
            ),
        )
    }
}
@Composable
fun ContactItemView(info:String,modifier: Modifier = Modifier){
    Column (
    ){
        Text(
            text = info,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.contact),
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun ContactView(contacts:ArrayList<String>,modifier: Modifier = Modifier){
    Column (
        modifier = modifier
    ){
        contacts.forEach {
            ContactItemView(
                info = it,
                modifier = modifier
            )
        }
    }
}

@Composable
fun LogoView(name: String, title:String,modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ){
        Image(
            painter = painterResource(id = R.drawable.pluginicon),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
        )
        Text(
            text = name,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            color = colorResource(id = R.color.name),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = colorResource(id = R.color.title),
        )
    }

}

@Preview(showBackground = true)
@Composable
fun LogoViewPreview() {
    AndroidComposeBasicPresentationCard19092024Theme {
        LogoView(
            "Javier J. Solis Flores",
            "Android Developer Senior",
            modifier = Modifier
                .width(400.dp)
                .height(400.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContactItemPreview() {
    AndroidComposeBasicPresentationCard19092024Theme {
        ContactItemView(
            info="github.com/JavierSolis"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContactPreview() {
    AndroidComposeBasicPresentationCard19092024Theme {
        ContactView(
            contacts = arrayListOf(
                "🐙 github/JavierSolis",
                "💼 linkedin/javier-solis-flores",
                "🖼 behance/JavierJSolis"
            )
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ScreenContactPreview() {
    AndroidComposeBasicPresentationCard19092024Theme {
        ScreenContactView()
    }
}
