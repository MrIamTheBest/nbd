abstract class Osoba2(val imię: String, val nazwisko: String){
  def podatek:Double
}
trait Student extends Osoba2 {
  override def podatek: Double = 0
}
trait Nauczyciel extends Pracownik{
  override def podatek: Double= {
    this.pensja*0.1

  }
}
trait Pracownik extends Osoba2{
  private var _pensja: Double=0
  def pensja = _pensja
  def pensja_=(pensja:Double)=_pensja=pensja

  override def podatek: Double= {
    this.pensja*0.2

  }

}