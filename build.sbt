import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.1.3-RC3"
libraryDependencies ++= Seq(
  "com.outr" %%% "scribe" % "3.8.2",
  "org.scalatest" %%% "scalatest" % "3.2.12" % Test
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
nativeLinkingOptions ++= Seq(
  "-L/opt/homebrew/lib"
)
