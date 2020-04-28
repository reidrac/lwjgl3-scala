// build.sc
import mill._, scalalib._, scalafmt._

object game extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.13.1"

  val lwjglVersion = "3.2.3"
  val lwjglNatives = "natives-linux"

  def ivyDeps = Agg(
    ivy"org.lwjgl:lwjgl:$lwjglVersion",
    ivy"org.lwjgl:lwjgl:$lwjglVersion;classifier=$lwjglNatives",
    ivy"org.lwjgl:lwjgl-assimp:$lwjglVersion",
    ivy"org.lwjgl:lwjgl-assimp:$lwjglVersion;classifier=$lwjglNatives",
    ivy"org.lwjgl:lwjgl-glfw:$lwjglVersion",
    ivy"org.lwjgl:lwjgl-glfw:$lwjglVersion;classifier=$lwjglNatives",
    ivy"org.lwjgl:lwjgl-openal:$lwjglVersion",
    ivy"org.lwjgl:lwjgl-openal:$lwjglVersion;classifier=$lwjglNatives",
    ivy"org.lwjgl:lwjgl-opengl:$lwjglVersion",
    ivy"org.lwjgl:lwjgl-opengl:$lwjglVersion;classifier=$lwjglNatives",
    ivy"org.lwjgl:lwjgl-stb:$lwjglVersion",
    ivy"org.lwjgl:lwjgl-stb:$lwjglVersion;classifier=$lwjglNatives",
    )
}

