class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] r = new HashSet[9];
        HashSet<Character>[] c = new HashSet[9];
        HashSet<Character>[] b = new HashSet[9];

        for(int i  = 0;i<9;i++){
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            b[i] = new HashSet<>();
        }

        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                int s = (i/3) * 3 + (j/3);
                if (board[i][j]=='.') continue;
                char a = board [i][j];
                if(r[i].contains(a)||c[j].contains(a)||b[s].contains(a)){
                    return false;
                }
                    r[i].add(a);
                    c[j].add(a);
                    b[s].add(a);
            }
        }
        return true;
            
        
        
    }
}
