package ABC088B

object Main extends App {
  import io.StdIn._
  val n  = readInt
  val an = readLine

  val r = an
    .split(" ")
    .map(_.toInt)
    .sortBy(identity)
    .reverse
    .zipWithIndex
    .foldLeft(0) { case (acc, (a, i)) => if (i % 2 == 0) acc + a else acc - a }
  print(r)
}
