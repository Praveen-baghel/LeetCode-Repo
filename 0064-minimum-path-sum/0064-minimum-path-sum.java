class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int r=grid.length,c=grid[0].length;
        int[][] res=new int[r][c];
        res[0][0]=grid[0][0];
        for(int i=1;i<r;i++)
            res[i][0]=res[i-1][0]+grid[i][0];
        for(int i=1;i<c;i++)
            res[0][i]=res[0][i-1]+grid[0][i];
        for(int i=1;i<r;i++)
            for(int j=1;j<c;j++)
                res[i][j]=Math.min(res[i-1][j],res[i][j-1])+grid[i][j];
        return res[r-1][c-1];
    }
}