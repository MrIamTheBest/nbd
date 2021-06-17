import scala.::
import scala.annotation.tailrec
import scala.math.abs

object Main extends App {
  val list=List("poniedziałek","wtorek","środa","czwartek","piątek","sobota","niedziela")

  def func1 (a: List[String])={
    for(i<-a){
        print(i+(if(a.indexOf(i)<a.size-1)","else ""))
    }
    println("")
    for(i<-a.filter(_.startsWith("p"))){
        print(i+(if(a.indexOf(i)==0)"," else ""))
    }
    println("")
    val list_size = a.size
    var x=0
    while(x<list_size){
      print(a(x)+(if(x<a.size-1)","else ""))
      x += 1
    }
  }
  //func1(list)
def func2(a:List[String]){
    val x=0
    a match {
      case Nil => Nil
      case head :: tail =>
        print(head+(if(x<a.size-1)","else ""))
        func2(tail)

    }
}
  //func2(list)
  def reverse(a: List[String]){
    a match{
      case Nil => Nil
    case h :: tail => reverse(tail)
      print(h+(if(a.size-6<1)","else ""))

  }}
//reverse(list)
def func3(a: List[String]): String = {
  @tailrec
  def func3tail(a: List[String], current: String): String = {
    val x=0
    a match {
      case Nil => current
      case head :: tail => print(head+(if(x<a.size-1)","else ""))
        func3tail(tail, current + head)
    }
  }
  func3tail(list, "")
}
  //func3(list)
  def func4 (l: List[String])= {
    val x=l.foldLeft("")((a, b) => a + b + ",")
    val y=x.substring(0, x.length()-1)
    println(y)
    val f=l.foldRight("")((a, b) => a +","+ b)
    val g=f.substring(0, f.length()-1)
    println(g)
    val h=l.filter(_.startsWith("p")).foldLeft("")((a, b) => a + b +",")
    val i=h.substring(0, h.length()-1)
    println(i)

  }
  func4(list)
  def func5 ()= {
    val products: Map[String, Double]  = Map("ser" -> 3.5,"chleb" ->2.60,"mleko"->3,"ziemniaki"->4)
    val discount= products.map{case (k, v) => (k, v -(v* 0.1))}
    print(discount)
  }
  //func5()
  def func6 (abc: (String, Int, Double))= {
        print(abc)
  }
  //func6("a",2,0.54)
  def func7 ()= {
    val opt: Option[Map[String,Int]] = Some(Map("one"->1,"two"->2,"three"->3))
      println(opt.get("three"))
      println(opt.get("one"))
  }
  //func7()
  val numbers=List(2,0,5,1,0,7,3,0,6,0,9)
  val x= 0
  def func8(l: List[Int]): List[Int] = l match{
      case Nil => Nil
      case h :: t =>if(h==x) func8(t)
      else h :: func8(t)
  }
//print(func8(numbers))
  def func9(l:List[Int]):List[Int] ={
    l.map(x =>x+1)
  }
//print(func9(numbers))
  val absolute = List(7,-4,5,-3,6,13,-7)
  def func10(l:List[Int]): List[Int] ={
      val x = l.filter(_>(-5)).filter(_<12)
      x.map(_.abs)
  }
  //print(func10(absolute))
}
