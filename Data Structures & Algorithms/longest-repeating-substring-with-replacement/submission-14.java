class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> m = new HashMap<>();
        char [] a = s.toCharArray();
        int b = 0,c=0,v=0,x=0;
        for(int i=0;i<a.length;i++){       
        char z= a[i];
        m.put(z,m.getOrDefault(z,0)+1);
        v = Math.max(v,m.get(z));
        x = i- b+1;
        if(x-v>k){
            char p = a[b];
            m.put(p,m.get(p)-1);
            b++;
            }
            c = Math.max(c,i-b+1);
        }
        return c;
    }
}
