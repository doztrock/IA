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
            solution.add(executeMovement(Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new), direction));
        }

        return solution;
    }

    /**
     * Funcion encargada de realizar el movimiento del elemento cero, en la
     * direccion asignada.
     *
     * @param matrix Matriz
     * @param direction Direccion del movimiento
     * @return Matriz con el movimiento realizado
     */
    public static int[][] executeMovement(int[][] matrix, int direction) {

        /**
         * Posicion de origen
         */
        int currentROW = 0;
        int currentCOLUMN = 0;

        /**
         * Posicion de destino
         */
        int nextROW = 0;
        int nextCOLUMN = 0;

        for (int row = 0; row < 2; row++) {

            for (int column = 0; column < 3; column++) {

                if (matrix[row][column] == 0) {

                    /**
                     * Almacenamos la posicion de origen
                     */
                    currentROW = row;
                    currentCOLUMN = column;

                    /**
                     * Almacenamos la posicion de destino
                     */
                    nextROW = row;
                    nextCOLUMN = column;

                    break;
                }

            }

        }

        /**
         * Dependiendo de la direccion en la que se debe realizar el movimiento,
         * asignaremos las posiciones de destino y luego realizamos el
         * intercambio
         */
        switch (direction) {

            /**
             * Arriba
             */
            case Direction.UP:
                nextROW = currentROW - 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            /**
             * Abajo
             */
            case Direction.DOWN:
                nextROW = currentROW + 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            /**
             * Izquierda
             */
            case Direction.LEFT:
                nextCOLUMN = currentCOLUMN - 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

            /**
             * Derecha
             */
            case Direction.RIGHT:
                nextCOLUMN = currentCOLUMN + 1;
                matrix = swap(matrix, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                break;

        }

        return matrix;
    }

    /**
     * Funcion encargada de realizar el intercambio de elementos dentro de la
     * matriz, es decir, de la posicion actual, a la posicion de destino.
     *
     * @param board Matriz
     * @param currentROW FILA actual
     * @param currentCOLUMN COLUMNA actual
     * @param nextROW FILA nueva
     * @param nextCOLUMN COLUMNA nueva
     * @return Matriz con el intercambio realizado
     */
    private static int[][] swap(int[][] matrix, int currentROW, int currentCOLUMN, int nextROW, int nextCOLUMN) {

        /**
         * Almacenamos los valores actuales
         */
        int currentVALUE = matrix[currentROW][currentCOLUMN];
        int nextVALUE = matrix[nextROW][nextCOLUMN];

        /**
         * Realizamos el intercambio
         */
        matrix[currentROW][currentCOLUMN] = nextVALUE;
        matrix[nextROW][nextCOLUMN] = currentVALUE;

        return matrix;
    }

    private static void print(Node root) {

    }

}
