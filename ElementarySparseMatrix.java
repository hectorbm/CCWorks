package domain;

public class ElementarySparseMatrix {
    private boolean[][] elem;

    public ElementarySparseMatrix(int filas, int columnas){ this.elem = new boolean[filas][columnas]; }
    void write(int fila, int columna, boolean value){ this.elem[fila][columna] = value; }
    boolean read(int fila, int columna){ return this.elem[fila][columna]; }
}
