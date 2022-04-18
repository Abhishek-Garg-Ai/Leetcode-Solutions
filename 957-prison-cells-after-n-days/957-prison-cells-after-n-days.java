class Solution {
    HashMap<String, Integer> map=new HashMap<>();
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[] start=Arrays.copyOf(cells,8);
        int loop=-1;
        for(int j=0;j<n;j++){
            // System.out.println(Arrays.toString(cells));
            if(map.containsKey(Arrays.toString(cells))){
                loop=j;
                break;
            } 
            else map.put(Arrays.toString(cells),j);
            cells=helper(cells);
            }
        
        if(loop==-1) return cells;
        int s=map.get(Arrays.toString(cells));
        // System.out.println(loop+" "+s);
        loop-=s;
        // cells=Arrays.copyOf(start,8);
        for(int i=0;i<(n-s)%loop;i++){
            cells=helper(cells);
        }
        return cells;
    }
    
    public int[] helper(int[] cells){
        int[] ans=new int[8];
        for(int i=1;i<7;i++){
                if(cells[i-1] == cells[i+1]) ans[i]=1;
                else ans[i]=0;
            }
        return ans;
    }
}