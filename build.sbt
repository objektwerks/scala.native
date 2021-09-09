enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)
// Set to false or remove if you want to show stubs as linking errors.
nativeLinkStubs := true