object SumOfMultiples {
  def sumOfMultiples (factors : List[Int], limit : Int) : Int = {
    (1 until limit).filter(x => factors.exists(x % _ == 0)).sum
  }
}
