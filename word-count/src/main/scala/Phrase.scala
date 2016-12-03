class Phrase (val phrase : String) {
  def wordCount = {
    phrase.split("""[+-.,!@#$%^&*();\/|<>": ]""")
      .map(_.toLowerCase())
      .filterNot(_ == "")
      .groupBy(identity)
      .mapValues(_.size)
  }
}
