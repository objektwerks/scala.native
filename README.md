Scala Native
------------
>Scala native feature apps and tests, built on Apple M1.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Test
----
1. sbt clean test

Run
---
>Currently, both PrimeApp and PrimeTest run as expected via Intellij. But not via Sbt.
1. sbt run