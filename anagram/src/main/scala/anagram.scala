class Anagram(val str : String) {
  def matches (strings : Seq[String]) : Seq[String] = {
    val strSorted = str toLowerCase() sortWith(_ > _)
    strings.filter(s => s.toLowerCase() != str && s.toLowerCase().sortWith(_ > _) == strSorted)
  }
}
