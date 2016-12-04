class DNA (val dna : String) {

  private val nucleotidesMap = Map(
    'A' -> 0,
    'G' -> 0,
    'T' -> 0,
    'C' -> 0
  )

  private def isValid(nucleotide : Char) = nucleotidesMap.keys.exists(_ == nucleotide)

  def count (nucleotide : Char) = {
    if (isValid(nucleotide)) {
      dna.find(!isValid(_)) match {
        case Some(nuc) => Left(s"invalid nucleotide '${nuc}'")
        case None => Right(dna.filter(_ == nucleotide).length())
      }
    } else Left(s"invalid nucleotide '${nucleotide}'")
  }
  def nucleotideCounts = {
    dna.find(!isValid(_)) match {
      case Some(nuc) => Left(s"invalid nucleotide '${nuc}'")
      case None => Right(nucleotidesMap ++ (dna.groupBy(identity).mapValues(_.length())))
    }
  }
}
