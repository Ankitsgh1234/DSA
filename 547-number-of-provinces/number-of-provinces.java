class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;

        boolean[] isvis=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!isvis[i]){
                bfs(i,isvis,isConnected);
                c++;
            }
        }
        return c;
    }
    public static void bfs(int i,boolean[] isvis,int[][] adj){
        int n=adj.length;
        isvis[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int f=q.remove();
            for(int j=0;j<n;j++){
                if(adj[f][j]==1&&isvis[j]==false){
                    q.add(j);
                    isvis[j]=true;
                }
            }
        }
    }
}