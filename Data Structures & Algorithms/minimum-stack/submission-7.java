class MinStack {
    Stack<Integer> s= new Stack <>();
    Stack<Integer> m = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(val);
            m.push(val);
        } 
        else{
            int n = Math.min(val,m.peek());
            s.push(val);
            m.push(n);
        }
        
    }
    
    public void pop() {
        s.pop();
        m.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return m.peek();
        
    }
}
