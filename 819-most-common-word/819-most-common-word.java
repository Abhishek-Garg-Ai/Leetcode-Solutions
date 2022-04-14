class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords=new HashSet<>();
        for(String word: banned) bannedWords.add(word);
        HashMap<String,Integer> map=new HashMap<>();
        for(String word: paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){
            if(!bannedWords.contains(word)){
                int count=map.getOrDefault(word,0)+1;
                map.put(word,count);
                
            } 
        }
        String max_word="";
        for(String key: map.keySet()){
            if(max_word.equals("") || map.get(key)>map.get(max_word)){
                max_word=key;
            }
        }
        return max_word;
    }
}