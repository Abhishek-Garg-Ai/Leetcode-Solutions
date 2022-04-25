class Solution {
    public int countPalindromicSubsequence(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,int[]> map=new HashMap<>();
        map.put(arr[0],new int[]{0,0});
        for(int i=1;i<s.length();i++){
            if(map.containsKey(arr[i])) map.get(arr[i])[1]=i;
            else map.put(arr[i],new int[]{i,i});
        }
        HashSet<Character> ch_set;
        int ans=0;
        for(char ch:map.keySet()){
            int[] loc=map.get(ch);
            ch_set=new HashSet<>();
            for(int i=loc[0]+1;i<loc[1];i++){
                if(!ch_set.contains(arr[i])) ans+=1;
                ch_set.add(arr[i]);
            }
        }
        return ans;
    }
}