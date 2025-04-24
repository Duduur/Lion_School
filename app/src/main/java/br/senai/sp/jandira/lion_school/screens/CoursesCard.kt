package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CourseStatus(
    cursoNome : String = "sigla",
    nomeCurso : String = "nome do Curso",
    textpequeno : String = "texto de baixo",
    bulletImg : Painter = painterResource(R.drawable.galeria),
    background: Brush = Brush.horizontalGradient(
        listOf(
            Color(0xff3347B0),
            Color(0xffCFD4EA),
        )
    ),
    clock: Painter = painterResource(R.drawable.relogio),
    coursetime : String = "Tempo do Curso"
){
    Card(
        modifier = Modifier
            .width(320.dp)
            .padding(bottom = 10.dp)
            .height(210.dp),
        shape = RoundedCornerShape(30.dp),
        border = BorderStroke(2.dp, Color(0xffFFC23D))
        
    ) {
       Box(
           modifier = Modifier
               .fillMaxSize()
               .background(background)

       ){
           Column (
           ){
               Row (
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(start = 20.dp),
                   verticalAlignment = Alignment.CenterVertically,

               ){
                   Image(
                       painter = bulletImg,
                       contentDescription = "",
                       modifier = Modifier
                           .size(100.dp)

                   )
                   Spacer(modifier = Modifier .width(20.dp))
                   Text(
                       text = cursoNome,
                       fontSize = 64.sp,
                       fontWeight = FontWeight.SemiBold,
                       color = Color(0xffFFC23D)
                   )
               }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .padding(start = 20.dp)
                ){
                    Text(
                        text = nomeCurso,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                    Text(
                        text = textpequeno,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }
               Row (
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(start = 30.dp)
                       .padding(top = 20.dp),
                   verticalAlignment = Alignment.CenterVertically
               ){
                   Image(
                       painter = clock,
                       contentDescription = "",
                       modifier = Modifier
                           .size(13.dp)
                   )
                   Spacer(modifier = Modifier .width(8.dp))
                   Text(
                       text = coursetime,
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
private fun CourseStatusPreview(){
    CourseStatus()
}