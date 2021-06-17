case class Osoba(val firstName: String, val lastName: String) {
  def greet(osoba: Osoba) :String= {
    osoba match{
      case Osoba("Jan","Kowalski")=>"Cześć " +osoba.firstName +" "+osoba.lastName
      case Osoba("Karol","Wielki")=>"Witaj "  +osoba.firstName +" "+osoba.lastName
      case Osoba("Cecilia","Baguette")=>"Bonjur "  +osoba.firstName +" "+osoba.lastName
      case _=>"Hello"  +osoba.firstName +" "+osoba.lastName
    }
  }
}
