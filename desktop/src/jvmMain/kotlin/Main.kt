import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.ode.code.common.view.AppUi

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MiQuickBill",
        state = rememberWindowState(isMinimized = false),
    ) {
        MaterialTheme(colors = lightColors()) {
            AppUi()
        }
    }
}