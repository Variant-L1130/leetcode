class TimeMap {
     HashMap<String,List<Pair<String,Integer>>> m;
    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
       if(!m.containsKey(key)){
        m.put(key,new ArrayList<>());
       }
        m.get(key).add(new Pair(value,timestamp));
        
    }
    
    public String get(String key, int timestamp) {
         String res = "";
         if(m.containsKey(key)){
            List<Pair<String,Integer>> t = m.get(key);
            int  l =0,r=t.size()-1;
            while(l<=r){
                int m = (l+r)/2;
                if(t.get(m).getValue()<=timestamp){
                    res = t.get(m).getKey();
                    l = m+1;
                }else{
                    r=m-1;
                }
            }
         }
        return res;
    }
}
