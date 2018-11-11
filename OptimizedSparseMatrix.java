package domain;

import java.util.ArrayList;

public class OptimizedSparseMatrix {
    private ArrayList<MatrixElement> elements;
    private int rows;
    private int columns;

    public OptimizedSparseMatrix(int rowsValue, int columnsValue){
        this.columns = columnsValue;
        this.rows = rowsValue;
        this.elements = new ArrayList<>();
    }
    public void write(int rowVal, int columnVal, boolean value){
        boolean contains = false;
        int position=0;
        if (this.validRow(rowVal) && this.validColumn(columnVal)){
            for(int i=0;i<elements.size() && !contains ;i++){
                if (elements.get(i).getRowValue()== rowVal && elements.get(i).getColumnValue() == columnVal){
                    contains = true;
                    position = i;
                }

            }
            if (!contains && value)
                elements.add(new MatrixElement(rowVal, columnVal));
            else if(contains && !value)
                elements.remove(position);
        }
    }
    public boolean read(int rowValue, int columnValue){
        if (this.validRow(rowValue) && this.validColumn(columnValue)) {
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).getRowValue() == rowValue && elements.get(i).getColumnValue() == columnValue)
                    return true;
            }
        }
        return false;
    }
    private boolean validColumn(int columnValue) { return (this.columns >= columnValue && columnValue>0);}
    private boolean validRow(int rowValue){ return (this.rows>=rowValue && rowValue>0);}
}
