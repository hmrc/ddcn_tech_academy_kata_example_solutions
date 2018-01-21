import org.scalatest.{MustMatchers, WordSpec}

class RepeatStringSpec extends WordSpec with MustMatchers {

  "Repeat String" must {

    "return an empty string when asked to repeat a string zero times" in {

      RepeatString("hello", 0) mustEqual ""
    }

    "return the original string when asked to repeat it once" in {

      RepeatString("hello", 1) mustEqual "hello"
    }

    "return `hellohellohello` when asked to repeat `hello` three times" in {

      RepeatString("hello", 3) mustEqual "hellohellohello"
    }

    "return an empty string when asked to repeat a word a negative number of times" in {

      RepeatString("hello", -2) mustEqual ""
    }
  }
}
