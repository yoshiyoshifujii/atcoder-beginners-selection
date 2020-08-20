package ABC081B

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC081B" - {
    "Pattern1" in {
      val input =
        """3
          |8 12 40
          |""".stripMargin
      assert(run(input)(Main.main) === "2")
    }
    "Pattern2" in {
      val input =
        """4
          |5 6 8 10
          |""".stripMargin
      assert(run(input)(Main.main) === "0")
    }
    "Pattern3" in {
      val input =
        """6
          |382253568 723152896 37802240 379425024 404894720 471526144
          |""".stripMargin
      assert(run(input)(Main.main) === "8")
    }
  }
}
