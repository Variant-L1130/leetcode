class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> m =  new HashMap<>();
        for(char b : s1.toCharArray()){
            m.put(b,m.getOrDefault(b,0)+1);
        }
        HashMap<Character,Integer> n = new HashMap<>();
        char []s=  s1.toCharArray();
        char []a=  s2.toCharArray();
        if(s.length>a.length){
            return false;
        }
        else{
        for(int i = 0;i<s.length;i++){
            char c = a[i];
            n.put(c,n.getOrDefault(c,0)+1);
        }
         if(n.equals(m)){
                return true;
         }
         for(int i = s.length;i<a.length;i++){

            char e = a[i];
            n.put(e,n.getOrDefault(e,0)+1);
            
            char l = a[i-s.length];
            n.put(l,n.get(l)-1);
            if(n.get(l)==0){
                n.remove(l);
            }
        if(n.equals(m)){
            return true;
            }
         }
        }
        return false;
    }
}
