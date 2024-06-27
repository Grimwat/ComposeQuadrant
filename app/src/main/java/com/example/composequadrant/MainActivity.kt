package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                ) { Quadrant()
                }
            }
        }
    }
}


@Composable
fun Card (head: String, para: String, modifier: Modifier = Modifier)
{
Column (modifier = modifier.padding(16.dp).fillMaxHeight(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    ) {

    Text(
        text = head,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text(
        text = para,
        textAlign = TextAlign.Justify,
        modifier = Modifier

    )
}
}


@Composable
fun Quadrant( modifier: Modifier = Modifier){
    Column (modifier = modifier){
        Row(modifier = modifier.weight(1f)) {

            Card(
                head = stringResource(R.string.h1),
                para = stringResource(R.string.p1),
                modifier = Modifier.weight(1f).background(color = Color(0xFFEADDFF)),
            )
            Card(
                head = stringResource(R.string.h2),
                para = stringResource(R.string.p2),
                modifier = Modifier.weight(1f).background(color = Color(0xFFD0BCFF)))
    }
        Row (modifier = modifier.weight(1f)) {
            Card(
                head = stringResource(R.string.h3),
                para = stringResource(R.string.p3),
                modifier = Modifier.weight(1f).background(color = Color(0xFFB69DF8)),
            )
            Card(
                 head = stringResource(R.string.h4),
                 para = stringResource(R.string.p4),
                 modifier = Modifier.weight(1f).background(color = Color(0xFFF6EDFF)))
        }

    }
}




@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Quadrant(

            )

    }
}


