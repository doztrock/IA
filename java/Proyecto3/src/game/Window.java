package game;

import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JButton;
import org.apache.commons.lang3.ArrayUtils;

public class Window extends javax.swing.JFrame {

    /**
     * Dimensiones de la matriz
     */
    public static final int MAX_ROWS = 2;
    public static final int MAX_COLUMNS = 3;

    /**
     * Numeros disponibles
     */
    public static int[] AVAILABLE = {1, 2, 3, 4, 5, 0};

    /**
     * Solucion del juego
     */
    public static final String SOLUTION = "12345";

    public Window() {

        // Cargamos componentes
        initComponents();

        // Cargamos la matriz
        displayMatrix();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        positionPanel = new javax.swing.JPanel();
        position11 = new javax.swing.JPanel();
        positionButton11 = new javax.swing.JButton();
        position21 = new javax.swing.JPanel();
        positionButton21 = new javax.swing.JButton();
        position12 = new javax.swing.JPanel();
        positionButton12 = new javax.swing.JButton();
        position22 = new javax.swing.JPanel();
        positionButton22 = new javax.swing.JButton();
        position13 = new javax.swing.JPanel();
        positionButton13 = new javax.swing.JButton();
        position23 = new javax.swing.JPanel();
        positionButton23 = new javax.swing.JButton();
        controlPanel = new javax.swing.JPanel();
        labelMovement = new javax.swing.JLabel();
        labelMovementCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto 3 - Juego");
        setResizable(false);

        position11.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton11.setText("A");
        positionButton11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position11Layout = new javax.swing.GroupLayout(position11);
        position11.setLayout(position11Layout);
        position11Layout.setHorizontalGroup(
            position11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position11Layout.setVerticalGroup(
            position11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        position21.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton21.setText("D");
        positionButton21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position21Layout = new javax.swing.GroupLayout(position21);
        position21.setLayout(position21Layout);
        position21Layout.setHorizontalGroup(
            position21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position21Layout.setVerticalGroup(
            position21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        position12.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton12.setText("B");
        positionButton12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position12Layout = new javax.swing.GroupLayout(position12);
        position12.setLayout(position12Layout);
        position12Layout.setHorizontalGroup(
            position12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position12Layout.setVerticalGroup(
            position12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        position22.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton22.setText("E");
        positionButton22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position22Layout = new javax.swing.GroupLayout(position22);
        position22.setLayout(position22Layout);
        position22Layout.setHorizontalGroup(
            position22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position22Layout.setVerticalGroup(
            position22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        position13.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton13.setText("C");
        positionButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position13Layout = new javax.swing.GroupLayout(position13);
        position13.setLayout(position13Layout);
        position13Layout.setHorizontalGroup(
            position13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position13Layout.setVerticalGroup(
            position13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        position23.setPreferredSize(new java.awt.Dimension(120, 120));

        positionButton23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        positionButton23.setText("F");
        positionButton23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                positionButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout position23Layout = new javax.swing.GroupLayout(position23);
        position23.setLayout(position23Layout);
        position23Layout.setHorizontalGroup(
            position23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        position23Layout.setVerticalGroup(
            position23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        controlPanel.setPreferredSize(new java.awt.Dimension(130, 39));

        labelMovement.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labelMovement.setText("Movimientos:");

        labelMovementCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMovementCounter.setText("0");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMovement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMovementCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMovement)
                    .addComponent(labelMovementCounter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout positionPanelLayout = new javax.swing.GroupLayout(positionPanel);
        positionPanel.setLayout(positionPanelLayout);
        positionPanelLayout.setHorizontalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(position11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(position12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(position13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );
        positionPanelLayout.setVerticalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(positionPanelLayout.createSequentialGroup()
                        .addComponent(position13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(position23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, positionPanelLayout.createSequentialGroup()
                        .addComponent(position12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(position22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, positionPanelLayout.createSequentialGroup()
                        .addComponent(position11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(position21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(controlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(positionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positionButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_positionButtonKeyPressed

        // Verificamos la tecla presionada
        switch (evt.getKeyCode()) {

            // Si es una tecla de movimiento
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:

                // Realizamos el movimiento de la ficha
                move(evt);

                break;

        }

    }//GEN-LAST:event_positionButtonKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException exception) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, exception);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });

    }

    /**
     * Funcion encargada de generar la matriz con los numeros aleatorios que
     * posteriormente se mostraran en la interfaz.
     *
     * @param rows Cantidad de filas
     * @param columns Cantidad de columnas
     * @return Matriz de numeros
     */
    private int[][] generateMatrix(int rows, int columns) {

        // Generador de aleatorios
        Random random = new Random();

        // Matriz resultante
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                // Seleccionamos un numero al azar segun la longitud del arreglo
                int index = random.nextInt(AVAILABLE.length);

                // Obtenemos un elemento aleatorio
                matrix[row][column] = AVAILABLE[index];

                // Eliminamos el indice utilizado
                AVAILABLE = ArrayUtils.remove(AVAILABLE, index);

            }
        }

        return matrix;
    }

    /**
     * Funcion encargada de mostrar la matriz en el tablero principal de acuerdo
     * a la cantidad de filas y columnas que se especifican para este caso.
     */
    private void displayMatrix() {

        // Tablero de posiciones
        JButton[][] board = {{positionButton11, positionButton12, positionButton13}, {positionButton21, positionButton22, positionButton23}};

        // Generamos la matriz
        int[][] matrix = generateMatrix(MAX_ROWS, MAX_COLUMNS);

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {

                // Asignamos el numero a la posicion
                board[row][column].setText("" + matrix[row][column] + "");

                // Si el numero es 0 dejamos la posicion sin texto
                if (matrix[row][column] == 0) {
                    board[row][column].setText("");
                    board[row][column].requestFocus();
                }

            }
        }

    }

    /**
     * Funcion encargada de realizar el moviemiento de la celda que se encuentra
     * vacia, validando que esta no se pase de los limites del tablero.
     *
     * @param key Evento de tecla presionada
     */
    private void move(KeyEvent key) {

        // Tablero de posiciones
        JButton[][] board = {{positionButton11, positionButton12, positionButton13}, {positionButton21, positionButton22, positionButton23}};

        // Posicion actual
        int currentROW = 0;
        int currentCOLUMN = 0;

        // Posicion nueva
        int nextROW = 0;
        int nextCOLUMN = 0;

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {

                // Verificamos donde se encuentra la celda vacia
                if (board[row][column].getText().isEmpty()) {

                    // Guardamos la posicion actual
                    currentROW = row;
                    currentCOLUMN = column;

                    // Asignamos una posicion por defecto
                    nextROW = row;
                    nextCOLUMN = column;

                }

            }
        }

        switch (key.getKeyCode()) {

            // Arriba
            case KeyEvent.VK_UP:

                nextROW = currentROW - 1;

                if (nextROW >= 0) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                    updateMovementCounter();
                }

                break;

            // Abajo
            case KeyEvent.VK_DOWN:

                nextROW = currentROW + 1;

                if (nextROW < MAX_ROWS) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                    updateMovementCounter();
                }

                break;

            // Izquierda
            case KeyEvent.VK_LEFT:

                nextCOLUMN = currentCOLUMN - 1;

                if (nextCOLUMN >= 0) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                    updateMovementCounter();
                }

                break;

            // Derecha
            case KeyEvent.VK_RIGHT:

                nextCOLUMN = currentCOLUMN + 1;

                if (nextCOLUMN < MAX_COLUMNS) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                    updateMovementCounter();
                }

                break;

        }

    }

    /**
     * Funcion encargada de realizar el cambio entre celdas, llevando asi a
     * concluir el movimiento.
     *
     * @param board Tablero de posiciones
     * @param currentROW Fila actual
     * @param currentCOLUMN Columna actual
     * @param nextROW Fila nueva
     * @param nextCOLUMN Columna nueva
     */
    private void swap(JButton[][] board, int currentROW, int currentCOLUMN, int nextROW, int nextCOLUMN) {

        if (isSolved() == false) {

            board[currentROW][currentCOLUMN].setText(board[nextROW][nextCOLUMN].getText());

            board[nextROW][nextCOLUMN].setText("");
            board[nextROW][nextCOLUMN].requestFocus();

        }

    }

    /**
     * Funcion encargada de actualizar el contador de movimientos.
     */
    private void updateMovementCounter() {

        if (isSolved() == false) {
            labelMovementCounter.setText("" + (Integer.parseInt(labelMovementCounter.getText()) + 1) + "");
        }

    }

    /**
     * Funcion encargada de determinar si el juego se resolvio de manera
     * correcta.
     *
     * @return TRUE si el juego ha sido resuelto, FALSE en caso contrario.
     */
    private boolean isSolved() {

        JButton[] positions = {positionButton11, positionButton12, positionButton13, positionButton21, positionButton22, positionButton23};
        String content = new String();

        for (JButton position : positions) {
            content = content + position.getText();
        }

        return content.equals(SOLUTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel labelMovement;
    private javax.swing.JLabel labelMovementCounter;
    private javax.swing.JPanel position11;
    private javax.swing.JPanel position12;
    private javax.swing.JPanel position13;
    private javax.swing.JPanel position21;
    private javax.swing.JPanel position22;
    private javax.swing.JPanel position23;
    private javax.swing.JButton positionButton11;
    private javax.swing.JButton positionButton12;
    private javax.swing.JButton positionButton13;
    private javax.swing.JButton positionButton21;
    private javax.swing.JButton positionButton22;
    private javax.swing.JButton positionButton23;
    private javax.swing.JPanel positionPanel;
    // End of variables declaration//GEN-END:variables
}
