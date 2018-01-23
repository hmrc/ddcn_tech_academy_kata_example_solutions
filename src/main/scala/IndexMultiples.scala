object IndexMultiples {

  def apply(input: List[Int]): List[Int] =
    input
      .zipWithIndex
      .drop(1)
      .filter(x => x._1 % x._2 == 0)
      .map(x => x._1)
}
