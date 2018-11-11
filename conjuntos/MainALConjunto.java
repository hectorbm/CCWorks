package domain.conjuntos;

public class MainALConjunto {
    public static void main (String[] args){
        Conjunto<Integer> conj = new Conjunto<>();
        Conjunto<Integer> conj2 = new Conjunto<>();
        conj.add(4); conj.add(4); conj.add(5); conj.add(5); conj.add(6);
        conj2.add(4); conj2.add(4); conj2.add(6);conj2.add(7);
        System.out.println( "Conjunto 1 = " + conj.getSetElements());
        System.out.println("Conjunto 2 = " + conj2.getSetElements());
        conj.union(conj2);
        System.out.println("Conjunto 1 U Conjunto 2= " + conj.getSetElements());
        System.out.println("Conj = conj 2 post intersection? :" + conj.equals(conj2));
    }
}
