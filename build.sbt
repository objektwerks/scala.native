import scalanative.build.Mode

// and some aliases to avoid dealing with the implicit root project
addCommandAlias(
  "test",
  Seq(
    "primes/test",
    "primesNative/test",
  ).mkString(";", ";", "")
)

addCommandAlias(
  "clean",
  Seq(
    "primes/clean",
    "primesNative/clean",
  ).mkString(";", ";", "")
)

// could allow a command line arg as workaround to interactive
// > runNative 13
addCommandAlias(
  "runNative", "primesNative/run"
)

inThisBuild(
  List(
    organization := "objektwerks",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.13.6"
  )
)

lazy val primes = crossProject(JVMPlatform, NativePlatform)
  .withoutSuffixFor(JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(
    libraryDependencies ++= Seq(
          "org.scalatest" %%% "scalatest" % "3.2.9" % Test
    )
  )
  .jvmSettings()
  .nativeSettings(
    nativeLinkStubs := true,
    // consider commix and lto thin for best perf
    nativeConfig ~= {
      _.withMode(Mode.releaseFast)
    }
  )
