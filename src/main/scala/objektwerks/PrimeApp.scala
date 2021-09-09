package objektwerks

import scala.io.StdIn.readLine

object PrimeApp {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val line = readLine()
    val number = line.toIntOption.getOrElse(1)
    println(s"Is $number prime: ${Prime.isPrime(number)}")
  }
}