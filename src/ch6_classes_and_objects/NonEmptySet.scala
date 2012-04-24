package ch6_classes_and_objects

class NonEmptySet( elem : Int , left : IntSet , right : IntSet) extends IntSet {

  def incl(x: Int): IntSet = 
    if ( x < elem) new NonEmptySet(elem , left incl(x) , right)
    else if ( x > elem ) new NonEmptySet(elem , left , right incl(x))
    else this

  def contains(x: Int): Boolean = 
    if ( x < elem) left contains x 
    else if ( x > elem ) right contains x
    else true 

}