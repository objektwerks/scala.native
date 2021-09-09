package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PrimeTest extends AnyFunSuite with Matchers {
  test("prime") {
    import Prime._
    
    isPrime(3) shouldBe true
    isPrime(6) shouldBe false
  }
}