class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String word:words) map.put(word,map.getOrDefault(word,0)+1);
        PriorityQueue<String> heap=new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String word1, String word2){
                if(map.get(word1)==map.get(word2)) return word2.compareTo(word1);
                return map.get(word1)-map.get(word2);
            }
        });
        for(String key:map.keySet()){
            heap.add(key);
            if(heap.size()>k) heap.poll();
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<k;i+=1) result.add(heap.poll());
        Collections.reverse(result);
        return result;
    }   
}
