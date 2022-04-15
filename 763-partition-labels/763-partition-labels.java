class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last_index=new int[26];
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            last_index[s.charAt(i)-'a']=i;
        int curr_i=0;
        int curr_max=0;
        int curr_start=0;
        // System.out.println(Arrays.toString(last_index));
        while(curr_i<s.length()){
            curr_max=Math.max(curr_max,last_index[s.charAt(curr_i)-'a']);                     if(curr_max==curr_i){
                result.add(curr_i-curr_start+1);
                curr_start=curr_i+1;
                curr_max=0;
            }
            curr_i+=1;
        }
        return result;
    }
}