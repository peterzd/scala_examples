package ch6_classes_and_objects

class EmptySet extends IntSet {

  def incl(x: Int): IntSet = { null }

  def contains(x: Int): Boolean = false 

}

