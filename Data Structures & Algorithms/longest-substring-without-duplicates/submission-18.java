class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> p = new HashSet<>();
        int l = 0 ,m=0;
        char [] a =  s.toCharArray();
        for(int i=0;i<a.length;i++){
            char b = a[i];
            while(p.contains(b)){
                p.remove(a[l]);
                l++;
            }
            p.add(b);
            m = Math.max(m,(i-l+1));
        }
        return m;
        
    }
}