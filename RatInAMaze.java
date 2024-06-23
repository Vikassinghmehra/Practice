import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
   static List<String>list =new ArrayList<>();
    public static void main(String[] args) {
        int boards[][]=new int[4][4];
        int row=boards.length;
        int column=boards[0].length;
        String s="1000110111000111";
        int l=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                boards[i][j]=Integer.parseInt(s.charAt(l)+"");
                l++;
            }
        }
        printBoard(boards);

        findAllPathInBoard(boards,0,0,row,column,"");
        System.out.println(list);

    }   

    public static void findAllPathInBoard(int[][] boards,int i,int j,int row,int column, String temp){
        
        if(i==row-1 && j==column-1 && boards[i][j]==1){
            list.add(temp);
            return ;
        }
        
        if(i<0 || j<0 || i>=row||j>=column || boards[i][j]==0)
        {
            return ;
        }

        boards[i][j] = 0;
        findAllPathInBoard(boards,i-1,j,row,column,temp+"U");
        findAllPathInBoard(boards,i,j+1,row,column,temp+"R");    
        findAllPathInBoard(boards,i,j-1,row,column,temp+"L");    
        findAllPathInBoard(boards,i+1,j,row,column,temp+"D");    
        
        boards[i][j] = 1;
    }

    public static void printBoard(int boards[][]){
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
