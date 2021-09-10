package objektwerks

import scala.io.StdIn

object PrimeApp {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val line = StdIn.readLine()
    val number = if (line == null) 1 else line.toIntOption.getOrElse(1)
    println(s"Is $number prime: ${Prime.isPrime(number)}")
  }
}