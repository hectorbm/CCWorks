package domain.bst;

import domain.bst.Node;

import java.util.ArrayList;

public class BST<T extends Comparable<T>> {
    private Node root;
    private int size;

    public BST() {

    }
    public BST(Node aNode){
        this.root = aNode;
        this.size = 1;
    }

    public void add(Node<T> aNode){
        if(this.root == null) {
            this.root = aNode;
            this.size = 1;
        }
        else
         this.addRecursive(aNode,this.root);
    }

    private void addRecursive(Node aNode,Node upperNode){
        int compareResult = upperNode.greaterThan(aNode);
        if (compareResult == 1) {
            if(upperNode.getLeftNode()!=null)
                this.addRecursive(aNode, upperNode.getLeftNode());
            else {
                upperNode.addLeftNode(aNode);
                this.size++;
            }
        }
        else if (compareResult == -1) {
            if(upperNode.getRightNode()!=null)
                this.addRecursive(aNode, upperNode.getRightNode());
            else {
                upperNode.addRightNode(aNode);
                this.size++;
            }
        }
    }

    public boolean contains (T elem){
        return containsRecursive(this.root, elem);
    }
    private boolean containsRecursive(Node aNode, T elem){
        if(aNode == null) {
            return false;
        }
        else{
            int compareVal = aNode.getValue().compareTo(elem);
            if (compareVal == 0){
                return true;
            }
            else if (compareVal == -1) {
                return this.containsRecursive(aNode.getLeftNode(), elem);
            }
            else {
                return this.containsRecursive(aNode.getRightNode(), elem);
            }
        }
    }

    public void changeRootNode(Node aRootNode){
        this.root = aRootNode;
    }

    public void show (){
        if (this.root!=null)
            System.out.println("[ " + this.inOrder() + " ]");
        else
            System.out.println("Empty Tree!");
    }

    private void inOrderRecursive(Node aNode,ArrayList<T> inOrderElements) {
        if(aNode.getLeftNode()!=null)
            this.inOrderRecursive(aNode.getLeftNode(),inOrderElements);
        inOrderElements.add((T) aNode.getValue());
        if (aNode.getRightNode()!=null)
            this.inOrderRecursive(aNode.getRightNode(),inOrderElements);
    }

    public ArrayList<T> inOrder(){
        ArrayList<T> inOrderElements = new ArrayList<>();
        this.inOrderRecursive(this.root,inOrderElements);
        return inOrderElements;
    }    

    public int getSize(){
        return this.size;
    }
}
