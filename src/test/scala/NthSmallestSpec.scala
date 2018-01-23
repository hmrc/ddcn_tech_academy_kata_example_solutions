import org.scalatest.{MustMatchers, WordSpec}

class NthSmallestSpec extends WordSpec with MustMatchers {

  "nth Smallest" must {

    "return the largest number when given a list and n = 1" in {

      NthSmallest(List(1, 5, 10), 1) mustEqual 10
    }

    "return the second largest number when given a list and n = 2" in {

      NthSmallest(List(1, 5, 10), 2) mustEqual 5
    }

    "return the second largest number when given a list containing duplicates and n = 2" in {

      NthSmallest(List(1, 5, 5, 10, 10), 2) mustEqual 5
    }

    "throw an error when given an empty list" in {

      intercept[IllegalArgumentException] {
        NthSmallest(List.empty, 1)
      }
    }

    "throw an error when n is larger than the number of distinct items in the list" in {

      intercept[IllegalArgumentException] {
        NthSmallest(List(1, 1, 2, 2, 3, 3), 4)
      }
    }
  }
}

