package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.ContactMail
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun UserCard(
    nomeUser:String = " Nome do Estudante",
    numeroRegistro : String = "0000000000",
    imagemUser: Painter = painterResource(R.drawable.user),
    dataCourse : String = "0000",
    color: Color = Color(0xff9FA9E1),
    colorCourse:Color = Color.Black
){
    Card(
        modifier = Modifier
            .width(320.dp)
            .height(80.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .width(14.dp)
                    .fillMaxHeight(),
                colors = CardDefaults.cardColors(containerColor = colorCourse),
                shape = RoundedCornerShape(
                    bottomStart = 8.dp,
                    topStart = 8.dp
                )
            ) { }
            Spacer(modifier = Modifier .width(10.dp))
            Image(
                painter = imagemUser,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = nomeUser,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Row(
                    modifier = Modifier
                        .padding(1.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.ContactMail,
                        contentDescription = "",
                        tint =Color.White
                    )
                    Spacer(modifier = Modifier .width(4.dp))
                    Text(
                        text = numeroRegistro,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }

                Row (
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(130.dp)
                        .padding(end = 1.dp)
                        .padding(start = 1.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Icon(
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "",
                        tint =Color.White
                    )
                    Spacer(modifier = Modifier .width(4.dp))
                    Text(
                        text = numeroRegistro,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }
            }


        }
    }
}

@Preview
@Composable

fun UserCardPreview(){
    UserCard()
}