class Solution {
    public int climbStairs(int n) {
        int n1=1;
        int n2=1;
        for(int i=2;i<=n;i++){
            int value=n1+n2;
            n1=n2;
            n2=value;
            
        }
        return n2;
     }
}