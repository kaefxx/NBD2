object z3 {
  case class Osoba (val imie: String, val nazwisko: String)

  def witaj(osoba: Osoba): String = {
    osoba match {
      case Osoba("Jan", "Kowalski") => s"Dzień dobry, ${osoba.imie} ${osoba.nazwisko}."
      case Osoba("Andrzej", "Nowak") => s"Witaj, ${osoba.imie} ${osoba.nazwisko}."
      case Osoba("Paweł", "Mazur") => s"Szczęść Boże, ${osoba.imie} ${osoba.nazwisko}."
      case Osoba(_, _) => s"Cześć, ${osoba.imie} ${osoba.nazwisko}."
    }
  }

  def main(args: Array[String]): Unit = {
    println(witaj(new Osoba("Jan", "Kowalski")))
    println(witaj(new Osoba("Piotr", "Testowy")))
  }

}
