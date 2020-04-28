package paquete;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
        this.BOARD = new JButton[this.ROWS][this.COLUMNS];

        /**
         * Inicializamos los componentes
         */
        initComponents();

        /**
         * Llenamos el tablero
         */
        fill();

        /**
         * Colocamos las fichas
         */
        putHorse(4, 0);
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
    private void fill() {

        /**
         * Llenamos el tablero
         */
        for (int row = 0; row < this.ROWS; row++) {

            for (int column = 0; column < this.COLUMNS; column++) {

                int position = ((row * this.ROWS) + column);
                Color color = ((row % 2 == 0 ? position : position + 1) % 2 == 0 ? Color.WHITE : Color.BLACK);

                this.BOARD[row][column] = new JButton();
                this.BOARD[row][column].setBackground(color);
                this.BOARD[row][column].setName(row + ":" + column);

                this.BOARD[row][column].addActionListener((ActionEvent event) -> {
                    clickNormalBox((JButton) event.getSource());
                });

                this.panel.add(this.BOARD[row][column]);

            }

        }

    }

    /**
     * Funcion: putHorse()
     *
     * Objetivo: Colocar el icono del caballo en el tablero.
     *
     * @param row Fila
     * @param column Columna
     */
    public final void putHorse(int row, int column) {

        Image horse;
        ImageIcon horseIcon = null;

        try {
            horse = ImageIO.read(getClass().getResource("/horse.png"));
            horseIcon = new ImageIcon(horse);
            horseIcon.setDescription("HORSE");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        this.BOARD[row][column].setIcon(horseIcon);

    }

    /**
     * Funcion: putGoal()
     *
     * Objetivo: Colocar el icono de la meta en el tablero.
     *
     * @param row Fila
     * @param column Columna
     */
    public final void putGoal(int row, int column) {

        Image goal;
        ImageIcon goalIcon = null;

        try {
            goal = ImageIO.read(getClass().getResource("/goal.png"));
            goalIcon = new ImageIcon(goal);
            goalIcon.setDescription("GOAL");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        this.BOARD[row][column].setIcon(goalIcon);

    }

    /**
     * Funcion: clickNormalBox()
     *
     * Objetivo: Procesar cuando se haga un click en alguna de las casillas del
     * tablero.
     *
     * @param box Casilla
     */
    public void clickNormalBox(JButton box) {

        int row = Character.digit(box.getName().charAt(0), 10);
        int column = Character.digit(box.getName().charAt(2), 10);

        if (box.getIcon() == null) {
            return;
        }

        if (((ImageIcon) box.getIcon()).getDescription().equals("HORSE")) {
            clickHorseBox(row, column);
        }

        if (((ImageIcon) box.getIcon()).getDescription().equals("GOAL")) {
            clickGoalBox();
        }

    }

    /**
     * Funcion: clickNormalBox()
     *
     * Objetivo: Procesar cuando se haga un click en alguna de las posibles
     * casillas de movimiento.
     *
     * @param pathBox
     * @param horseBox
     */
    public void clickPathBox(JButton pathBox, JButton horseBox) {

        /**
         * Posicion
         */
        int pathRow = Character.digit(pathBox.getName().charAt(0), 10);
        int pathColumn = Character.digit(pathBox.getName().charAt(2), 10);

        /**
         * Movemos el caballo
         */
        horseBox.setIcon(null);
        putHorse(pathRow, pathColumn);

    }

    /**
     * Funcion: clickHorseBox()
     *
     * Objetivo: Definir las acciones que se realizaran una vez que se haga
     * click en la casilla que contiene al caballo.
     *
     * @param row
     * @param column
     */
    public void clickHorseBox(int row, int column) {

        // Deshabilitamos el tablero
        disableBoard();

        // Habilitamos la casilla del caballo
        this.BOARD[row][column].setEnabled(true);

        // Habilitamos las posibles casillas a las que se puede mover el caballo
        generateHorsePath(row, column).forEach((box) -> {

            box.setEnabled(true);

            box.addActionListener((ActionEvent event) -> {
                clickPathBox((JButton) event.getSource(), this.BOARD[row][column]);
            });

        });

    }

    /**
     * Funcion: clickGoalBox()
     *
     * Objetivo: Definir las acciones que se realizaran una vez que se haga
     * click en la casilla que contiene la meta.
     */
    public void clickGoalBox() {
    }

    /**
     * Funcion: enableBoard
     *
     * Objetivo: Habilitar las casillas del tablero.
     *
     */
    public void enableBoard() {

        for (int row = 0; row < this.ROWS; row++) {
            for (int column = 0; column < this.COLUMNS; column++) {
                this.BOARD[row][column].setEnabled(true);
            }
        }

    }

    /**
     * Funcion: disableBoard
     *
     * Objetivo: Deshabilitar las casillas del tablero.
     *
     */
    public void disableBoard() {

        for (int row = 0; row < this.ROWS; row++) {
            for (int column = 0; column < this.COLUMNS; column++) {
                this.BOARD[row][column].setEnabled(false);
            }
        }

    }

    /**
     * Funcion: generateHorsePath()
     *
     * Objetivo: Generar el listado de las posibles casillas a las que se puede
     * mover el caballo.
     *
     * @param row Fila
     * @param column Columna
     * @return ArrayList<>
     */
    public ArrayList<JButton> generateHorsePath(int row, int column) {

        ArrayList<JButton> horsePath = new ArrayList<>();

        // Arriba IZQUIERDA
        int U_L_ROW = row - 2;
        int U_L_COLUMN = column - 1;

        if (U_L_ROW >= 0 && U_L_ROW < ROWS) {
            if (U_L_COLUMN >= 0 && U_L_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[U_L_ROW][U_L_COLUMN]);
            }
        }

        // Arriba DERECHA
        int U_R_ROW = row - 2;
        int U_R_COLUMN = column + 1;

        if (U_R_ROW >= 0 && U_R_ROW < ROWS) {
            if (U_R_COLUMN >= 0 && U_R_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[U_R_ROW][U_R_COLUMN]);
            }
        }

        // Abajo IZQUIERDA
        int D_L_ROW = row + 2;
        int D_L_COLUMN = column - 1;

        if (D_L_ROW >= 0 && D_L_ROW < ROWS) {
            if (D_L_COLUMN >= 0 && D_L_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[D_L_ROW][D_L_COLUMN]);
            }
        }

        // Abajo DERECHA
        int D_R_ROW = row + 2;
        int D_R_COLUMN = column + 1;

        if (D_R_ROW >= 0 && D_R_ROW < ROWS) {
            if (D_R_COLUMN >= 0 && D_R_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[D_R_ROW][D_R_COLUMN]);
            }
        }

        // Izquierda ARRIBA
        int L_U_ROW = row - 1;
        int L_U_COLUMN = column - 2;

        if (L_U_ROW >= 0 && L_U_ROW < ROWS) {
            if (L_U_COLUMN >= 0 && L_U_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[L_U_ROW][L_U_COLUMN]);
            }
        }

        // Izquierda ABAJO
        int L_D_ROW = row + 1;
        int L_D_COLUMN = column - 2;

        if (L_D_ROW >= 0 && L_D_ROW < ROWS) {
            if (L_D_COLUMN >= 0 && L_D_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[L_D_ROW][L_D_COLUMN]);
            }
        }

        // Derecha ARRIBA
        int R_U_ROW = row - 1;
        int R_U_COLUMN = column + 2;

        if (R_U_ROW >= 0 && R_U_ROW < ROWS) {
            if (R_U_COLUMN >= 0 && R_U_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[R_U_ROW][R_U_COLUMN]);
            }
        }

        // Derecha ABAJO
        int R_D_ROW = row + 1;
        int R_D_COLUMN = column + 2;

        if (R_D_ROW >= 0 && R_D_ROW < ROWS) {
            if (R_D_COLUMN >= 0 && R_D_COLUMN < COLUMNS) {
                horsePath.add(this.BOARD[R_D_ROW][R_D_COLUMN]);
            }
        }

        return horsePath;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
