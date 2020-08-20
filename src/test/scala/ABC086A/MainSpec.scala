package ABC086A

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {

  "ABC086A" - {

    "Pattern1" in {
      val input = """3 4"""
      assert(run(input)(Main.main) === "Even")
    }

    "Pattern2" in {
      val input = """1 21"""
      assert(run(input)(Main.main) === "Odd")
    }

  }

}
