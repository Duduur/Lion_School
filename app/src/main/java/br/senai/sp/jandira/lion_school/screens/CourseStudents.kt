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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CourseStudents(){
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

                    Card(
                        modifier = Modifier
                            .padding(start = 160.dp)
                            .size(50.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(containerColor = Color(0xffFFC23D))
                    ) { }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .width(350.dp),
                color = Color(0xffFFC23D)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(350.dp)
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(10.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint =Color(0xff9E9FA4)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0xFFF5F5F5),
                    unfocusedBorderColor = Color(0xFFFFC23D)
                ),
                label = {
                    Text(
                        text = "Find a Student",
                        color = Color(0xFF9E9FA4)
                    )
                }
            )
            Column (
                modifier = Modifier
                    .fillMaxSize()
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(top = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                ){
                    Button(onClick = {},

                        colors = ButtonDefaults.buttonColors(Color(0xffFFC23D)),
                        modifier = Modifier
                            .width(90.dp)
                            .height(36.dp),

                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        ),

                        ) {
                        Text(
                            text = "Todos",
                            fontSize = 13.sp,
                            color = Color(0xff3347B0)
                        )

                    }

                    Spacer(modifier = Modifier .width(8.dp))
                    Button(onClick = {},

                        colors = ButtonDefaults.buttonColors(Color(0xffFFC23D)),
                        modifier = Modifier
                            .width(110.dp)
                            .height(36.dp),

                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        ),

                        ) {
                        Text(
                            text = "Cursando",
                            fontSize = 13.sp,
                            color = Color(0xff3347B0)
                        )

                    }
                    Spacer(modifier = Modifier .width(8.dp))
                    Button(onClick = {},

                        colors = ButtonDefaults.buttonColors(Color(0xffFFC23D)),
                        modifier = Modifier
                            .width(120.dp)
                            .height(36.dp),

                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        ),

                        ) {
                        Text(
                            text = "Finalizado",
                            fontSize = 13.sp,
                            color = Color(0xff3347B0)
                        )

                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                        .padding(top = 15.dp),
                    verticalAlignment = Alignment.CenterVertically,

                ){
                    Image(
                        painter = painterResource(
                            R.drawable.graducacao
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(36.dp)
                    )
                    Spacer(modifier = Modifier .width(3.dp))

                    Text(
                        text = "Students List",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xff3347b0)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun CourseStudentPreview(){
    CourseStudents()
}
