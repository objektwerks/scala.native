import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.6.3-RC2"
scalacOptions ++= Seq(
  "-Wall"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
