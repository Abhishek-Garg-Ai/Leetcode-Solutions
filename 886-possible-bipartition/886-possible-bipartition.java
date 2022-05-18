class Solution {
    int[] color;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> lt=new ArrayList<>();
        color=new int[n+1];
        Arrays.fill(color,-1);
        for(int i=0;i<=n;i++) lt.add(new ArrayList<Integer>());
        for(int[] dislike: dislikes){
            lt.get(dislike[0]).add(dislike[1]);
            lt.get(dislike[1]).add(dislike[0]);
        }
        for(int i=1;i<=n;i++){
            if(color[i]==-1)
                if(!dfs(lt,i,0)) return false;
        }
        return true;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> lt, int curr, int curr_color){
        color[curr]=curr_color;
        for(int u:lt.get(curr)){
            if(color[u]==-1){
                if(!dfs(lt,u,1-curr_color)) return false;
            }
            else if(color[u]==curr_color) return false;
        }
        return true;
    }
}