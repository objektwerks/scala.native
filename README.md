Scala Native
------------
>Scala native app, tested and built on Apple M1, using Scala 3.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Run
---
1. sbt run

Publish
-------
1. sbt clean compile nativeLink
2. mv target/scala-3.7.0-RC4/scala-native target/scala-3.7.0-RC4/isprime
3. sudo cp target/scala-3.7.0-RC4/isprime /usr/local/bin

Execute
-------
1. isprime

Resources
---------
1. [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
2. [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
