package domain.conjuntos;

import domain.bst.BST;
import domain.bst.Node;

import java.util.ArrayList;
import java.util.Iterator;

public class BSTConjunto<T extends Comparable<T>> {
    private BST<T> bst;

    public BSTConjunto(){
        this.bst = new BST<>();
    }

    public BST getBST(){
        return  this.bst;
    }

    public void add(T element){
        if (!this.contains(element))
            this.bst.add(new Node((Comparable) element));
    }

    public void union(BSTConjunto<T> conjunto2){
        ArrayList<T> elements = conjunto2.getBST().inOrder();
        Iterator itr = elements.iterator();
        while(itr.hasNext()) {
            T anElement = (T) itr.next();
            if (!this.contains(anElement))
                this.add(anElement);
        }
    }

    public void intersection(BSTConjunto<T> conjunto2){
        ArrayList<T> elements = conjunto2.getBST().inOrder();
        BST intersectionResult = new BST();
        Iterator itr = elements.iterator();
        while(itr.hasNext()) {
            T anElement = (T) itr.next();
            if (!this.contains(anElement))
                intersectionResult.add(new Node((Comparable) anElement));
        }
        this.bst = intersectionResult;
    }

    public boolean contains(T element){
        return this.bst.contains(element);
    }

    public int setSize(){
        return this.bst.getSize();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BSTConjunto){
            BSTConjunto anotherBST = (BSTConjunto) obj;
            if (this.bst.getSize() == anotherBST.setSize()){
                return this.getBST().inOrder().equals(anotherBST.getBST().inOrder());
            }
            else
                return false;
        }
        return false;
    }

}
