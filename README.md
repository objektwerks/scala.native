Scala Native
------------
>Scala native app - tested and built on Apple M1.

Note
----
>Only ***select*** dependencies ***will*** work with the current Scala Native - ***0.5.1***.

Install
-------
>See http://www.scala-native.org/en/latest/user/setup.html for details.
1. brew install llvm

Run
---
>To run scala-native-out, the scala native app:
1. sbt run
2. target/scala-3.4.2-RC1/scala-native-out

Publish
-------
1. sbt clean compile nativeLink
2. mv target/scala-{version}/scala-native-out target/scala-{version}/isprime
3. sudo cp target/scala-{version}/isprime /usr/local/bin

Execute
-------
1. isprime

Resources
---------
1. [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
2. [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
