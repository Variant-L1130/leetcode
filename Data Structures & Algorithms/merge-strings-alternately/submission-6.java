class Solution {
    public String mergeAlternately(String word1, String word2) {
        char []c= word1.toCharArray(),x=word2.toCharArray();
        int l=0,r=0;
        StringBuilder b = new StringBuilder();
        while(l<c.length && r<x.length){
            b.append(c[l++]);
            b.append(x[r++]);
        }
        while(l<c.length){
            b.append(c[l++]);
        }
        while(r<x.length){
            b.append(x[r++]);
        }
        return b.toString(); 
    }
}