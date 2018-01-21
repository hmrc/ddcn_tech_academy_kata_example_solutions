import org.scalatest.{MustMatchers, WordSpec}

class RemoveFirstAndLastSpec extends WordSpec with MustMatchers {

  "Remove First and Last" must {

    "return an empty string when given an empty string" in {

      RemoveFirstAndLast("") mustEqual ""
    }

    "return an empty string when given a single-character string" in {

      RemoveFirstAndLast("a") mustEqual ""
    }

    "return an empty string when given a two-character string" in {

      RemoveFirstAndLast("ab") mustEqual ""
    }

    "return `b` when given `abc`" in {

      RemoveFirstAndLast("abc") mustEqual "b"
    }

    "return `ell` when given `hello`" in {

      RemoveFirstAndLast("hello") mustEqual "ell"
    }
  }
}
