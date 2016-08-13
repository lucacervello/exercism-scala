class Bob() {
  def hey (arg: String): String = {
    if(arg.exists(_.isUpperCase)) "Hello"
    else "he"
  }
}
