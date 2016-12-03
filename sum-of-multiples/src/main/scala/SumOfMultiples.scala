object SumOfMultiples {
  def sumOfMultiples (lst : List[Int], n : Int) : Int = {
    (1 until n).filter(x => lst.exists(x % _ == 0)).sum
  }
}
