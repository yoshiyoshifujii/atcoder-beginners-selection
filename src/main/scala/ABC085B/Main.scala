package ABC085B

object Main extends App {
  import scala.io.StdIn._
  val n  = readInt()
  val dn = (1 to n).map(_ => readInt)
  print(dn.toSet.size)
}
