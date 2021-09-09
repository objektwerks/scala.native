enablePlugins(ScalaNativePlugin)

import scalanative.build.Mode
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}

name := "scala.native"

lazy val common = Defaults.coreDefaultSettings ++ Seq(
  organization := "objektwerks",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.6"
)

lazy val project = crossProject(JVMPlatform, NativePlatform)
  .withoutSuffixFor(JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(common)
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test
    )
  )
  .nativeSettings(
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_native0.4_2.13" % "3.2.9" % Test
    ),
    nativeLinkStubs := true
  )