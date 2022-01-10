class Solution {
    public String addBinary(String a, String b) {
        // char[] arr1=a.toCharArray();
        // char[] arr2=b.toCharArray();
        StringBuilder sbr=new StringBuilder();
        int bit1,bit2;
        int carry=0;
        int result;
        int p1=a.length()-1;
        int p2=b.length()-1;
        while(p1>-1 || p2>-1 || carry==1){
            bit1=(p1>-1)?Character.getNumericValue(a.charAt(p1--)):0;
            bit2=(p2>-1)?Character.getNumericValue(b.charAt(p2--)):0;
            result=bit1^bit2^carry;
            carry=(bit1+bit2+carry>=2)?1:0;
            sbr.append(result);
        }
        return sbr.reverse().toString();

    }
    
}