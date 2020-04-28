package paquete;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Chess extends javax.swing.JFrame {

    /**
     * Dimensiones del tablero
     */
    private final int ROWS = 8;
    private final int COLUMNS = 8;

    /**
     * Matriz de tablero
     */
    private final JButton[][] BOARD;

    public Chess() {

        /**
         * Inicializamos la matriz
         */
        this.BOARD = new JButton[ROWS][COLUMNS];

        /**
         * Inicializamos los componentes
         */
        initComponents();

        /**
         * Llenamos el tablero
         */
        fill(ROWS, COLUMNS);

        /**
         * Colocamos las fichas
         */
        putHorse(7, 2);
        putGoal(0, 6);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez");
        setResizable(false);

        panel.setLayout(new java.awt.GridLayout(8, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Chess().setVisible(true);
        });

    }

    /**
     * Funcion: fill()
     *
     * Objectivo: Llenar el panel de botones (casillas).
     *
     */
    private void fill(int rows, int columns) {

        /**
         * Llenamos el tablero
         */
        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {

                int position = ((row * ROWS) + column);
                Color color = ((row % 2 == 0 ? position : position + 1) % 2 == 0 ? Color.WHITE : Color.BLACK);

                this.BOARD[row][column] = new JButton();
                this.BOARD[row][column].setBackground(color);

                this.panel.add(this.BOARD[row][column]);

            }

        }

    }

    /**
     * Funcion: putHorse
     *
     * Objetivo: Colocar el icono del caballo en el tablero.
     *
     * @param row
     * @param column
     */
    public final void putHorse(int row, int column) {

        /**
         * Obtenemos la imagen
         */
        Image horse = null;

        try {
            horse = ImageIO.read(getClass().getResource("/horse.png"));
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        this.BOARD[row][column].setIcon(new ImageIcon(horse));

    }

    /**
     * Funcion: putGoal
     *
     * Objetivo: Colocar el icono de la meta en el tablero.
     *
     * @param row
     * @param column
     */
    public final void putGoal(int row, int column) {

        /**
         * Obtenemos la imagen
         */
        Image goal = null;

        try {
            goal = ImageIO.read(getClass().getResource("/goal.png"));
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        this.BOARD[row][column].setIcon(new ImageIcon(goal));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
