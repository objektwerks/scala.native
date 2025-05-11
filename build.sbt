import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.7.1-RC1"
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
