import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import composemphelloworld.composeapp.generated.resources.Res
import composemphelloworld.composeapp.generated.resources.app_name
import composemphelloworld.composeapp.generated.resources.dummy_image
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            //Image(painterResource(Res.drawable.dummy_image), null)
            Text(text = "The current batter level is ${batteryManager.getBatterLevel()}%")
        }
    }
}