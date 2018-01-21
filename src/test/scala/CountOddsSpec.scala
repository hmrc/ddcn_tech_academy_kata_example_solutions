import org.scalatest.{MustMatchers, WordSpec}

class CountOddsSpec extends WordSpec with MustMatchers {

  "Count Odds" must {

    "return 0 when given 0" in {

      CountOdds(0) mustEqual 0
    }

    "return 0 when given a negative number" in {

      CountOdds(-3) mustEqual 0
    }

    "return 0 when given 1" in {

      CountOdds(1) mustEqual 0
    }

    "return 1 when given 2" in {

      CountOdds(2) mustEqual 1
    }

    "return 3 when given 7" in {

      CountOdds(7) mustEqual 3
    }

    "return 4 when given 8" in {

      CountOdds(8) mustEqual 4
    }
  }
}
