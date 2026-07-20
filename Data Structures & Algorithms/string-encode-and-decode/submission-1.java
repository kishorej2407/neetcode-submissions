class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();

        for(String s : strs) {
            int len = s.length();
            output.append(len).append("#").append(s);
        }

        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int p =0;
        while(p < str.length()) {
            int dIndex = str.indexOf('#',p);
            int len = Integer.parseInt(
                str.substring(p,dIndex));
            String obj = str.substring(dIndex+1, dIndex+len+1);
            output.add(obj);
            p = dIndex+len+1;
        }

        return output;
    }
}
