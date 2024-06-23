public class WordSearch {
    public static void main(String[] args) {
        char boards[][]=new char[3][4];
        int row=boards.length;
        int column=boards[0].length;
        String s="ABCESFCSADEE";
        int l=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                boards[i][j]=s.charAt(l);
                l++;
            }
        }
        printBoard(boards);
        System.out.println(findStringInBoard(boards,"ABCCED"));
        

    }   

    public static boolean findStringInBoard(char[][] boards, String word){
        int row=boards.length;
        int column=boards[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(backtrack(0,row,column,i,j,boards,word)){
                    return true;
                }   
            }
        }
        return false;
    }

    public static boolean backtrack(int index,int row,int column,int i,int j,char boards[][],String word){
        if(index==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=row ||j>=column || word.charAt(index)!=boards[i][j]||boards[i][j] == '!'){
            return false;
        }

        char ch=boards[i][j];
        boards[i][j] = '!';
        boolean top=backtrack(index+1,row,column,i-1,j,boards,word);
        boolean right=backtrack(index+1,row,column,i,j+1,boards,word);
        boolean left=backtrack(index+1,row,column,i,j-1,boards,word);
        boolean bottom=backtrack(index+1,row,column,i+1,j,boards,word);
        boards[i][j] = ch;
        return top || right || bottom || left;
    }

    public static void printBoard(char boards[][]){
        int row=boards.length;
        int column=boards[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(boards[i][j]);

            }
            System.out.println("");
        }
    }

}
