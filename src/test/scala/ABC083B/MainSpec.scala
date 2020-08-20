package ABC083B

import org.scalatest.freespec.AnyFreeSpec
import utils.TestRunnerWithIO

class MainSpec extends AnyFreeSpec with TestRunnerWithIO {
  "ABC083B" - {
    "Pattern1" in {
      val input = """20 2 5"""
      assert(run(input)(Main.main) === "84")
    }
    "Pattern2" in {
      val input = """10 1 2"""
      assert(run(input)(Main.main) === "13")
    }
    "Pattern3" in {
      val input = """100 4 16"""
      assert(run(input)(Main.main) === "4554")
    }
  }
}
