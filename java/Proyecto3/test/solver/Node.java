package solver;

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
    private Node A;
    private Node B;
    private Node C;

    public Node() {

        this.previous = null;

        this.A = null;
        this.B = null;
        this.C = null;

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

    public Node getA() {
        return A;
    }

    public void setA(Node A) {
        this.A = A;
    }

    public Node getB() {
        return B;
    }

    public void setB(Node B) {
        this.B = B;
    }

    public Node getC() {
        return C;
    }

    public void setC(Node C) {
        this.C = C;
    }

}
