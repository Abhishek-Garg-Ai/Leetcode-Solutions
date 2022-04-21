class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq=new PriorityQueue<>((c1,c2)->map.get(c2)-map.get(c1));
        for(char ch:map.keySet()) pq.add(ch);
        StringBuffer sb=new StringBuffer();
        while(pq.size()>0){
            char ch1=pq.poll();
            int count_ch1=map.get(ch1);
            map.put(ch1,count_ch1-1);
            if(count_ch1==1) map.remove(ch1);
            sb.append(ch1);
            if(pq.size()==0 && count_ch1>1) return "";
            if(pq.size()>0){
                char ch2=pq.poll();
                int count_ch2=map.get(ch2);
                if(count_ch1>1) pq.add(ch1);
                map.put(ch2,count_ch2-1);
                if(count_ch2==1) map.remove(ch2);
                else pq.add(ch2);
                sb.append(ch2);
            }
        }
        return sb.toString();    
    }
}