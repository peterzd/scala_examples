package ch8_generic_types

trait Set[A <: Ordered[A]] {
  def incl( x : A) : Set[A]
  def contains( x : A) : Boolean
}

case class Num(value : Double) extends Ordered[Num] {
  //compare(that : A) : Int 是Ordered[A] 的抽象方法
  def compare(that : Num) : Int = 
    if ( this.value < that.value) -1 
    else if ( this.value > that.value) 1
    else 0 
}