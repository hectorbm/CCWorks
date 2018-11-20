package ar.edu.uca.complejidad.KPproblem

class Backpack (val aWeight: Int, val aProfit: Int) {
   val weight: Int = aWeight
   val profit: Int = aProfit
   val ratio: Float = profit.asInstanceOf[Float] / weight.asInstanceOf[Float]
   override def toString = s"[Weight:=$weight Benefit:=$profit]"
}