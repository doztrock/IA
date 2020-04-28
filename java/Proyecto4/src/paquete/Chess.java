package paquete;

import java.awt.Color;
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

        fill(ROWS, COLUMNS);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez");

        panel.setLayout(new java.awt.GridLayout(8, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chess().setVisible(true);
            }
        });

    }

    /**
     * Funcion: fill()
     *
     * Objectivo: Llenar el panel de botones (casillas).
     *
     */
    private void fill(int rows, int columns) {

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
