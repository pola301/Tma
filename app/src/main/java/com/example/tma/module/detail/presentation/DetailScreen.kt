package com.example.tma.module.detail.presentation

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tma.core.route.AppRouteName
import com.example.tma.core.theme.Gray
import com.example.tma.core.theme.lavender
import com.example.tma.module.home.model.Card
import com.example.tma.R

@Composable
fun DetailScreen(
    navController: NavHostController,
    card: Card,
) {
    val scrollState = rememberScrollState()

    Scaffold(
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            Button(
                modifier = Modifier
                    .wrapContentWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = lavender
                ),
                shape = RoundedCornerShape(32.dp),
                onClick = {
                    navController.navigate(AppRouteName.Maps)
                },
            ) {
                Text(text = "Location")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Row(
                modifier = Modifier.padding(
                    horizontal = 16.dp, vertical = 8.dp
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back Button")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Details", style = MaterialTheme.typography.h6)
            }
            Row(
                modifier = Modifier
                    .height(320.dp)
                    .padding(horizontal = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = card.assetImage),
                    contentDescription = "Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .weight(0.7f)
                        .height(320.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Spacer(modifier = Modifier.width(24.dp))
                Column(
                    modifier = Modifier
                        .height(320.dp)
                        .weight(0.3f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    MoreInfo(
                        painterResourceId = R.drawable.baseline_airplane_ticket_24,
                        title = "Tickets price",
                        value = card.ticketsPrice
                    )
                    MoreInfo(
                        painterResourceId = R.drawable.baseline_add_location_alt_24,
                        title = "location",
                        value = card.location
                    )
                    MoreInfo(
                        painterResourceId = R.drawable.baseline_stars,
                        title = "Rating",
                        value = card.rating
                    )
                }
            }
            Text(
                card.title, style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(
                    horizontal = 24.dp, vertical = 16.dp
                )
            )
            Text(
                "Details", style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(
                    horizontal = 24.dp
                )
            )
            Text(
                card.Details, style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(
                    horizontal = 24.dp, vertical = 16.dp
                )
            )
            Spacer(modifier = Modifier.height(64.dp))
        }
    }
}

@Composable
fun MoreInfo(
    @DrawableRes painterResourceId: Int,
    title: String,
    value: String,
) {
    Column(
        modifier = Modifier
            .border(width = 1.dp, color = Gray, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .clickable { }
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            painter = painterResource(id = painterResourceId),
            contentDescription = title,
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title, style = MaterialTheme.typography.body2)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = value, style = MaterialTheme.typography.subtitle1)
    }
}