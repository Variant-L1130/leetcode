class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String a : tokens){
            if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")){
                int f = s.pop();
                int b = s.pop();
                if(a.equals("+")){
                    s.push(f+b);
                }
                else if(a.equals("-")){
                    s.push(b-f);
                }
                else if(a.equals("*")){
                    s.push(f*b);
                }
                else if(a.equals("/")){
                    s.push(b/f);
                }
            }
                else {
                    s.push(Integer.parseInt(a));
                }
        }
        return s.pop();

    }
}