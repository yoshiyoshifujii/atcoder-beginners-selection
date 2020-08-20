package ABC081A

object Main extends App {
  val in                 = scala.io.StdIn.readLine
  val Vector(s1, s2, s3) = in.toVector.map(_.toString.toInt)
  print(s1 + s2 + s3)
}
