import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.1.1"
libraryDependencies ++= Seq(
  "com.outr" %%% "scribe" % "3.6.3",
  "org.scalatest" %%% "scalatest" % "3.2.10" % Test
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
nativeLinkingOptions ++= Seq(
  "-L/opt/homebrew/lib"
)
