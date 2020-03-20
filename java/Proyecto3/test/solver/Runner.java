package solver;

import java.util.ArrayList;
import java.util.Arrays;

class Runner {

    /**
     * Dimensiones de la matriz
     */
    public static final int MAX_ROWS = 2;
    public static final int MAX_COLUMNS = 3;

    /**
     * Esquema de movimientos posibles
     */
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

    }

    /**
     * Genera las posibles soluciones a la matriz dependiendo de donde se
     * encuentre el elemento cero, que para este caso representara a la celda
     * que estara vacia.
     *
     * @param matrix
     * @return Listado de matrices con los movimientos posibles
     */
    private static ArrayList<int[][]> generateSolution(int[][] matrix) {

        /**
         * Listado de soluciones
         */
        ArrayList<int[][]> solution = new ArrayList<>();

        /**
         * Posicion del elemento cero
         */
        int currentROW = 0;
        int currentCOLUMN = 0;

        /**
         * Ubicamos la posicion del elemento cero
         */
        for (int row = 0; row < MAX_ROWS; row++) {

            for (int column = 0; column < MAX_COLUMNS; column++) {

                if (matrix[row][column] == 0) {
                    currentROW = row;
                    currentCOLUMN = column;
                    break;
                }

            }

        }

        /**
         * Hallamos los diferentes movimientos que se pueden realizar desde la
         * posicion en la que se encuentra el elemento cero
         */
        for (int direction : SCHEME[currentROW][currentCOLUMN]) {
            solution.add(move(Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new), direction));
        }

        return solution;
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
