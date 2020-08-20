package ABC087B

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC087B" - {
    "Pattern1" in {
      val input =
        """2
          |2
          |2
          |100
          |""".stripMargin
      assert(run(input)(Main.main) === "2")
    }
    "Pattern2" in {
      val input =
        """5
          |1
          |0
          |150
          |""".stripMargin
      assert(run(input)(Main.main) === "0")
    }
    "Pattern3" in {
      val input =
        """30
          |40
          |50
          |6000
          |""".stripMargin
      assert(run(input)(Main.main) === "213")
    }
  }
}
