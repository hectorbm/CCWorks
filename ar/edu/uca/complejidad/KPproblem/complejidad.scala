package ar.edu.uca.complejidad.KPproblem

object Complejidad {

  def sortByRatiosAndFilter(elem: List[Backpack])(cap: Int): List[Backpack] = elem.sortBy(_.ratio).reverse.filter(_.weight <= cap)
  def loop (elem:List[Backpack],sol:List[Backpack],cap:Int): List[Backpack] = {
    if (!elem.isEmpty && cap-elem.head.weight>=0)loop(elem.tail,elem.head::sol,cap-elem.head.weight) 
    else sol
  }
  def bound(elem:List[Backpack],cap:Int):Int = {
    val validElems = loop(elem,List(),cap)
    if (!validElems.isEmpty) validElems.map(_.profit).sum 
    else 0
  }
  
  def solveKP(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack]=if (elem.isEmpty) sol else branch(elem,sol,cap) 
  def branch(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack]={
    val profitAdding = bound(elem,cap)
    val profitAvoiding = bound(elem.tail,cap)
    if (profitAdding >= profitAvoiding && profitAdding>0)
      solveKP(elem.tail,elem.head::sol,cap-elem.head.weight)
    else if (profitAdding < profitAvoiding && profitAvoiding>0)
      solveKP(elem.tail,sol,cap)
    else 
      sol
  }

  def main(args: Array[String]): Unit = {
    val capacity = 10
    val backpack = sortByRatiosAndFilter(List(new Backpack(4, 6), new Backpack(4, 1), new Backpack(3, 2),  new Backpack(6, 4)))(capacity)
   println(backpack)
   println(solveKP(backpack,List(),capacity))
   
  }





}