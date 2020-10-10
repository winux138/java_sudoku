package sudoku;

public class Grid {
    private char[][] grid = {{}};

    public Grid() {
    }

    public void initGrid() {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.grid[i][j] = ' ';
            }
        }
    }
}
