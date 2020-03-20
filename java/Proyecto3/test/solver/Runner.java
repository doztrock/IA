package solver;

import java.util.Arrays;

class Runner {

    public static final int[][][] SCHEME = {
        {
            {Direction.DOWN, Direction.RIGHT},
            {Direction.LEFT, Direction.DOWN, Direction.RIGHT},
            {Direction.LEFT, Direction.DOWN}
        },
        {
            {Direction.UP, Direction.RIGHT},
            {Direction.LEFT, Direction.UP, Direction.RIGHT},
            {Direction.LEFT, Direction.UP}
        }
    };

    public static void main(String[] args) {

        Node root = new Node();
        Node previous;

        print(root);

        check();

    }

    private static void check() {

        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 5}
        };

        int currentRow = 0;
        int currentColumn = 0;

        // Ubicamos donde esta posicion vacia
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] == 0) {
                    currentRow = i;
                    currentColumn = j;
                    break;
                }

            }

        }

        // Hallamos los posibles movimientos
        int movement[] = SCHEME[currentRow][currentColumn];

        for (int i = 0; i < movement.length; i++) {

            int[][] solution = move(Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new), movement[i]);

            System.out.println("========================");

            for (int I = 0; I < 2; I++) {

                for (int J = 0; J < 3; J++) {
                    System.out.print(solution[I][J]);
                }

                System.out.println();
            }

            System.out.println("========================");

        }

    }

    public static int[][] move(int[][] matrix, int direction) {

        // Posicion actual
        int currentROW = 0;
        int currentCOLUMN = 0;

        // Posicion nueva
        int nextROW = 0;
        int nextCOLUMN = 0;

        for (int row = 0; row < 2; row++) {

            for (int column = 0; column < 3; column++) {

                if (matrix[row][column] == 0) {

                    // Guardamos la posicion actual
                    currentROW = row;
                    currentCOLUMN = column;

                    // Asignamos una posicion por defecto
                    nextROW = row;
                    nextCOLUMN = column;

                    break;
                }

            }

        }

        switch (direction) {

            case Direction.UP:
                nextROW = currentROW - 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            case Direction.DOWN:
                nextROW = currentROW + 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            case Direction.LEFT:
                nextCOLUMN = currentCOLUMN - 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            case Direction.RIGHT:
                nextCOLUMN = currentCOLUMN + 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

        }

        return matrix;
    }

    private static int[][] swap(int[][] matrix, int currentROW, int currentCOLUMN, int nextROW, int nextCOLUMN) {

        int currentVALUE = matrix[currentROW][currentCOLUMN];
        int nextVALUE = matrix[nextROW][nextCOLUMN];

        matrix[currentROW][currentCOLUMN] = nextVALUE;
        matrix[nextROW][nextCOLUMN] = currentVALUE;

        return matrix;
    }

    private static void print(Node root) {

    }

}
