// 八皇后问题
// 
public class EightQueens {
    // 定义一个8x8的棋盘
    int num = 4;
    int[] board = new int[num];
    int solutions = 0;

    public static void main(String[] args) {
        EightQueens queens = new EightQueens();
        queens.solve(0);
        System.out.println("Total solutions: " + queens.solutions);
    }

    // 判断第row行第col列是否可以放置皇后
    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            // 检查同列、主对角线、副对角线是否有冲突
            if (board[i] == col || 
            	Math.abs(i - row) == Math.abs(board[i] - col)) {
                return false;
            }
        }
        return true;
    }

    // 尝试在第row行放置皇后
    private void solve(int row) {
        if (row == num) { 
            solutions++;
            printBoard();
            return;
        }
        for (int col = 0; col < num; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

    // 打印棋盘
    private void printBoard() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
