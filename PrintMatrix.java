package nowcoder;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
// 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
// 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
import java.util.ArrayList;
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==0||col==0){
            return result;
        }
        //求矩阵的层数
        int layers=(Math.min(row,col)-1)/2+1;
        for(int i=0;i<layers;i++){
            for(int m=i;m<col-i;m++){
                result.add(matrix[i][m]);
            }
            for(int n=i+1;n<row-i;n++){
                result.add(matrix[n][col-i-1]);
            }
            //row-i-1!=i处理只有一行的情况
            for(int p=col-i-2;(p>=i)&&(row-i-1!=i);p--){
                result.add(matrix[row-i-1][p]);
            }
            //col-i-1!=i处理只有一列的情况
            for(int q=row-i-2;(q>i)&&(col-i-1!=i);q--){
                result.add(matrix[q][i]);
            }
        }
        return result;
    }
}
