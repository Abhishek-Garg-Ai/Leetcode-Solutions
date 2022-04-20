class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:tasks) map.put(i,map.getOrDefault(i,0)+1);
        int ans=0;
        for(int level: map.keySet()){
            int count=map.get(level);
            if(count<2) return -1;
            if(count==2) ans+=1;
            else if(count%3==0) ans+=count/3;
            else if(count%3==2) ans+=count/3+1;
            else if(count%3==1) ans+=count/3+1;
        }
        return ans;
    }
}