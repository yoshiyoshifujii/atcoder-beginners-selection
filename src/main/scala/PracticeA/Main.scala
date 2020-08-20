package PracticeA

object Main extends App {
  import io.StdIn._
  val a           = readInt()
  val num         = readLine()
  val s           = readLine()
  val Array(b, c) = num.split(" ").map(_.toInt)
  print(s"${a + b + c} $s")
}
