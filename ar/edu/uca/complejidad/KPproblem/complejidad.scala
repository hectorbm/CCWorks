package ar.edu.uca.complejidad.KPproblem

object Complejidad {
  
  def sortByRatiosAndFilter(elem:List[Backpack])(cap:Int):List[Backpack] = elem.sortBy(_.ratio).reverse.filter(_.weight<=cap)
  def newCap(capacity:Int,elements:List[Backpack]):Int = capacity-elements.head.weight
  def compare(sol:List[Backpack],otherSol:List[Backpack]) = if(sol.map(_.benefit).sum >= otherSol.map(_.benefit).sum) sol else otherSol
  
  def solveKP(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack] = if(elem.isEmpty)sol else analize(elem,sol,cap) 
  def analize(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack] = compare(addingElem(elem,sol,cap), notAddingElem(elem,sol,cap))
  def addingElem(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack] = if (newCap(cap,elem)>=0) solveKP(elem.tail,elem.head::sol,newCap(cap,elem)) else sol 
  def notAddingElem(elem:List[Backpack],sol:List[Backpack],cap:Int):List[Backpack] = solveKP(elem.tail,sol,cap)
  
  def main(args: Array[String]): Unit = {
     val capacity = 10
     val backpack = sortByRatiosAndFilter(List(new Backpack(5,5),new Backpack(4,1),new Backpack(3,2),new Backpack(10,9),new Backpack(9,9)))(capacity) 
     println(solveKP(backpack,List(),capacity))
    } 
}