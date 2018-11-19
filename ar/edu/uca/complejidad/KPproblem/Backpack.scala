package ar.edu.uca.complejidad.KPproblem

class Backpack (val aWeight: Int, val aBenefit: Int) {
   val weight: Int = aWeight
   val benefit: Int = aBenefit
   val ratio: Float = benefit.asInstanceOf[Float] / weight.asInstanceOf[Float]
   override def toString = s"[Weight:=$weight Benefit:=$benefit]"
}