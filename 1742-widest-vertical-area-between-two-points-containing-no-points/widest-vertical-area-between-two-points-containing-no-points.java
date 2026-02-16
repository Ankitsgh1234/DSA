class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        // for(int i=0;i<n;i++){

        // Arrays.sort(points[i]);
        // }

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int max=0;
        for(int i=1;i<n;i++){
            max=Math.max(max,points[i][0]-points[i-1][0]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                System.out.print(points[i][j]+" ");
            }
            System.out.println();
        }
        return max;
    }
}