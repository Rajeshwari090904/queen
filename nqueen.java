public class Main {


    public static boolean isSafe(char[][]board,int row, int col){

        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right digonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void N_queen(char[][]board,int row){

        if(row== board.length){
            printBoard(board);
            return;
        }

        for(int j=0;j< board.length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                N_queen(board, row + 1);
                board[row][j] = '*';
            }
        }
    }

    public static void printBoard(char[][]board){
        System.out.println("-----------Chessboard-----------");
        for(int i=0;i<board.length;i++){
            for (int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int n=5;
        char[][]board=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='*';
            }
        }
        N_queen(board,0);
    }
}

    

