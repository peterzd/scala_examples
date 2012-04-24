package ch8_generic_types

object Test {
  def main(args: Array[String]) {
  val s = new EmptySet[Num].incl(Num(1.0)).incl(Num(2.0))
}

}

