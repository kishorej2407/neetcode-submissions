class Solution {
    public boolean isPalindrome(String s) {

        int i =0,j=s.length() -1;
        while(i <= j) {
            if(!Character.isLetter(s.charAt(i)) &&   !Character.isDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetter(s.charAt(j)) &&   !Character.isDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) == 
            Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }

        }
       return true; 
    }
}
