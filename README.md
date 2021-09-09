Scala Native
------------
>Scala native feature apps and tests, built on Apple M1.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Test
----
>Sbt fails to recognize Scalatest dependencies; yet JVM and Native unit tests pass.
1. sbt clean test

Run
---
>Currently, both PrimeApp and PrimeTest run as expected via Intellij. But not via Sbt.
1. sbt run

Publish
-------
1. sbt clean compile publishLocal

Resources
---------
1. Scala Native Docs - http://www.scala-native.org/en/latest/index.html
2. Scala Native Intro Video - https://www.youtube.com/watch?v=u2CnE-sRdBw