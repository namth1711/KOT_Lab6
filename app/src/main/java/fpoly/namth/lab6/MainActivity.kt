package fpoly.namth.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.namth.lab6.ui.screens.Home
import fpoly.namth.lab6.ui.screens.Bai1
import fpoly.namth.lab6.ui.screens.Bai2
import fpoly.namth.lab6.ui.screens.Bai3
import fpoly.namth.lab6.ui.theme.Lab6Theme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navControl = rememberNavController()
                NavHost(navController = navControl,
                    startDestination = "home"
                ){
                    composable("home"){
                        Home(navControl)
                    }
                    composable("bai1"){
                        Bai1()
                    }
                    composable("bai2"){
                        Bai2()

                    }
                    composable("bai3"){
                        Bai3()
                    }

                }
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab6Theme {
        Greeting("Android")
    }
}