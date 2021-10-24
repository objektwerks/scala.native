package objektwerks

import java.time.Instant

import snunit._
import snunit.routes._
import trail._

object NowServer {
  def main(args: Array[String]): Unit = {
    val now  = Root / "now"
    AsyncServerBuilder()
      .withRequestHandler(
        _.withMethod(Method.GET)
          .withRoute(now) { case (request, _) =>
            request.send(
              statusCode = StatusCode.OK,
              content = Instant.now().toString,
              headers = Seq("Content-Type" -> "text/plain")
            )
          }
      )
      .build()
    ()
  }
}