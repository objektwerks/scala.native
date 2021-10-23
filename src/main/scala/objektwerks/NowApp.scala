package objektwerks

import java.util.Date

object NowApp {
  def main(args: Array[String]): Unit = {
    println(s"*** Now: ${new Date().toString}")
  }
}