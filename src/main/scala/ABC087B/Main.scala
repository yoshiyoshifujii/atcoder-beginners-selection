package ABC087B

object Main extends App {
  import io.StdIn._
  val a = 0 to readInt
  val b = 0 to readInt
  val c = 0 to readInt
  val x = readInt

  val r = for {
    i <- a
    j <- b
    k <- c
    if x == (500 * i) + (100 * j) + (50 * k)
  } yield 1
  print(r.size)
}
