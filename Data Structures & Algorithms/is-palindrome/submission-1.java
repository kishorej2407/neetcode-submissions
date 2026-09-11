class Solution {
    public boolean isPalindrome(String s) {

        int i =0,j=s.length() -1;
        while(i <= j) {
            if(!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isAlphanumeric(s.charAt(j))) {
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

    private boolean isAlphanumeric(char ch) {
    return (ch >= 'a' && ch <= 'z') || 
           (ch >= 'A' && ch <= 'Z') || 
           (ch >= '0' && ch <= '9');
}
}
