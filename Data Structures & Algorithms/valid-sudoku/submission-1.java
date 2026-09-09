class Solution {
    public boolean isValidSudoku(char[][] board) {
        		Map<Integer,List<Character>> rowMap = new HashMap<>();
		Map<Integer,List<Character>> colMap = new HashMap<>();
		Map<String,List<Character>> squareMap = new HashMap<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				
				String squareKey = i/3 +"-" +j/3;
				
				if(board[i][j] != '.') {
					if(rowMap.computeIfAbsent(i,k -> new ArrayList<Character>()).contains(board[i][j]) ||
							colMap.computeIfAbsent(j, k -> new ArrayList<Character>()).contains(board[i][j]) ||
							squareMap.computeIfAbsent(squareKey, k -> new ArrayList<Character>()).contains(board[i][j])
							) {
						return false;
						
					} else {
						
						rowMap.get(i).add(board[i][j]);
						colMap.get(j).add(board[i][j]);
						squareMap.get(squareKey).add(board[i][j]);
					}
				}
			}
		}
		return true;
    }
}
