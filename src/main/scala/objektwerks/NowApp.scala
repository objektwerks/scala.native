package objektwerks

import java.time._
import java.util.Date

object NowApp {
  def main(args: Array[String]): Unit = {
    println(s"*** Date: ${new Date().toString}")
    println(s"*** Instant: ${Instant.now().toString}")
    println(s"*** Local Date: ${LocalDate.now().toString}")
    println(s"*** Local Time: ${LocalTime.now().toString}")
  }
}