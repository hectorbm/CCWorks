package AdHoc;

import java.util.ArrayList;
import java.util.Iterator;

public class AdHocSet<T> {
    private ArrayList<T> elements;
    private  ArrayList<Operation> operations;

    public AdHocSet(){
        this.elements = new ArrayList<>();
        this.operations = new ArrayList<>();
    }
    public ArrayList<T> getElements(){
        //First Update set elements with remaining operations
        this.doRemainingOperations();

        return this.elements;
    }
    public void add(T elem){
        AddOperation anAddingOp = new AddOperation(elem);
        this.operations.add(anAddingOp);
    }
    public boolean contains(T elem){
        //First Update set elements with remaining operations
        this.doRemainingOperations();

        Iterator itr = this.elements.iterator();
        while (itr.hasNext()){
            T anElement =(T) itr.next();
            if(anElement.equals(elem))
                return true;
        }
        return false;
    }
    public int size(){
        //First Update set elements with remaining operations
        this.doRemainingOperations();

        return this.elements.size();
    }
    public void union(AdHocSet<T> anAdHocSet){
        UnionOperation aUnion = new UnionOperation(anAdHocSet);
        this.operations.add(aUnion);
    }
    public void intersection(AdHocSet<T> anAdHocSet){
        IntersectionOperation anIntersection = new IntersectionOperation(anAdHocSet);
        this.operations.add(anIntersection);
    }
    @Override
    public boolean equals(Object obj) {
       //First Update set elements with remaining operations
        this.doRemainingOperations();

        if (obj instanceof AdHocSet){
            AdHocSet otherSet = (AdHocSet) obj;
            int sum = 0;
            Iterator itr = otherSet.getElements().iterator();
            if(otherSet.getElements().size()==this.elements.size()){
                while(itr.hasNext()){
                    T anElement =(T) itr.next();
                    if(this.contains(anElement))
                        sum++;
                }
                return sum==this.elements.size();
            }
            else
                return false;
        }
        else
            return false;
    }

    private void doRemainingOperations(){
        Iterator itr = this.operations.iterator();
        while(itr.hasNext()){
            Operation op = (Operation) itr.next();
            op.doOperationOn(this.elements);
            this.operations.remove(op);
        }
    }

}
