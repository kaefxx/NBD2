object z1 {
  def main(args: Array[String]): Unit = {
    println(transform("poniedziałek"))
    println(transform("środa"))
    println(transform("sobota"))
    println(transform("test"))
  }

  def transform(name: String): String = {
    name match {
      case "poniedziałek" | "wtorek" | "środa" | "czwartek" | "piątek" => "Praca"
      case "sobota" | "niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }
}
