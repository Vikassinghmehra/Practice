import java.util.ArrayList;

/**
 * @author Vikas Mehra
 * @date 18/02/24 8:50 PM
 * https://leetcode.com/problems/set-matrix-zeroes/
 */
 public class SetMatrixToZero {

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        //HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Pair> map = new ArrayList<Pair>();

        //System.out.println(" Size" +row +" "+ column);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    System.out.println(" Elements" +i +" "+ j);
                    map.add(new Pair(i,j));
                }
            }
        }

        for (Pair pair : map) {
            System.out.println("Values: " + pair.first + " " + pair.second);
            setZero(matrix, pair.first, pair.second);
        }
    }
    public void setZero(int [][]matrix,int x,int y){
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<column;i++){
            matrix[x][i]=0;
        }

        for(int j=0;j<row;j++){
            matrix[j][y]=0;
        }
    }

}