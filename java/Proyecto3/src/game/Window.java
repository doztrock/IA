package game;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(controlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        move(evt);
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

    private static int[][] generateMatrix(int rows, int columns) {

        // Generador de aleatorios
        Random random = new Random();

        // Matriz resultante
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {

                int index = random.nextInt(AVAILABLE.length);

                matrix[row][column] = AVAILABLE[index];
                AVAILABLE = ArrayUtils.remove(AVAILABLE, index);

            }

        }

        return matrix;
    }

    private void displayMatrix() {

        int[][] matrix = generateMatrix(MAX_ROWS, MAX_COLUMNS);
        JButton[][] board = {{positionButton11, positionButton12, positionButton13}, {positionButton21, positionButton22, positionButton23}};

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {

                board[row][column].setText("" + matrix[row][column] + "");

                if (matrix[row][column] == 0) {
                    board[row][column].setText("");
                    board[row][column].requestFocus();
                }

            }
        }

    }

    private void move(KeyEvent key) {

        // Tablero
        JButton[][] board = {{positionButton11, positionButton12, positionButton13}, {positionButton21, positionButton22, positionButton23}};

        // Posicion actual
        int currentROW = 0;
        int currentCOLUMN = 0;

        // Posicion nueva
        int nextROW = 0;
        int nextCOLUMN = 0;

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {

                if (board[row][column].getText().isEmpty()) {
                    currentROW = row;
                    currentCOLUMN = column;

                    nextROW = row;
                    nextCOLUMN = column;
                }

            }
        }

        switch (key.getKeyCode()) {

            case KeyEvent.VK_UP:

                nextROW = currentROW - 1;

                if (nextROW >= 0) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                }

                break;

            case KeyEvent.VK_DOWN:

                nextROW = currentROW + 1;

                if (nextROW < MAX_ROWS) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                }

                break;

            case KeyEvent.VK_LEFT:

                nextCOLUMN = currentCOLUMN - 1;

                if (nextCOLUMN >= 0) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                }

                break;

            case KeyEvent.VK_RIGHT:

                nextCOLUMN = currentCOLUMN + 1;

                if (nextCOLUMN < MAX_COLUMNS) {
                    swap(board, currentROW, currentCOLUMN, nextROW, nextCOLUMN);
                }

                break;

        }

    }

    private void swap(JButton[][] board, int currentROW, int currentCOLUMN, int nextROW, int nextCOLUMN) {

        board[currentROW][currentCOLUMN].setText(board[nextROW][nextCOLUMN].getText());

        board[nextROW][nextCOLUMN].setText("");
        board[nextROW][nextCOLUMN].requestFocus();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
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
