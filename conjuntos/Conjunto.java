package domain.conjuntos;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto <T> {

    private  ArrayList<T> setElements;

    public Conjunto (ArrayList<T> o){
        this.setElements = o;
    }

    public Conjunto (){
        this(new ArrayList<>());
    }

    public ArrayList<T> getSetElements(){
        return  this.setElements;
    }

    public void add(T element){
        if (!this.contains(element))
            this.setElements.add(element);
    }

    public void union(Conjunto<T> conjunto2){
        Iterator itr = conjunto2.getSetElements().iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (!this.contains((T)o))
                this.setElements.add((T)o);
        }
    }

    public void intersection(Conjunto<T> conjunto2){
        ArrayList<T> intersectionSet = new ArrayList<>();
        Iterator itr = this.setElements.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (conjunto2.contains((T)o))
                intersectionSet.add((T)o);

        }
        this.setElements = intersectionSet;
    }

    public boolean contains(T element){
        return this.setElements.contains(element);
    }

    public int setSize(){
        return this.setElements.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Conjunto){
            return this.setElements.equals(((Conjunto) obj).getSetElements());
        }
        return false;
    }
}
