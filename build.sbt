import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.0-RC5"
libraryDependencies ++= Seq(
  "com.outr" %%% "scribe" % "3.11.1",
  "org.scalatest" %%% "scalatest" % "3.2.15" % Test
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
nativeLinkingOptions ++= Seq(
  "-L/opt/homebrew/lib"
)
