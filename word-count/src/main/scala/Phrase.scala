class Phrase (p : String) {

  var phrase = p

  def wordCount() = {
    wordCountMap(Map(), phrase.split("""[+-.,!@#$%^&*();\/|<>": ]""")
                   .map(_.toLowerCase())
                   .filterNot(_ == ""))
  }
  // WOrd count non character
  def wordCountMap(map : Map[String, Int], lsString : Array[String]) : Map[String, Int] = {

    if (lsString.isEmpty) {
      map
    } else {
      map get(lsString.head) match {
        case Some(c) => wordCountMap(map + (lsString.head -> (c + 1)), lsString.tail)
        case None => wordCountMap(map + (lsString.head -> 1), lsString.tail)
      }
    }
  }
}
