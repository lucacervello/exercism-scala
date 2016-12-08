class PhoneNumber(val n: String) {

  def number = n.toList.filter(Character.isDigit) match {
    case x if x.length == 10 => Some(x.mkString)
    case '1' :: xs if xs.length == 10 => Some(xs.mkString)
    case _ => None
  }

  def areaCode = number.map(_.take(3))

  def prettyPrint = number.map(x => s"(${x.take(3)}) ${x.drop(3).take(3)}-${x.drop(6)}")
}
