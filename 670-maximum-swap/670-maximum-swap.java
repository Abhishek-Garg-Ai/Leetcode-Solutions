class Solution {
    public int maximumSwap(int num) {
        String str=String.valueOf(num);
        int i=1;
        while(i<str.length() && str.charAt(i)<=str.charAt(i-1)) i+=1;
        if(i==str.length()) return num;
        int j=i-1;
        int m=i;
        while(i<str.length()) {
            if(str.charAt(i) >= str.charAt(m))
                m = i;
            i++;
        }
        while(j>=0 && str.charAt(j)<str.charAt(m)) j-=1;
        j+=1;
        String rets = str.substring(0, j) + str.charAt(m) + str.substring(j+1, m) + str.charAt(j) + str.substring(m+1);
        return Integer.parseInt(rets);
            
    }
}