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
    private Node<T> head;

    private int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    private void addNode(T val) {
        if (head==null) {
            head = new Node<>(val);
        } else {
            Node<T> node = head;
            while (true){
                if (compare(val, node.value)<0){
                    //node = node.left;
                    if (node.left==null) {
                        node.left = new Node<>(val);
                        break;
                    } else {
                        node = node.left;
                    }
                } else if (compare(val, node.value)>0){
                    //node = node.right;
                    if (node.right==null) {
                        node.right = new Node<>(val);
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }

    }

    private void preOrderTraverse() {
        if (head!=null) {
            preOrderTraverse(head.right);
            System.out.println(head.value);
            preOrderTraverse(head.left);
        }
    }
    private void preOrderTraverse(Node<T> node) {
        if (node != null) {
            System.out.println(node.value);
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }


    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.addNode(5);
        bst.addNode(1);
        bst.addNode(2);
        bst.addNode(6);
        bst.addNode(7);
        bst.addNode(8);
        bst.preOrderTraverse(bst.head);
    }

}
