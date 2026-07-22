class Solution {
    public boolean isPalindrome(String s) {
       String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0,j=res.length()-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
            
        }
        return true;
    }
}
