class Solution {
    public boolean isValidSudoku(char[][] board) {
        	   
		Map<Integer,List<Character>> rowMap = new HashMap<>();
		Map<Integer,List<Character>> colMap = new HashMap<>();
		Map<String,List<Character>> squareMap = new HashMap<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				char curr = board[i][j];
				String squareKey = i/3 +"-" +j/3;

				if(curr != '.') {
					if(rowMap.getOrDefault(i, new ArrayList<Character>()).contains(curr) ||
							colMap.getOrDefault(j, new ArrayList<Character>()).contains(curr) ||
							squareMap.getOrDefault(squareKey, new ArrayList<Character>()).contains(curr)
							) {
						return false;
						
					} else {
						List<Character> rowList = rowMap.getOrDefault(i, new ArrayList<Character>());
						rowList.add(curr);
						rowMap.put(i, rowList);
						
						List<Character> colList = colMap.getOrDefault(j, new ArrayList<Character>());
						colList.add(curr);
						colMap.put(j, colList);
						
						List<Character> squareList = squareMap.getOrDefault(squareKey, new ArrayList<Character>());
						squareList.add(curr);
						squareMap.put(squareKey, squareList);
					}
				}
			}
		}
		return true;
    }
}
