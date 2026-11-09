package uk.ac.tees.mad.f5485349

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

object Routes {
    const val SPLASH = "splash"
    const val HOME = "home"
    const val DETAIL = "detail/{spotId}"
    const val FAVOURITES = "favourites"
    fun detail(id: Int) = "detail/$id"
}

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = Routes.SPLASH) {
        composable(Routes.SPLASH) {
            SplashScreen(onFinished = {
                nav.navigate(Routes.HOME) { popUpTo(Routes.SPLASH) { inclusive = true } }
            })
        }
        composable(Routes.HOME) {
            HomeScreen(
                onSpotClick = { nav.navigate(Routes.detail(it)) },
                onFavourites = { nav.navigate(Routes.FAVOURITES) }
            )
        }
        composable(
            Routes.DETAIL,
            arguments = listOf(navArgument("spotId") { type = NavType.IntType })
        ) { entry ->
            DetailScreen(spotId = entry.arguments?.getInt("spotId") ?: -1, onBack = { nav.popBackStack() })
        }
        composable(Routes.FAVOURITES) { FavouritesScreen(onBack = { nav.popBackStack() }) }
    }
}
