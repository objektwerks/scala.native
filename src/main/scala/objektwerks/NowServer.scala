package objektwerks

import java.time.Instant

import snunit._

object NowServer {
  def main(args: Array[String]): Unit = {
    val server = SyncServerBuilder().withRequestHandler( request =>
      request.send(
        statusCode = StatusCode.OK,
        content = Instant.now().toString,
        headers = Seq("Content-Type" -> "text/plain")
      )
    ).build()
    server.listen()
  }
}