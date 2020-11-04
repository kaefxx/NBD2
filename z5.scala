import scala.Console.println

object z5 {

  class Osoba(
               val imie: String,
               val nazwisko: String,
               val _podatek: Int) {
    lazy val podatek:Int = _podatek
  }
  abstract class A {
    val x1: String
    lazy val x2: String = "mom"

    println("A: " + x1 + ", " + x2)
  }

  trait Pracownik extends Osoba {
    var pensja: Int
    lazy override val podatek: Int = {
      pensja / 10
    }
  }

  trait Student extends Osoba {
    lazy override val podatek: Int = 0
  }

  trait Nauczyciel extends Pracownik {
    lazy override val podatek: Int = {
      pensja / 5
    }
  }

  def main(args: Array[String]): Unit = {
    val osoba = new Osoba("Jan", "Kowalski", 43)
    val student = new Osoba("Jan", "Kowalski", 43) with Student
    val pracownik =  new Osoba("Jan", "Kowalski", 43) with Pracownik {
      override var pensja: Int = 1200
    }
    val nauczyciel = new Osoba("Jan", "Kowalski", 43) with Nauczyciel {
      override var pensja: Int = 2400
    }

    val studentPracownik = new Osoba("Jan", "Kowalski", 43) with Student with Pracownik {
      override var pensja: Int = 600
    }
    val pracownikStudent = new Osoba("Jan", "Kowalski", 43) with Pracownik with Student {
      override var pensja: Int = 600
    }

    println(osoba.podatek)
    println(student.podatek)
    println(pracownik.podatek)
    println(nauczyciel.podatek)
    println(studentPracownik.podatek)
    println(pracownikStudent.podatek)


  }


}
