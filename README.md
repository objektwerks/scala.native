Scala Native
------------
>Scala native feature apps and tests, built on Apple M1.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Cross Project
-------------
>Cross project is currently disabled. See plugins.sbt and build.sbt.

Notes
-----
1. In crossproject mode, Sbt fails to find Scalatest dependencies; yet JVM and Native tests pass.
2. PrimeApp does execute correctly via Sbt.

Test
----
1. sbt clean test

Run
---
>StdIn.readLine is ignored in PrimeApp!
1. sbt run

Publish
-------
1. sbt clean compile publishLocal

Resources
---------
1. Scala Native Docs - http://www.scala-native.org/en/latest/index.html
2. Scala Native Intro Video - https://www.youtube.com/watch?v=u2CnE-sRdBw