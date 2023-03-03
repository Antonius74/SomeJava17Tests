package datastructures.bst;

class Node<T> {
    public Node(T value) {
        this.value = value;
    }

    Node<T> left;
    Node<T> right;
    T value;
}
public class BST<T extends Comparable<T>> {
    Node<T> head;
    Node<T> next;

    public int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    void addNode(T val) {

        if (head==null) {
            head = new Node<>(val);
        } else {
            next = head;
            while (next != null) {
                if (compare(next.value, val) > 0) {
                    next = next.left;
                } else if (compare(next.value, val) < 0) {
                    next = next.right;
                }
            }
            next = new Node<>(val);

        }

    }

    void readNode() {
        if (head!=null) {
            System.out.println(head.value);
            readNode(head.right);
            readNode(head.left);
        }
    }
    void readNode(Node<T> node) {
        if (node != null) {
            System.out.println(node.value);
            readNode(node.left);
            readNode(node.right);
        }
    }


    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.addNode(1);
        bst.addNode(2);
        bst.addNode(3);
        bst.readNode();
    }

}
