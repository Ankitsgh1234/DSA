class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        int X=0;
        int Y=0;

        int[][] x=new int[m][n];
        int[][] y=new int[m][n];
        for(int i =0;i<n;i++){
            if(grid[0][i]=='X'){
                X++;
            }
            x[0][i]=X;
        }
        System.out.println(X);
        X=0;
        for(int i= 0;i<m;i++){
            if(grid[i][0]=='X'){
                X++;
            }
            x[i][0]=X;
        }
        // System.out.println(X);
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]=='X'){
                    x[i][j]=x[i][j-1]+x[i-1][j]-x[i-1][j-1]+1;
                }
                else{
                    x[i][j]=x[i][j-1]+x[i-1][j]-x[i-1][j-1];

                }
            }
        }
        // System.out.println(x[1][1]);
        for(int i= 0;i<n;i++){
            if(grid[0][i]=='Y'){
                Y++;
            }
            y[0][i]=Y;
        }
        Y=0;
        for(int i =0;i<m;i++){
            if(grid[i][0]=='Y'){
                Y++;
            }
            y[i][0]=Y;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]=='Y'){
                    y[i][j]=y[i][j-1]+y[i-1][j]-y[i-1][j-1]+1;
                }
                else{
                    y[i][j]=y[i][j-1]+y[i-1][j]-y[i-1][j-1];

                }
            }
        }
        // System.out.println(y[1][1]);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x[i][j]!=0&&x[i][j]==y[i][j]){
                    c++;
                }
            }
        }
        return c;
    }
}