class Solution {
    public boolean isPalindrome(int x) {
        int r;
        int temp = x;
        int sum = 0;
        while(x > 0){
            r = x % 10;
            sum = (sum * 10) + r;
            x/=10;
        }
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
}