package domain.sparseMatrix;

public class MatrixElement {
    private int rowValue;
    private int columnValue;

    public MatrixElement(int rowValue,int columnValue){
        this.columnValue = columnValue;
        this.rowValue = rowValue;
    }
    public int getRowValue() { return rowValue;}

    public int getColumnValue() {
        return columnValue;
    }
}
