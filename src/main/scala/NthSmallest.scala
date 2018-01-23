object NthSmallest {

  def apply(input: List[Int], n: Int): Int =
    input
      .distinct
      .sorted
      .reverse
      .lift(n - 1)
      .getOrElse(throw new IllegalArgumentException)
}
