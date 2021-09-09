import scala.annotation.tailrec
object Prime {
  def isPrime(n: Int): Boolean = {
    @tailrec
    def loop(current: Int): Boolean = {
      if (current > Math.sqrt( Math.abs(n.toDouble)) ) true
      else n % current != 0 && loop(current + 1)
    }
    if (n == -1 || n == 0 || n == 1) false else loop(2)
  }
}