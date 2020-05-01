package LeetCode;
//在二维数组中进行查找
public class Find {
    //方法1
    public boolean Find(int target, int [][] array) {
        int row=array.length-1;
        int col=0;
        boolean flag=false;
        while(col<array[0].length&&row>=0){
            int aim=array[row][col];
            if(target<aim){
                row--;
            }
            else if(target>aim){
                col++;
            }
            else{
                flag=true;
                break;
            }
        }
        return flag;
    }
    //方法2
    public boolean Find1(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            int low=0;
            int high=array[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(target>array[i][mid]){
                    low=mid+1;
                }
                else if(target<array[i][mid]){
                    high=mid-1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}
