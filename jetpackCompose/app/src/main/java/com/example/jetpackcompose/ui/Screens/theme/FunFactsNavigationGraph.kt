import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.ui.Screens.theme.Routes
import com.example.jetpackcompose.ui.Screens.theme.UserInputScreen
import com.example.jetpackcompose.ui.Screens.theme.WelcomeScreens

@Composable
fun FunFactsNavigationGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController ()

    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen()
        }
        composable(Routes.WELCOME_SCREEN){
            WelcomeScreens()
        }
    }

}