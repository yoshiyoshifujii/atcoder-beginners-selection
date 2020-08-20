package ABC086A

object Main extends App {
  import scala.io.StdIn._
  val Array(a, b) = readLine().split(" ").map(_.toInt)
  print(if ((a * b) % 2 == 0) "Even" else "Odd")
}
