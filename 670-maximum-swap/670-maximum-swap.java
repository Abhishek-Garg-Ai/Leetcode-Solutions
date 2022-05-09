class Solution {
    public int maximumSwap(int num) {
        char[] str=String.valueOf(num).toCharArray();
        int i=1;
        while(i<str.length && str[i]<=str[i-1]) i+=1;
        if(i==str.length) return num;
        int j=i-1;
        int m=i;
        while(i<str.length) {
            if(str[i] >= str[m])
                m = i;
            i++;
        }
        while(j>=0 && str[j]<str[m]) j-=1;
        j+=1;
        // String rets = str.substring(0, j) + str.charAt(m) + str.substring(j+1, m) + str.charAt(j) + str.substring(m+1);
        char temp=str[j];
        str[j]=str[m];
        str[m]=temp;
        return Integer.parseInt(String.valueOf(str));
            
    }
}