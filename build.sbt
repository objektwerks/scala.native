enablePlugins(ScalaNativePlugin)

name := "scala.native"

lazy val core = Defaults.coreDefaultSettings ++ Seq(
  organization := "objektwerks",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.6",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  ),
  nativeLinkStubs := true
)

lazy val project = crossProject(JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .withoutSuffixFor(JVMPlatform)
  .in(file("."))
  .settings(core)
  .nativeSettings(Nil)
  .jvmSettings(Nil)