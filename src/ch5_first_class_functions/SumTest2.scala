package ch5_first_class_functions

/**
 * 把函数提取出来，作为参数的形式。把sum当成高阶函数的写法
 */
object SumTest2 {

  //sum 就是一个高阶函数
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  // the functions of basic 
  def square(x: Int): Int = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sumInts(a: Int, b: Int): Int = sum(x  => x , a, b)
  def sumSquares(a : Int , b : Int) : Int = sum( x  => x * x , a , b)

}