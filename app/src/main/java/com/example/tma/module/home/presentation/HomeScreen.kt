package com.example.tma.module.home.presentation

import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.lerp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tma.core.route.AppRouteName
import com.example.tma.core.theme.BlueVariant
import com.example.tma.core.theme.Gray
import com.example.tma.core.theme.lavender
import com.example.tma.module.home.model.monumentsNearYou
import com.example.tma.module.home.model.Museums
import com.example.tma.module.home.model.Malls
import com.example.tma.R
import com.example.tma.module.home.model.Card
import com.example.tma.module.home.model.sportsClubs
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue
import androidx.compose.material.Text as Text1

@Composable
fun HomeScreen(
    navController: NavHostController,
) {
    val scrollState = rememberScrollState()

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(
                    top = padding.calculateTopPadding() + 24.dp,
                    bottom = padding.calculateBottomPadding() + 24.dp,
                )
        ) {
            Spacer(modifier = Modifier.height(4.dp))
            Categories()
            Spacer(modifier = Modifier.height(24.dp))
            Text1(
                text = "Welcome back, Paula!",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text1(
                text = "Find your type of entertainment Here!",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text1(
                    text = "Check out What's near you",
                    style = MaterialTheme.typography.h6,
                )
                TextButton(onClick = { }) {
                    Text1(text = "See All")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            monumentsNearYou {
                navController.navigate("${AppRouteName.Detail}/${it.id}")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text1(
                    text = "Museums",
                    style = MaterialTheme.typography.h6,
                )
                TextButton(onClick = { }) {
                    Text1(text = "See All")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Museums()
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text1(
                    text = "Malls",
                    style = MaterialTheme.typography.h6,
                )
                TextButton(onClick = { }) {
                    Text1(text = "See All")
                }
            }
            Malls()
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text1(
                    text = "Hotels",
                    style = MaterialTheme.typography.h6,
                )
                TextButton(onClick = { }) {
                    Text1(text = "See All")
                }
            }
            Hotels()
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text1(
                    text = "Sports Clubs",
                    style = MaterialTheme.typography.h6,
                )
                TextButton(onClick = { }) {
                    Text1(text = "See All")
                }
            }
            sportsClubs()
            Banners()
        }
    }
}

@Composable
fun Museums() {
    LazyRow(
        contentPadding = PaddingValues(start = 24.dp)
    ) {
        items(count = Museums.size) { index ->
            Box(modifier = Modifier
                .padding(end = 24.dp)
                .clickable { }) {
                Column(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = Museums[index].assetImage),
                        contentDescription = "Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(width = 200.dp, height = 260.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text1(
                        text = Museums[index].title,
                        style = MaterialTheme.typography.subtitle1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}
@Composable
fun Malls() {
    LazyRow(
        contentPadding = PaddingValues(start = 24.dp)
    ) {
        items(count = Malls.size) { index ->
            Box(modifier = Modifier
                .padding(end = 24.dp)
                .clickable { }) {
                Column(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = Malls[index].assetImage),
                        contentDescription = "Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(width = 200.dp, height = 260.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text1(
                        text = Malls[index].title,
                        style = MaterialTheme.typography.subtitle1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}
@Composable
fun Hotels() {
    LazyRow(
        contentPadding = PaddingValues(start = 24.dp)
    ) {
        items(count = com.example.tma.module.home.model.Hotels.size) { index ->
            Box(modifier = Modifier
                .padding(end = 24.dp)
                .clickable { }) {
                Column(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = com.example.tma.module.home.model.Hotels[index].assetImage),
                        contentDescription = "Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(width = 200.dp, height = 260.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text1(
                        text = com.example.tma.module.home.model.Hotels[index].title,
                        style = MaterialTheme.typography.subtitle1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}
@Composable
fun sportsClubs() {
    LazyRow(
        contentPadding = PaddingValues(start = 24.dp)
    ) {
        items(count = sportsClubs.size) { index ->
            Box(modifier = Modifier
                .padding(end = 24.dp)
                .clickable { }) {
                Column(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = sportsClubs[index].assetImage),
                        contentDescription = "Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(width = 200.dp, height = 260.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text1(
                        text = sportsClubs[index].title,
                        style = MaterialTheme.typography.subtitle1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun monumentsNearYou(
    onMovieClicked: (Card) -> Unit
) {
    HorizontalPager(
        count = monumentsNearYou.size,
        contentPadding = PaddingValues(start = 48.dp, end = 48.dp)
    ) { page ->

        Column(
            modifier = Modifier
                .wrapContentHeight()
                .graphicsLayer {
                    val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                    lerp(
                        start = ScaleFactor(1f, 0.85f),
                        stop = ScaleFactor(1f, 1f),
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale.scaleX
                        scaleY = scale.scaleY
                    }
                }
                .clickable {
                    onMovieClicked(monumentsNearYou[page])
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.BottomCenter

            ) {
                Image(
                    painter = painterResource(id = monumentsNearYou[page].assetImage),
                    contentDescription = "Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.85f)
                        .height(340.dp)
                )
                Box(
                    modifier = Modifier
                        .graphicsLayer {
                            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                            val translation = pageOffset.coerceIn(0f, 1f)

                            translationY = translation * 200
                        }
                        .fillMaxWidth(fraction = 0.85f)
                        .wrapContentHeight()
                        .background(
                            BlueVariant
                        )
                        .padding(vertical = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text1(
                        "show details", style = MaterialTheme.typography.subtitle1.copy(
                            color = lavender,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text1(
                text = monumentsNearYou[page].title,
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun Categories() {
    val categories = listOf(
        "Museums",
        "Monuments",
        "Malls",
        "Sports clubs",
        "Hotels",
        "playing grounds",
    )
    val scrollState = rememberScrollState()

    Row(
        modifier = Modifier.horizontalScroll(scrollState)
    ) {
        repeat(categories.size) { index ->
            Surface(
                /// order matters
                modifier = Modifier
                    .padding(
                        start = if (index == 0) 24.dp else 0.dp,
                        end = 12.dp,
                    )
                    .border(width = 1.dp, color = Gray, shape = RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
                    .clickable { }
                    .padding(12.dp)
            ) {
                Text1(text = categories[index], style = MaterialTheme.typography.caption)
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Banners() {
    val banners = listOf(
        R.drawable.banner_1,
        R.drawable.banner_2,
        R.drawable.banner_3,
    )

    val pagerState = rememberPagerState()
    val bannerIndex = remember { mutableStateOf(0) }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            bannerIndex.value = page
        }
    }

    /// auto scroll
    LaunchedEffect(Unit) {
        while (true) {
            delay(10_000)
            tween<Float>(1500)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % pagerState.pageCount
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
            .padding(horizontal = 24.dp)
    ) {
        HorizontalPager(
            state = pagerState,
            count = banners.size,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
        ) { index ->
            Image(
                painter = painterResource(id = banners[index]),
                contentDescription = "Banners",
                contentScale = ContentScale.FillBounds,
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            repeat(banners.size) { index ->
                val height = 12.dp
                val width = if (index == bannerIndex.value) 28.dp else 12.dp
                val color = if (index == bannerIndex.value) lavender else Gray

                Surface(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .size(width, height)
                        .clip(RoundedCornerShape(20.dp)),
                    color = color,
                ) {
                }
            }
        }
    }
}