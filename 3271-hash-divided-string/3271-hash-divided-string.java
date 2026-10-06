// abcd
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i<s.length();i++){
            sum = sum + (s.charAt(i) - 'a');
            count ++;
        
        if(count == k){
            count = 0;
            sb.append((char)('a' + sum %26));
            sum = 0;

        }
    }
    return sb.toString();
}
}
