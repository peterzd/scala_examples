package ch10_for

case class Book(title: String, author: List[String])

object QueryBooks {

  val books: List[Book] = List(
    Book("Structure and Interpretation ", List("Abelson , Harold", "Sussman")),
    Book("Principles of Compiler Design",
      List("Aho, Alfred", "Ullman, Jeffrey" , "Sussman")),
    Book("Programming in Modula-2", List("Wirth, Niklaus" , "Sussman")),
    Book("Introduction to Functional Programming", List("Bird, Richard" , "Sussman")),
    Book("The Java Language Specification",
      List("Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad")))

  def main(args: Array[String]) {
    //find all books whose author's last name is "Ullman"
    println(for( b <- books ; a <- b.author if a startsWith("Ullman")) yield b.title)
    
    //find all books that have the string "Program" in title
    println(for( b <- books if (b.title.indexOf("Program") >= 0 )) yield b.title)
    
    //find the names of all authors that have written at least two books
    println("at least two books : " + (for ( b1 <- books ; b2 <- books if b1 != b2;
    		a1 <- b1.author ; a2 <- b2.author if a1 == a2)
      yield a1) )
    
  }
  
  def removeDuplicates[A](xs : List[A]) : List[A] = 
    if ( xs.isEmpty ) xs
    else xs.head :: removeDuplicates(for( x <- xs.tail if x != xs.head) yield x)

}

