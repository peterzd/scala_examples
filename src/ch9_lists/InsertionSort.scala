package ch9_lists

object InsertionSort {

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys =>
      if (x > y) y :: insert(x , ys)
      else x :: xs 
  }

  def main(args: Array[String]) {
    val plainList = List(3,6,4,10,5,2,9)
    println(isort(plainList))
  }

}