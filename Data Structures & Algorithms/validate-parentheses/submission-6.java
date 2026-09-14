class Solution {
    public boolean isValid(String s) {

	        Stack<Character> temp = new Stack<>();
	        if(s.length() %2 !=0) {
	            return false;
	        }
	        for(char c : s.toCharArray()) {
	            
	            switch (c) {
	                case '(','{','[' : 
	                    temp.push(c);
	                    break;

	                case ')' :
	                	 if(!temp.isEmpty() && temp.peek() == '(') {
	                       temp.pop();
	                	 }  else {
                                return false;
                             }
	                     break;
	                case '}' :
	                	if(!temp.isEmpty() && temp.peek() == '{') {
	                       temp.pop();
	                	 }  else {
                                return false;
                             }
	                     break;
	                case ']' :
	                	if(!temp.isEmpty() && temp.peek() == '[') {
	                       temp.pop();
	                	 }  else {
                                return false;
                             }
	                     break;
	                default : 
	                    return false;
	            }
	        }
	        if(temp.isEmpty()) {
	            return true;
	        }
	        return false;
    }


}
