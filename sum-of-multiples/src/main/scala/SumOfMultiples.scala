object SumOfMultiples {
  def sumOfMultiples (lst : List[Int], n : Int) : Int = {
    (1 to n-1).filter((x) =>
      lst.exists((y) => x % y == 0)
    ).sum
  }
}
