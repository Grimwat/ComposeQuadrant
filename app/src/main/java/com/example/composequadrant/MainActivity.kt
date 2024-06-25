package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                ) { Quadrant(
                    head1 = stringResource(R.string.h1),
                    para1 = stringResource(R.string.p1),
                    head2 = stringResource(R.string.h2),
                    para2 = stringResource(R.string.p2),
                    head3 = stringResource(R.string.h3),
                    para3 = stringResource(R.string.p3),
                    head4 = stringResource(R.string.h4),
                    para4 = stringResource(R.string.p4)
                )
                }
            }
        }
    }
}


@Composable
fun Cardone (head1: String, para1: String, modifier: Modifier = Modifier)
{
Column (modifier = Modifier.padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    ){

    }
    Text (
        text = head1,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp)
        )
    Text (
        text = para1,
        textAlign = TextAlign.Justify,
        modifier = modifier

    )

}
@Composable
fun Cardtwo (head2: String, para2: String, modifier: Modifier = Modifier)
{
    Column (modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

    }
    Text (
        text = head2,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text (
        text = para2,
        textAlign = TextAlign.Justify,
        modifier = modifier

    )

}
@Composable
fun Cardthree (head3: String, para3: String, modifier: Modifier = Modifier)
{
    Column (modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

    }
    Text (
        text = head3,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text (
        text = para3,
        textAlign = TextAlign.Justify,
        modifier = modifier

    )

}
@Composable
fun Cardfour (head4: String, para4: String, modifier: Modifier = Modifier)
{
    Column (modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

    }
    Text (
        text = head4,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text (
        text = para4,
        textAlign = TextAlign.Justify,
        modifier = modifier

    )

}
@Composable
fun Twoinfocards(head1: String, para1: String, head2: String, para2: String, modifier: Modifier) {
    Row(modifier.weight(1f)) {
        Cardone(
            head1 = head1,
            para1 = para1,
            modifier = Modifier
        )
        Cardtwo(
            head2 = head2,
            para2 = para2,
            modifier = Modifier
        )

    }
}
@Composable
fun Bottominfocards(head3: String, para3: String, head4: String, para4: String, modifier: Modifier = Modifier){
    Row(modifier.weight(1f)) {
        Cardthree(
            head3 = head3,
            para3 = para3,
            modifier = Modifier
        )
        Cardfour(
            head4 = head4,
            para4 = para4,
            modifier = Modifier
        )

    }
}

@Composable
fun Quadrant(head1: String, para1: String, head2: String,para2: String,head3: String,para3: String, head4: String,para4: String, modifier: Modifier = Modifier){
    Column {
        Twoinfocards(
            head1 = head1,
            para1 = para1,
            head2 = head2,
            para2 = para2,
            modifier = modifier )
        Bottominfocards(
            head3 = head3 ,
            para3 = para3,
            head4 = head4,
            para4 = para4)
    }
}




@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Cardone(
            head1 = stringResource(R.string.h1),
            para1 = stringResource(R.string.p1)
        )
        Cardtwo(
            head2 = stringResource(R.string.h2),
            para2 = stringResource(R.string.p2)
        )
        Cardthree (
            head3 = stringResource(R.string.h3),
            para3 = stringResource(R.string.p3)
        )
        Cardfour (
            head4 = stringResource(R.string.h4),
            para4 = stringResource(R.string.p4)
        )
    }
}


