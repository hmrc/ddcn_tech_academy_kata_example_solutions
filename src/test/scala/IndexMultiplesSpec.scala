import org.scalatest.{MustMatchers, WordSpec}

class IndexMultiplesSpec extends WordSpec with MustMatchers {

  "Index Multiples" must {

    "return an empty list when given an empty list" in {

      IndexMultiples(List()) mustEqual List()
    }

    "return an empty list when given a list of one element" in {

      IndexMultiples(List(1)) mustEqual List()
    }

    "return a list with only the second element when given a list of two elements" in {

      IndexMultiples(List(1, 2)) mustEqual List(2)
    }

    "return only elements that are multiples of their index" in {

      IndexMultiples(List(2, 4, 7, 9, 10)) mustEqual List(4, 9)

      IndexMultiples(List(2, 2, 2, 2, 2)) mustEqual List(2, 2)

      IndexMultiples(List(1, 2, 3, 4, 5)) mustEqual List(2)
    }
  }
}
