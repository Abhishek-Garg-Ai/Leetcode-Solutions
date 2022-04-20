class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int ans=0;
        int i=0;
        while(i<tasks.length){
            int count=0;
            int j=i;
            while(j<tasks.length && tasks[i]==tasks[j]){
                j+=1;
                count+=1;
            }
            if(count<2) return -1;
            if(count==2) ans+=1;
            else if(count%3==0) ans+=count/3;
            else ans+=count/3+1;
            i=j;
        }
        return ans;
    }
}