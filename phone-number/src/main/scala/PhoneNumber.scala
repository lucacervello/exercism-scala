class PhoneNumber(val n: String) {

  def number = n.replaceAll("\\D", "").toList match {
    case x if x.length == 10 => Some(x.mkString)
    case '1' :: xs if xs.length == 10 => Some(xs.mkString)
    case _ => None
  }

  def areaCode = number match {
    case Some(s) => Some(s.take(3))
    case None => None
  }

  def prettyPrint = number match {
    case Some(phoneNumber) => {
      val firstNumbers = phoneNumber.take(3)
      val secondNumbers = phoneNumber.drop(3).take(3)
      val thirdNumbers = phoneNumber.drop(6)
      Some(s"(${firstNumbers}) ${secondNumbers}-${thirdNumbers}")
    }
    case None => None
  }
}
