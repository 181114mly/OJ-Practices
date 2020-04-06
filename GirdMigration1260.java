package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GirdMigration1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int[] newgrid=new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                k%=row*col;
                newgrid[k]=grid[i][j];
                k++;
            }
        }
        int m=0;
        List<List<Integer>> A=new ArrayList<>(row);
        for(int i=0;i<row;i++){
            List<Integer> B=new ArrayList<>(col);
            for(int j=0;j<col;j++){
                B.add(newgrid[m]);
                m++;
            }
            A.add(B);
        }
        return A;
    }
}
