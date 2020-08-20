package ABC081A

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC081A" - {
    "Pattern1" in {
      val input = """101"""
      assert(run(input)(Main.main) === "2")
    }
    "Pattern2" in {
      val input = """000"""
      assert(run(input)(Main.main) === "0")
    }
  }
}
