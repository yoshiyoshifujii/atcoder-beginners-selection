package ABC083B

object Main extends App {
  val Array(n, a, b) = io.StdIn.readLine.split(" ").map(_.toInt)

  val r = (1 to n).filter { i =>
    val s = i.toString.toVector.map(_.toString.toInt).sum
    a <= s && s <= b
  }.sum
  print(r)
}
