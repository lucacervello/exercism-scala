object Pangrams {
  def isPangram(str : String) : Boolean = {
    'a' to 'z' forall( str toLowerCase() contains(_))
  }
}
