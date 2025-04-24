package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun  CourseScreen(){
    val scroll = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 20.dp)
                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(70.dp)
                    )
                    Text(
                        text = "Lion\nSchool",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xff3347b0)
                    )
                }
            }

            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(350.dp),
                color = Color(0xffFFC23D)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(350.dp)
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(10.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint =Color(0xff9E9FA4)
                    )
                },
                label = {
                    Text(
                        text = "Find your course"
                    )
                }
            )

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp)
                    .padding(top = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.lista
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(36.dp)
                )
                Text(
                    text = "Courses",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xff3347b0)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scroll)
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ){
               CourseStatus(
                   cursoNome = "DS",
                   bulletImg = painterResource(R.drawable.ds),
                   nomeCurso = "Desenvolvimento de Sistemas",
                   textpequeno = "Learn to develop web and mobile applications.",
                   coursetime = "3 semesters"
               )
                CourseStatus(
                    cursoNome = "RDS",
                    bulletImg = painterResource(R.drawable.rds),
                    nomeCurso = "Redes de Computadores",
                    textpequeno = "Learn to develop web and mobile applications.",
                    coursetime = "3 semesters"
                )
                CourseStatus(
                    cursoNome = "ELE",
                    bulletImg = painterResource(R.drawable.ele),
                    nomeCurso = " Eletroeletrônica",
                    textpequeno = "Learn to develop web and mobile applications.",
                    coursetime = "3 semesters"
                )
            }
        }

    }
}

@Preview
@Composable
private fun  CourseScreenPreview(){
    CourseScreen()
}