package objektwerks

import scala.io.StdIn.readLine
object Primeapp {
  def main(args: Array[String]): Unit = {
    println("Provide a number: ")
    val line = readLine()
    val number = if (line == null) 1 else line.toIntOption.getOrElse(1)
    println(s"Is this number: $number prime: ${Prime.isPrime(number)}")
  }
}