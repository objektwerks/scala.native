package objektwerks

import scala.io.StdIn.readLine
import scala.util.Try

object PrimeApp {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val line = readLine()
    val number = Try(line.toInt).getOrElse(1)
    println(s"Is $number prime: ${Prime.isPrime(number)}")
  }
}