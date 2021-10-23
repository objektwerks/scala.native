package objektwerks

import java.util.Date

object DateTimeApp {
  def main(args: Array[String]): Unit = {
    println(s"*** Datetime: ${new Date().toString}")
  }
}