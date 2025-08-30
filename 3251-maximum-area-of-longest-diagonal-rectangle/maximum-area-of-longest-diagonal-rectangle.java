class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdig=0;
        int maxarea=0;
        int n=dimensions.length;

        for(int i=0;i<n;i++){
            int a=dimensions[i][0];
            int b=dimensions[i][1];

            int dim=(a*a+b*b);
            double dig=Math.sqrt(dim);
            int area=a*b;

            if(dig>maxdig){
                maxdig=dig;
                maxarea=area;
            }
            else if(dig==maxdig){
                maxarea=Math.max(maxarea,area);

            }

        }
        return maxarea;
        
    }
}