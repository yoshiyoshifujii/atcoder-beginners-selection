package ABC085B

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC085B" - {
    "Pattern1" in {
      val input = """4
                    |10
                    |8
                    |8
                    |6
                    |""".stripMargin
      assert(run(input)(Main.main) === "3")
    }
    "Pattern2" in {
      val input = """3
                    |15
                    |15
                    |15
                    |""".stripMargin
      assert(run(input)(Main.main) === "1")
    }
    "Pattern3" in {
      val input = """7
                    |50
                    |30
                    |50
                    |100
                    |50
                    |80
                    |30
                    |""".stripMargin
      assert(run(input)(Main.main) === "4")
    }
  }
}
