package ar.edu.uca.complejidad.KPproblem

object Complejidad {
  
  def kp01Problem(elem:List[Backpack],capacity:Int):List[Backpack] = solveKP01(elem,List(),capacity,List())
  
  def sortByRatiosAndFilter(elem:List[Backpack])(cap:Int):List[Backpack] = elem.sortBy(_.ratio).reverse.filter(_.weight<=cap)
  
  def newCapacity (capacity:Int,elements:List[Backpack]):Int = capacity-elements.head.weight
  
  def compareSolutions(sol:List[Backpack],otherSol:List[Backpack]) = if(sol.map(_.benefit).sum >= otherSol.map(_.benefit).sum) sol else otherSol
  
  def solveKP01(elem:List[Backpack],sol:List[Backpack],cap:Int,finalSol:List[Backpack]):List[Backpack] = {
    if (elem == Nil) return finalSol
    val newCap = newCapacity(cap,elem)
    val aSol = solveKP01(elem.tail,sol,cap,finalSol)
    if (newCap>=0) 
     return compareSolutions(solveKP01(elem.tail,elem.head::sol,newCap,compareSolutions(elem.head::sol,aSol)) , aSol )
    else return aSol
  }
  
  def main(args: Array[String]): Unit = {
     val backpackCapacity = 10
     val backpackObjects = sortByRatiosAndFilter(List(new Backpack(5,5),new Backpack(4,1),new Backpack(3,2),new Backpack(10,1),new Backpack(9,1)))(backpackCapacity) 
     val solKP = kp01Problem(backpackObjects,backpackCapacity)
     println(backpackObjects)
     println(solKP)
    } 
}