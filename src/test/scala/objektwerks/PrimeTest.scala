package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Prime.*

final class PrimeTest extends AnyFunSuite with Matchers:
  test("prime"):  
    isPrime(3) shouldBe true
    isPrime(6) shouldBe false