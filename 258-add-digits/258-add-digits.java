class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int temp=num;
        int s=0;
        while(temp>0){
            s+=temp%10;
            temp/=10;
        }
        return addDigits(s);
        
    }
}