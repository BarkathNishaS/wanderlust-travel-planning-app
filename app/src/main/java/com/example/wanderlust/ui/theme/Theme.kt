import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.wanderlust.ui.theme.Purple200
import com.example.wanderlust.ui.theme.Purple500
import com.example.wanderlust.ui.theme.Teal200
import kotlin.Unit as Shapes1

private val LightColorPalette = lightColorScheme(
    primary = Purple500,
    secondary = Teal200
    // ... other color roles
)

private val DarkColorPalette = darkColorScheme(
    primary = Purple200,
    secondary = Teal200
    // ... other color roles
)

@Composable
fun TravelAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Shapes1) {
    val colorScheme = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    Box {
        MaterialTheme(
            colorScheme, Typography, shapes = Shapes1, content
        )
    }
}

fun MaterialTheme(
    colorScheme: ColorScheme,
    typography: Typography,
    shapes: Shapes1,
    content: @Composable () -> Shapes1
) {
    TODO(buildString {
        append("Not yet implemented")
    })
}
