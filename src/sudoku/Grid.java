package sudoku;

import javax.swing.*;

public class Grid {
    private char[][] grid = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

    public Grid() {
    }


    private boolean checkInsertLine(char insert, int line) {
        boolean validInsert = true;
        for (int i = 0; i < 9; ++i) {
            if (insert == grid[line][i]) {
                validInsert = false;
            }
        }
        return validInsert;
    }

    private boolean checkInsertColumn(char insert, int column) {
        boolean validInsert = true;
        for (int i = 0; i < 9; ++i) {
            if (insert == grid[i][column]) {
                validInsert = false;
            }
        }
        return validInsert;
    }


    private boolean checkInsertSquare(char insert, int line, int column) {
        boolean validInsert = true;
        line /= 3;
        column /= 3;
        System.out.println("line :" + line + "\tcolumn :" + column);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; i < 3; ++i) {
                if (insert == grid[line * 3 + i][column * 3 + j]) {
                    validInsert = false;
                }
            }
        }
        return validInsert;
    }

    public boolean checkInsert(char insert, int line, int column){
        return checkInsertLine(insert, line) || checkInsertColumn(insert, column) || checkInsertSquare(insert, line, column);
    }
}
