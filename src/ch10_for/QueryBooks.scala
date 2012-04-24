package ch10_for

case class Book(title: String, author: List[String])

object QueryBooks {

  val books: List[Book] = List(
    Book("Structure and Interpretation ", List("Abelson , Harold", "Sussman")),
    Book("Principles of Compiler Design",
      List("Aho, Alfred", "Ullman, Jeffrey")),
    Book("Programming in Modula-2", List("Wirth, Niklaus")),
    Book("Introduction to Functional Programming", List("Bird, Richard")),
    Book("The Java Language Specification",
      List("Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad")))

}

