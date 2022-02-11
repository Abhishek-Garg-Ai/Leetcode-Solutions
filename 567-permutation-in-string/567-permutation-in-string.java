class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(Character ch:s1.toCharArray())
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        int p1=0;
        int p2=0;
        while(p2<s1.length())       
            map2.put(s2.charAt(p2),map2.getOrDefault(s2.charAt(p2++),0)+1);
        
        // System.out.println(map1);
        while(p2<s2.length()){
            // System.out.println(map2);
            if(map1.equals(map2)==true) return true;
            map2.put(s2.charAt(p1),map2.get(s2.charAt(p1))-1);
            if(map2.get(s2.charAt(p1))<=0) map2.remove(s2.charAt(p1));
            map2.put(s2.charAt(p2),map2.getOrDefault(s2.charAt(p2),0)+1);
            p1+=1;
            p2+=1;
        }
        if(map1.equals(map2)==true) return true;
        return false;
    }
}