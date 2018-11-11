package domain;

public class Node<T extends Comparable<T>>{
    private T value;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node (T aValue){
        this.value = aValue;
    }

    public void addLeftNode (Node<T> aNode){
        this.leftNode = aNode;
    }

    public void addRightNode (Node<T> aNode){
        this.rightNode = aNode;
    }

    public T getValue (){
        return this.value;
    }

    public int greaterThan(Node<T> aNode) {
        return this.value.compareTo(aNode.getValue());
    }

    public Node<T> getRightNode(){
        return this.rightNode;
    }

    public Node<T> getLeftNode(){
        return this.leftNode;
    }
}
