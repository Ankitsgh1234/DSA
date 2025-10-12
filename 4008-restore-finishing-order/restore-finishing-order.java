class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n1=order.length;
        int n2=friends.length;
        int[] arr=new int[n2];
        List<Integer> order1=Arrays.stream(order).boxed().toList();
        List<Integer> friend1=Arrays.stream(friends).boxed().toList();
        
        int k=0;

        for(int i=0;i<n1;i++){
            int num=order[i];
            if(friend1.contains(num)){
                arr[k++]=num;

            }
        }
        return arr;
    }
}