class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] map1=new int[26];
        int[] map2=new int[26];
        for(int i=0;i<s1.length();i++){
            map1[s1.charAt(i)-'a']+=1;
            map2[s2.charAt(i)-'a']+=1;
        }
        int p1=0;
        int p2=s1.length();
        
        while(p2<s2.length()){
            if(Arrays.equals(map1,map2)) return true;
            map2[s2.charAt(p1++)-'a']-=1;
            map2[s2.charAt(p2++)-'a']+=1;
        }
        if(Arrays.equals(map1,map2)==true) return true;
        return false;
    }
}