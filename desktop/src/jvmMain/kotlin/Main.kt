import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.ode.code.common.screen.LoginPage

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MiQuickBill",
        state = rememberWindowState(isMinimized = false),
    ) {
        MaterialTheme {
            LoginPage()
        }
    }
}