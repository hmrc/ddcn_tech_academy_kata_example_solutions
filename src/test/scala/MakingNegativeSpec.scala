import org.scalatest.{MustMatchers, WordSpec}

class MakingNegativeSpec extends WordSpec with MustMatchers {

  "Making Negative" must {

    "return 0 when given 0" in {

      MakeNegative(0) mustEqual 0
    }

    "return -1 when given 1" in {

      MakeNegative(1) mustEqual -1
    }

    "return -1 when given -1" in {

      MakeNegative(-1) mustEqual -1
    }
  }
}
