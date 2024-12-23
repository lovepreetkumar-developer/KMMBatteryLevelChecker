@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package kmmbatterylevelchecker.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.DrawableResource

private object CommonMainDrawable0 {
  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }

  public val dummy_image: DrawableResource by 
      lazy { init_dummy_image() }
}

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmmbatterylevelchecker.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)

internal val Res.drawable.dummy_image: DrawableResource
  get() = CommonMainDrawable0.dummy_image

private fun init_dummy_image(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:dummy_image",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kmmbatterylevelchecker.composeapp.generated.resources/drawable/dummy_image.png", -1, -1),
    )
)
