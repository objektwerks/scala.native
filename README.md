Scala Native
------------
>Scala native feature app and test built on Apple M1.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm
2. brew install nginx/unit/unit
3. brew install unit-java ( not sure about this, but requires Java )

NGINX Unit
----------
>See documentation at: http://unit.nginx.org
1. start: unitd --control 127.0.0.1:7676
2. stop: pkill unitd

Issues
------
1. In crossproject mode, Sbt fails to find Scalatest dependencies; yet JVM and Native tests pass. Why?

Cross Project
-------------
>Cross project is currently disabled. See plugins.sbt and build.sbt for details.

Issues
------
1. LcalaTime in sjavatime fails to yield a valid time.
2. ConfigFactory.load() and ConfigFactory.load("app.conf") fail to load.
3. SNUnit SyncServer emits this linker error: ```ld: library not found for -lunit```
4. SNUnit AsyncServer emits this linker error: ```ld: library not found for -luv```

Test
----
1. sbt clean test

Run
---
1. sbt run
2. Multiple main classes detected. Select one to run:
   * [1] objektwerks.ConfApp
   * [2] objektwerks.NowApp
   * [3] objektwerks.NowAsyncServer
   * [4] objektwerks.NowServer
   * [5] objektwerks.PrimeApp
3. target/scala-2.13/scala-native-out  ( scala-native-out is the distributable M1 console app! )
    * file target/scala-2.13/scala-native-out ( Mach-O 64-bit executable arm64 )

Publish
-------
1. sbt clean nativeLink package publishLocal
2. Multiple main classes detected. Select one to run:
   * [1] objektwerks.ConfApp
   * [2] objektwerks.NowApp
   * [3] objektwerks.NowAsyncServer
   * [4] objektwerks.NowServer
   * [5] objektwerks.PrimeApp
3. Select 1 or 2. For instance, select 2 ( using isprime as the executable name )
4. mv target/scala-2.13/scala-native-out target/scala-2.13/isprime
5. sudo cp target/scala-2.13/isprime /usr/local/bin
6. isprime

Resources
---------
1. Scala Native Docs - http://www.scala-native.org/en/latest/index.html
2. Scala Native Intro Video - https://www.youtube.com/watch?v=u2CnE-sRdBw
3. Scala Native Performance - https://medium.com/virtuslab/revisiting-scala-native-performance-67029089f241