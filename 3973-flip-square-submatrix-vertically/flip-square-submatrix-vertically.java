class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] arr=new int[k][k];
        int s=k;
        for(int i=x;i<x+k;i++){
            for(int j=y;j<y+k;j++){
                arr[i-x][j-y]=grid[i][j];
            }
        }
         for( int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }
                System.out.println();
        int i=0;

       while(i<k){
        for(int j=0;j<s;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[k-1][j];
            arr[k-1][j]=temp;;
        }
        i++;
        k--;
       }
       k=s;
        for( i=0;i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }
          for( i=x;i<x+k;i++){
            for(int j=y;j<y+k;j++){
               grid[i][j]= arr[i-x][j-y];
            }
        }
        return grid;

    }
}