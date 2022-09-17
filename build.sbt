import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.1-RC2"
libraryDependencies ++= Seq(
  "com.outr" %%% "scribe" % "3.10.3",
  "org.scalatest" %%% "scalatest" % "3.2.13" % Test
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
nativeLinkingOptions ++= Seq(
  "-L/opt/homebrew/lib"
)
