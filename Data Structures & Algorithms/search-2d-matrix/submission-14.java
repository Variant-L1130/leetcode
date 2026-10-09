class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=matrix[0].length,r=matrix.length;
        int i=0,j=r-1;
        while(i<=j){
            int m = (i+j)/2; 
            if(matrix[m][c-1]<target){
                i= m+1;
            }
            else if(matrix[m][c-1]>target){
                j = m-1;
            }
            else{
                i=m;
                break;
            }
        }    
        if(i>=r){
                return false;
            }
            int l=0,ri=c-1;
            while(l<=ri){
                int n = (l+ri)/2;
                if(target>matrix[i][n]){
                    l = n+1;
                }
                else if(target < matrix[i][n]){
                    ri =n-1;
                }
                else{
                    return true;
                }
            }
            return false;
    }
}
