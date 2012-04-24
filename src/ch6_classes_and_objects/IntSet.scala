package ch6_classes_and_objects

abstract class IntSet {
  def incl( x : Int) : IntSet
  def contains( x : Int) : Boolean

}