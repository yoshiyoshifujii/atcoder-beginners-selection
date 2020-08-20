package ABC088B

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC088B" - {
    "Pattern1" in {
      val input =
        """2
          |3 1
          |""".stripMargin
      assert(run(input)(Main.main) === "2")
    }
    "Pattern2" in {
      val input =
        """3
          |2 7 4
          |""".stripMargin
      assert(run(input)(Main.main) === "5")
    }
    "Pattern3" in {
      val input =
        """4
          |20 18 2 18
          |""".stripMargin
      assert(run(input)(Main.main) === "18")
    }
  }
}
