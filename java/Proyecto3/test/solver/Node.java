package solver;

public class Node {

    private int key;

    private Node previous;
    private Node[] next;

    public Node() {
        this.previous = null;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node[] getNext() {
        return next;
    }

    public void setNext(Node[] next) {
        this.next = next;
    }

}

class Runner {

    public static void main(String[] args) {

        Node root = new Node();
        Node previous = root;

        root.setKey(1);
        
        for (int i = 0; i < 10; i++) {

            Node[] next = new Node[10];

            for (int j = 0; j < next.length; j++) {

                next[j] = new Node();

                next[j].setKey((i * 10) + j);
                next[j].setPrevious(previous);

            }

            previous.setNext(next);

        }

        print(root);

    }

    private static void print(Node root) {

        Node iterator = root;

        while (iterator != null) {

            System.out.println(iterator.getKey());

            for (Node next : iterator.getNext()) {
                System.err.println(next.getKey());
            }

            iterator = null;

        }

    }

}
