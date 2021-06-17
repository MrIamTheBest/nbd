class KontoBankowe(x:Int=0) {
  private var stanKonta: Int = x

  def wplata(x: Int){
    this.stanKonta=x
  }
  def wyplata(x: Int): Unit ={
    if(this.stanKonta>=x){
      this.stanKonta= this.stanKonta -x
    }
    else{
      println("Niewystarczająca ilośc środków")
    }
  }
  def sprStan =this.stanKonta
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
}
