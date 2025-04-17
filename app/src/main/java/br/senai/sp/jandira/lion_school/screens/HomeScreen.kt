package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun HomeScreen(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(50.dp)
                    .height(200.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(160.dp)
                )

               Text(
                   text = "Lion\nSchool",
                   fontSize = 40.sp,
                   fontWeight = FontWeight.SemiBold,
                   color = Color(0xff3347b0)
               )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column (
                    modifier = Modifier
                        .padding(40.dp)
                        .fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Find your favorite course",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xff3347B0)
                    )

                    Card(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(bottom = 30.dp)
                            .height(6.dp)
                            .width(60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xffFFC23D))

                    ) { }
                    Text(
                        text = "Get to your destination faster, study at the best vocational school in Brazil. Be the best version of yourself.",
                        fontSize = 16.sp,
                        color = Color(0xFF9E9FA4),
                        textAlign = TextAlign.Center
                    )

                    Button(onClick = {},

                        colors = ButtonDefaults.buttonColors(Color(0xffFFC23D)),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .width(270.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 10.dp,
                            bottomStart = 10.dp,
                            bottomEnd = 10.dp
                        )
                    ) {
                        Text(
                            text = "Get Started",
                            fontSize = 17.sp,
                            color = Color(0xff3347B0)
                        )

                    }

                }
            }
        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
