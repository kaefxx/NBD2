object z2 {
  class KontoBankowe(private var stanKonta: Int) {

    def this() {
      this(0)
    }

    def wplata(kwota: Int): Unit = {
      stanKonta += kwota
    }

    def wyplata(kwota: Int): Unit = {
      stanKonta -= kwota
    }
  }

  def main(args: Array[String]): Unit = {
    var kontoBankowe: KontoBankowe = new KontoBankowe(100)
    kontoBankowe.wplata(100)
    kontoBankowe.wyplata(100)
  }

}
