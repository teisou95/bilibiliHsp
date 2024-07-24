// �˻ʺ�����
// 
public class EightQueens {
    // ����һ��8x8������
    int num = 4;
    int[] board = new int[num];
    int solutions = 0;

    public static void main(String[] args) {
        EightQueens queens = new EightQueens();
        queens.solve(0);
        System.out.println("Total solutions: " + queens.solutions);
    }

    // �жϵ�row�е�col���Ƿ���Է��ûʺ�
    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            // ���ͬ�С����Խ��ߡ����Խ����Ƿ��г�ͻ
            if (board[i] == col || 
            	Math.abs(i - row) == Math.abs(board[i] - col)) {
                return false;
            }
        }
        return true;
    }

    // �����ڵ�row�з��ûʺ�
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

    // ��ӡ����
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
