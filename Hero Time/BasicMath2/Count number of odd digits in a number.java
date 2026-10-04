class Solution {
    public int countOddDigit(int n) {
        int count = 0;
       while(n>0){
        int lastDigit = n %10;
        if(lastDigit%2 == 1) count++;
        n=n/10;
       } 
       return count;
    }
    public static void main(String[] args) {
        int n = 6678;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution(); 
        
        // Function call to get count of odd digits in n
        int ans = sol.countOddDigit(n);
        System.out.println("The count of odd digits in the given number is: " + ans);
    }
}