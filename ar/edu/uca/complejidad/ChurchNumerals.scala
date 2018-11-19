package ar.edu.uca.complejidad

object ChurchNumerals {
    type Succ[Z] = Z => Z
    type ChNum[Z] = Succ[Z] => Z => Z
    def zero[Z]: ChNum[Z] =(_: Succ[Z]) => (z: Z) => z
    def one[Z] : ChNum[Z] = succ(zero) 
    def two[Z] : ChNum[Z] = succ(one)
    def four[Z] : ChNum[Z] = add(two)(two)
    def add[Z] (a: ChNum[Z]) (b: ChNum[Z]) = (s:Succ[Z])=>(z:Z)=> a(s)(b(s)(z))
    def succ[Z] (num: ChNum[Z]): ChNum[Z] = {(s:Succ[Z])=>(z:Z) =>s(num(s)(z))}
    def church_to_int (num: ChNum[Int]): Int = num((x: Int) => x + 1)(0)    
    def fourInt: Int = church_to_int(four)
    def main(args: Array[String]): Unit = {
      println(s"2 + 2 = ${fourInt}")
    }
}
