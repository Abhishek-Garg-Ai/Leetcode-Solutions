class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lt=new ArrayList<>();
        if(s.length()<p.length()) return lt;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        int p1=0;
        int p2=p.length();
        while(p2<s.length()){
            // System.out.println(map1+" "+ map2);
            if(map1.equals(map2)) lt.add(p1);
            map2.put(s.charAt(p1),map2.get(s.charAt(p1))-1);
            map2.put(s.charAt(p2),map2.getOrDefault(s.charAt(p2),0)+1);
            if(map2.get(s.charAt(p1))<1) map2.remove(s.charAt(p1));
            p1++;
            p2++;
        }
        if(map1.equals(map2)) lt.add(p1);
        // System.out.println(map);
        return lt;
    }
}