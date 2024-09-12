//optimised approach using hashing
class Solution {
    public List<List<String>> solveNQueens(int n) {
       char[][] board = new char[n][n];

       // Initialize the board with all empty cells ('.')
       for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        
        //3 hash arrays for validation of placing Q
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
        return res; 
    }

    static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        //base condition
        if (col == board.length) {
           // Directly add the board as a list of strings
           List<String> current = new ArrayList<>();
           for (int i = 0; i < board.length; i++) {
               current.add(new String(board[i]));
            }
            res.add(current);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) 
            //In hashing it'll have 0 or 1 if have 0 then proceed
            {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;

                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                
                //backtrack step or omit step to return the default board and default hashings
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }


    /*static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }*/
    
}