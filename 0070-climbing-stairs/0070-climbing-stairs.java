class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int firstStep = 1;
        int secondStep = 2;
        for(int i=3;i<=n;i++){
            int temp = secondStep;
            secondStep += firstStep;
            firstStep = temp;
        }
        return secondStep;
    }
}