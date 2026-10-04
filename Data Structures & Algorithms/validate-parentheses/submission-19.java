class Solution {
    public boolean isValid(String s) {
        Stack<Character> m = new Stack<>();
        char []a = s.toCharArray();
        for (int i=0;i<a.length;i++){
            if(a[i] == '[' ||a[i] == '{' ||a[i] == '('){
                m.push(a[i]);
            }
            else{
                if(a[i]==0){
                    return false;
                }
                if(!m.isEmpty() && (m.peek()=='(' && a[i]==')'||m.peek()=='{' && a[i]=='}'||m.peek()=='[' && a[i]==']')){
                    m.pop();
                }
                else{
                    return false;
                }
            }
        }
    return m.isEmpty();

    }
}
