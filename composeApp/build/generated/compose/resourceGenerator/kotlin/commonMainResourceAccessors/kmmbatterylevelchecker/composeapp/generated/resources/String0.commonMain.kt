@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package kmmbatterylevelchecker.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val app_name: StringResource by 
      lazy { init_app_name() }
}

internal val Res.string.app_name: StringResource
  get() = CommonMainString0.app_name

private fun init_app_name(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:app_name", "app_name",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmmbatterylevelchecker.composeapp.generated.resources/values/strings.commonMain.cvr",
    10, 44),
    )
)
