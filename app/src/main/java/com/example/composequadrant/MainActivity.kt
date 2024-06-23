package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Texttr(head1: String,para1: String, modifier: Modifier)
{

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {

        Text(
            text = head1,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 16.dp)
            )
        Text(
            text = para1)
    }
}
@Composable
fun Texttl(head2: String,para2: String, modifier: Modifier)
{

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {

        Text(
            text = head2,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 16.dp)
        )
        Text(
            text = para2)
    }
}

@Preview(showBackground = true)
@Composable
fun Quadrant( modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Box{

                Texttl(
                    head2 = stringResource(R.string.head2),
                    para2 = stringResource(R.string.para2),
                    modifier = modifier
                )

            }
            Box{
                Texttr(
                    head1 = stringResource(R.string.Head1),
                    para1 = stringResource(R.string.para1),
                    modifier = modifier
                )

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
        Texttr(
            modifier = Modifier,
            head1 = stringResource(R.string.Head1),
            para1 = stringResource(R.string.para1),
        )
        Texttl(
            modifier = Modifier,
            head2 = stringResource(R.string.head2),
            para2 = stringResource(R.string.para2),
        )
    }
}
        