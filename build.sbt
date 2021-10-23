import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "scala.native"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= Seq(
  "org.ekrich" %%% "sjavatime" % "1.1.5",
  "org.scalatest" %%% "scalatest" % "3.2.10" % Test
)
nativeLinkStubs := true
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}

/*
lazy val scala_native = crossProject(JVMPlatform, NativePlatform)
  .withoutSuffixFor(JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(
    organization := "objektwerks",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.13.6"
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test
    )
  )
  .nativeSettings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.2.9" % Test
    ),
    nativeLinkStubs := true,
    nativeConfig ~= {
      _.withMode(Mode.releaseFast)
    }
  )
*/
