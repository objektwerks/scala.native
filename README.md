Scala Native
------------
>Scala native feature app and test built on Apple M1.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Test
----
1. sbt clean test

Run
---
>To run scala-native-out, the scala native app:
1. sbt run
2. target/scala-2.13/scala-native-out

Publish
-------
1. sbt clean compile nativeLink
2. mv target/scala-2.13/scala-native-out target/scala-2.13/isprime
3. sudo cp target/scala-2.13/isprime /usr/local/bin

Execute
-------
1. isprime

Resources
---------
1. Scala Native Docs - http://www.scala-native.org/en/latest/index.html
2. Scala Native Intro Video - https://www.youtube.com/watch?v=u2CnE-sRdBw
