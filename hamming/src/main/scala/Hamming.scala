object Hamming {
  def compute (dna1 : String, dna2 : String) : Int = {
    val dna1Lst = dna1.toList
    val dna2Lst = dna2.toList
    if (dna1Lst.length != dna2Lst.length) {
      throw new IllegalArgumentException
    } else {
      (dna1Lst zip dna2Lst).map(x => if (x._1 == x._2) 0 else 1).sum
    }
  }
}
