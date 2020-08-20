package PracticeA

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {

  "PracticeA" - {

    "pattern 1" in {
      val input =
        """1
          |2 3
          |test
          |""".stripMargin
      assert(run(input)(Main.main) === "6 test")
    }

    "pattern 2" in {
      val input =
        """72
          |128 256
          |myonmyon
          |""".stripMargin
      assert(run(input)(Main.main) === "456 myonmyon")
    }
  }

}
