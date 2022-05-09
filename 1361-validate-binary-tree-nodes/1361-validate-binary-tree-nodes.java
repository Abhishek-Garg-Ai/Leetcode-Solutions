class Solution {
    // boolean[] visited;
    HashSet<Integer> set;
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        // visited=new boolean[n+1];
        set=new HashSet<>();
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(helper(i,leftChild,rightChild) && set.size()==n) return true;
            set.clear();
        }
        return  false;
            
            
        
    }
    
    public boolean helper(int curr,int[] left,int[] right){
        if(curr==-1) return true;
        if(set.contains(curr)) return false;
        set.add(curr);
        return helper(left[curr],left,right) && helper(right[curr],left,right);
    }
}