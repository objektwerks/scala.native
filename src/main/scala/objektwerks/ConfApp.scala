package objektwerks

import org.ekrich.config._

object ConfApp {
  def main(args: Array[String]): Unit = {
    val conf = ConfigFactory.load("app.conf")
    println(s"*** text: ${conf.getString("text")}")
    println(s"*** integer: ${conf.getInt("integer")}")
    println(s"*** double: ${conf.getDouble("double")}")
  }
}