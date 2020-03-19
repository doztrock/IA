package solver;

class Runner {

    private final int[][] SCHEME = {
        {Direction.DOWN, Direction.RIGHT}, {Direction.LEFT, Direction.DOWN, Direction.RIGHT}, {Direction.LEFT, Direction.DOWN},
        {Direction.UP, Direction.RIGHT}, {Direction.LEFT, Direction.UP, Direction.RIGHT}, {Direction.LEFT, Direction.UP}
    };

    public static void main(String[] args) {

        Node root = new Node();
        Node previous;

        print(root);

    }

    private static void print(Node root) {

    }

}
