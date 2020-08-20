package ABC081B

import scala.annotation.tailrec

object Main extends App {
  val n  = io.StdIn.readInt
  val an = io.StdIn.readLine.split(" ").map(_.toInt)
  print(rec(an))

  @tailrec
  def rec(in: Array[Int], count: Int = 0): Int =
    if (in.exists(_ % 2 == 1)) count else rec(in.map(_ / 2), count + 1)
}
