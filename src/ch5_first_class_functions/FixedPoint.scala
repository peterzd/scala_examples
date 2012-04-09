package ch5_first_class_functions

import scala.Math._

object FixedPoint {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) < tolerance
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }
  
  def averangeDamp(f : Double => Double)(x : Double) = ( x + f(x)) / 2
  def sqrt(x : Double) = fixedPoint(averangeDamp(y => x/y))(1.0)

  def main(args: Array[String]) {

    val consult = sqrt(2)

  }

}