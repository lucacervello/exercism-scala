class DNA (val dna : String) {

  private val nucleotidesMap = Map(
    'A' -> 0,
    'G' -> 0,
    'T' -> 0,
    'C' -> 0
  )

  private def isNotValid(nucleotide : Char) = !nucleotidesMap.keys.exists(_ == nucleotide)

  def count (nucleotide : Char) = {
    (dna :+ nucleotide).find(isNotValid).map(n => Left(s"invalid nucleotide '${n}'"))
      .getOrElse(Right(dna.filter(_ == nucleotide).length))

  }
  def nucleotideCounts = 
    dna.find(isNotValid)
      .map(nuc => Left(s"invalid nucleotide '${nuc}'"))
      .getOrElse(Right(nucleotidesMap ++ (dna.groupBy(identity).mapValues(_.length()))))
}
