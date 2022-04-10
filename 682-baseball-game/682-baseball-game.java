class Solution {
    public int calPoints(String[] ops) {
        int[] score=new int[ops.length];
        int curr=0;
        for(String op:ops){
            if(op.equals("+")) score[curr]=score[curr-1]+score[curr-2];
            else if(op.equals("D")) score[curr]=2*score[curr-1];
            else if(op.equals("C")){
                score[curr-1]=0;
                curr-=2;
            }
            else score[curr]=Integer.valueOf(op);
            curr+=1;
        }
        int s=0;
        for(int i=0;i<curr;i++) s+=score[i];
        return s;
    }
}