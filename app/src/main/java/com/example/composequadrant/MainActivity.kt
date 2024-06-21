package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant ()
                }
            }
        }
    }
}
@Composable
fun Topleft (head2: String, para2: String, modifier: Modifier = Modifier ) {

    Text(
        text = head2,
        fontWeight = FontWeight.Bold,
        Modifier = Modifier
            .padding(16.dp)
    )
    Text (
        text = para2,

    )
}

@Composable
fun Topright (head1: String, para1: String, modifier: Modifier = Modifier) {

    Image(

    )
    Text(
        text = head1,
        fontweight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        Modifier = Modifier
            .padding(16.dp)
    )
    Text(
        text = para1,
        textAlign = TextAlign.Center,
        Modifier = modifier

    )
}

@Composable
fun Quadrant(head1: String, para1: String, modifier: Modifier = Modifier){
    Column(){
        Row{
            Box{

            }
            Box{

            }
        }
        Row{
            Box{

            }
            Box{

            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Topright(
        head1 = stringResource(R.string.Head1),
        para1 = stringResource(R.string.para1)
        )

    }
}