object RemoveFirstAndLast {

  def apply(input: String): String =
    if (input.length <= 2) {
      ""
    } else {
      input.substring(1, input.length - 1)
    }
}
