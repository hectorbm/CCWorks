package domain.sparseMatrix;

public class Main {
    public static void main (String[] args) {
        ElementarySparseMatrix matrixOne = new ElementarySparseMatrix(100000000, 100000000);
        OptimizedSparseMatrix matrixTwo = new OptimizedSparseMatrix(1000000000, 1000000000);
        matrixTwo.write(1, 1, true);
        matrixTwo.write(1, 4, true);
        matrixTwo.write(1, 9, true);
        System.out.println("Reading (2,2) = " + matrixTwo.read(2, 2));
        System.out.println("Reading (1,1) = " + matrixTwo.read(1, 1));
        matrixTwo.write(1, 4, false);
        System.out.println("Reading (1,4) = " + matrixTwo.read(1, 4));

    }
}
