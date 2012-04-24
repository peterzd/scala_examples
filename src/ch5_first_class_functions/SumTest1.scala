package ch5_first_class_functions

object SumTest1 {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b) // 因为是递归的。所以必须要有返回类型

  def square(x: Int): Int = x * x
  def sumSquares(a: Int, b: Int): Int =
    if (a > b) 0 else square(a) + sumSquares(a + 1, b)

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
  def sumPowerOfTwo(a: Int, b: Int): Int =
    if (a > b) 0 else powerOfTwo(a) + sumPowerOfTwo(a + 1, b)

    
    
}