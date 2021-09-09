enablePlugins(ScalaNativePlugin)

name := "scala.native"

lazy val common = Defaults.coreDefaultSettings ++ Seq(
  organization := "objektwerks",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.6"
)

lazy val native = crossProject(JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .withoutSuffixFor(JVMPlatform)
  .in(file("."))
  .settings(common)
  .nativeSettings(Nil)
  .jvmSettings(Nil)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test
    ),
    nativeLinkStubs := true
  )