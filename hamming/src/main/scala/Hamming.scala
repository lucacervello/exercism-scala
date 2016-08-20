object Hamming {

  def compute (dna1 : String, dna2 : String) : Int = {
    (dna1, dna2) match {
      case ("", "") => 0
      case ("", dna2) => throw new IllegalArgumentException
      case (dna1, "") => throw new IllegalArgumentException
      case (dna1, dna2) if (dna1.head == dna2.head) => compute(dna1.tail, dna2.tail)
      case (dna1, dna2) => 1 + compute(dna1.tail, dna2.tail)
    }
  }
}
