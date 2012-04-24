package ch5_first_class_functions

import scala.Math._

object FixedPoints {
  val tolerance = 0.0001 
  def isCloseEnough( x : Double , y : Double) = abs((x - y ) / x) < tolerance
  
  def ifxedPoint( f : Double => Double )(firstGuess : Double) = {
    def iterate(guess : Double) : Double = {
      val next = f(guess)
      if ( isCloseEnough(guess, next)) next
      else iterate(next)      
    }
    iterate(firstGuess)    
  }

}