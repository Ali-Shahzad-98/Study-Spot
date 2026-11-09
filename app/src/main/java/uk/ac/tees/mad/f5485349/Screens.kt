package uk.ac.tees.mad.f5485349

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onFinished: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(1500)
        onFinished()
    }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("StudySpot", style = MaterialTheme.typography.displayMedium)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onSpotClick: (Int) -> Unit, onFavourites: () -> Unit) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Study Spots") },
            actions = { TextButton(onClick = onFavourites) { Text("Favourites") } }
        )
    }) { padding ->
        LazyColumn(Modifier.padding(padding), contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(SpotRepository.getAll()) { spot ->
                Card(Modifier.fillMaxWidth().clickable { onSpotClick(spot.id) }) {
                    Column(Modifier.padding(16.dp)) {
                        Text(spot.name, style = MaterialTheme.typography.titleMedium)
                        Text("${spot.location} • ${spot.noiseLevel}")
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(spotId: Int, onBack: () -> Unit) {
    val spot = SpotRepository.getById(spotId)
    Scaffold(topBar = {
        TopAppBar(title = { Text(spot?.name ?: "Not found") },
            navigationIcon = { TextButton(onClick = onBack) { Text("Back") } })
    }) { padding ->
        Column(Modifier.padding(padding).padding(16.dp)) {
            if (spot == null) {
                Text("Sorry, that spot could not be found.")
            } else {
                Text("Location: ${spot.location}")
                Text("Noise level: ${spot.noiseLevel}")
                Spacer(Modifier.height(8.dp))
                Text(spot.description)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouritesScreen(onBack: () -> Unit) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Favourites") },
            navigationIcon = { TextButton(onClick = onBack) { Text("Back") } })
    }) { padding ->
        Box(Modifier.padding(padding).fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Coming in a later sprint (Room database)")
        }
    }
}
