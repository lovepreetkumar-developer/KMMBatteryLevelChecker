import platform.UIKit.UIDevice
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatterLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batterLevel = UIDevice.currentDevice.batteryLevel
        return (batterLevel * 100).roundToInt()
    }
}