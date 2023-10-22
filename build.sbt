import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT
scalaVersion := "3.3.1"
libraryDependencies ++= Seq(
  "com.outr" %%% "scribe" % "3.12.2",
  "org.scalatest" %%% "scalatest" % "3.2.17" % Test
)
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
nativeLinkingOptions ++= Seq(
  "-L/opt/homebrew/lib"
)
