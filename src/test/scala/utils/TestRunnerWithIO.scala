package utils

import java.io.{ ByteArrayOutputStream, StringReader }

trait TestRunnerWithIO {

  def run(input: String)(main: Array[String] => Unit): String = {
    val in  = new StringReader(input)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        main(Array.empty)
      }
    }
    out.toString("UTF-8")
  }
}
