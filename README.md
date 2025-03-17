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
1. sbt run

Publish
-------
1. sbt clean compile nativeLink
2. mv target/scala-3.7.0-RC1/scala-native target/scala-3.7.0-RC1/isprime
3. sudo cp target/scala-3.7.0-RC1/isprime /usr/local/bin

Execute
-------
1. isprime

Resources
---------
1. [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
2. [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)