package ch6_classes_and_objects

/**
 * 以Class的形式定义一个有理数的类型
 */
class Rational(n : Int , d : Int) {
  
  /**
   * 求公约数
   */
  private def gcd( x : Int , y : Int) : Int = {
    if ( x == 0 ) y 
    else if ( x < 0 ) gcd ( -x , y )
    else if ( y < 0 ) -gcd ( x , -y)
    else gcd ( y % x , x)    
  }
  
  private val g = gcd ( n , d) // 分子，分母的最大公约数
  
  val number : Int = n / g 
  val denom : Int = d / g
  
  def +(that : Rational) = 
    new Rational(number * that.denom + that.number * denom , denom * that.denom)
  
  def -(that : Rational) = 
    new Rational(number * that.denom - that.number * denom , denom * that.denom)

}