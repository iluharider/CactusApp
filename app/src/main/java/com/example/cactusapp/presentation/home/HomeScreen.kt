package com.example.cactusapp.presentation.home
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.cactusapp.presentation.sign_in.UserData
import com.example.cactusapp.R
import android.content.Context
import androidx.compose.material3.Scaffold
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.cactusapp.BottomBar1


@Composable
fun HomeScreen(
    navController : NavHostController
) {
    Scaffold(
        bottomBar = { BottomBar1(navController = navController) }) { padding ->
        var modifier = Modifier.padding(padding)


        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(stringResource(id = R.string.home_title), fontSize = 40.sp, fontWeight = FontWeight.Bold)

        }
    }
}