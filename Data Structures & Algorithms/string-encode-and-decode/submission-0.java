class Solution {

    public String encode(List<String> strs) {
        String m = "";
        for(String s : strs)
        m = m + s.length() + "#" + s;
        return m;

    }

    public List<String> decode(String str) {
        List<String> m = new ArrayList<>();
        for(int i = 0;i<str.length();){
            int j = str.indexOf('#',i);
            int l = Integer.parseInt(str.substring(i,j));
            String n = str.substring(j+1,j+1+l);
            m.add(n);
            i = j+1+l;
        }
        return m;


    }
}
