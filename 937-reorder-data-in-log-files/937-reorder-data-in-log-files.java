class Solution {
    public String[] reorderLogFiles(String[] logs) {
        String[] result=new String[logs.length];
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] arr1=s1.split(" ",2);
                String[] arr2=s2.split(" ",2);
                int res=arr1[1].compareTo(arr2[1]);
                if(res!=0) return res;
                return arr1[0].compareTo(arr2[0]);
            }
        });
        int curr=logs.length-1;
        for(int i=logs.length-1;i>-1;i--){
            if(Character.isAlphabetic(logs[i].charAt(logs[i].length()-1)))
                pq.add(logs[i]);
            else result[curr--]=logs[i];
        }
        curr=0;
        while(pq.size()>0) result[curr++]=(pq.poll());
        return result;
    }
}