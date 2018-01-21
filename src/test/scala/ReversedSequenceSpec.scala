import org.scalatest.{MustMatchers, WordSpec}

class ReversedSequenceSpec extends WordSpec with MustMatchers {

  "Reverse Sequence" must {

    "return an empty list when given 0" in {

      ReverseSequence(0) mustEqual List.empty
    }

    "return `1` when given 1" in {

      ReverseSequence(1) mustEqual List(1)
    }

    "return `5, 4, 3, 2, 1` when given 5" in {

      ReverseSequence(5) mustEqual List(5, 4, 3, 2, 1)
    }

    "return an empty list when given a negative number" in {

      ReverseSequence(-2) mustEqual List.empty
    }
  }
}
