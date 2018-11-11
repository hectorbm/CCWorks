package domain.bst;

public class Main {
    public static void main (String[] args){
        BST<Integer> abb = new BST<>();
        Node<Integer> node1 = new Node<>(7);
        Node<Integer> node2 = new Node<>(6);
        Node<Integer> node3 = new Node<>(8);
        Node<Integer> node4 = new Node<>(9);
        abb.add(node1);
        abb.add(node2);
        abb.add(node3);
        abb.add(node4);
        abb.show();
    }
}
