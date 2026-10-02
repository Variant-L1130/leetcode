class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(char c : t.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> n = new HashMap<>();
        char [] q = s.toCharArray();
        char [] p = t.toCharArray();
        int r = m.size();
        int f = 0,l=0,minlen=Integer.MAX_VALUE,minleft=0;
        for(int i = 0;i<q.length;i++){
            char x = q[i];

            n.put(x,n.getOrDefault(x,0)+1);
            if(m.containsKey(x) && n.get(x).equals(m.get(x))){
                f++;
            }
            while(f==r){
                int ws = i-l+1;
                if(ws<minlen){
                    minlen = ws;
                    minleft=l;
                }
                char left = q[l];
                n.put(left,n.get(left)-1);
                if(m.containsKey(left) && n.get(left)<m.get(left)){
                    f--;
                }
                l++;
            }
        }
        if(minlen == Integer.MAX_VALUE) return "";
        return s.substring(minleft,minleft+minlen);
    }
}
