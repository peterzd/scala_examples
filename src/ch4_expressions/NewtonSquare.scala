package ch4_expressions

/**
 * 用递归的方法实现牛顿求平方根算法
 */
object NewtonSquare {
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess)) // 这里用到了递归算法，所以这个函数一定要有返回类型

    def isGoodEnough(guess: Double): Boolean =
      Math.abs(guess * guess - x) < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

  }

  def main(args: Array[String]): Unit = {
    println("sqrt 5 is : " + sqrt(5))
  }

}