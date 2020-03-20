package solver;

import java.util.ArrayList;

public class Node {

    /**
     * Codigo del nodo
     */
    private int[][] matrix;

    /**
     * Nodo previo
     */
    private Node previous;

    /**
     * Nodo siguiente
     */
    private final ArrayList<Node> next;

    public Node() {
        this.previous = null;
        this.next = new ArrayList<>();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public ArrayList<Node> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next.add(next);
    }

}
