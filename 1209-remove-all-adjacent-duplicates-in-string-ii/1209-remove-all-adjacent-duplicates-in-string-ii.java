class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> cha=new Stack<>();
        Stack<Integer> inte=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!cha.empty()){
                if(cha.peek()==ch){
                    inte.push(inte.peek()+1);
                }
                else{
                    inte.push(1);
                }
                cha.push(ch);
            }
            else{
                cha.push(ch);
                inte.push(1);
            }
             if(inte.peek()==k){
                    for(int i=0;i<k;i++){
                        cha.pop();
                        inte.pop();
                    }
                }
        }
       StringBuilder ans=new StringBuilder();
        while(!cha.empty()){
            ans.append(cha.pop());
        }
        return ans.reverse().toString();
    }
}