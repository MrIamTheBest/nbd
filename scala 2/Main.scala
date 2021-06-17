object Main extends App{
  val list=List("poniedziałek","wtorek","środa","czwartek","piątek","sobota","niedziela")

  def func1(a: List[String],x:String): String={
    val weekend ="weekend"
    val work ="praca"
    a match {
      case h::t => if(x=="sobota"||x=="niedziela") weekend
      else if(x=="poniedziałek"||x=="wtorek"||x=="środa"||x=="czwartek"||x=="piątek") work
      else "Nie ma takiego dnia"
      //case _ =>  "Nie ma takiego dnia"
    }
 }
 // println(func1(list,"środa"))
  //konto bankowe
  /*var k= new KontoBankowe()
  println(k.sprStan)
  var y = new KontoBankowe(100)
  println(y.sprStan)
  k.wyplata(1)
  println(k.sprStan)
  y.wyplata(50)
  println(y.sprStan)
  k.wplata(99)
  println(k.sprStan)
  y.wyplata(20)
  println(y.sprStan)*/
  //osoba powitanie
 /* var o= new Osoba("","")
  val Jan = Osoba("Jan","Kowalski")
  println(o.greet(Jan)) */

  def func4(f:(Int)=>Int,z:Int)={
      f(f(f(z)))
  }
  def func(x:Int): Int ={
     x+x
  }
  print(func4(func,3))
}
