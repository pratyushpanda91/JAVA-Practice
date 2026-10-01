public int countDigit(int n) {
        // Edge case
        if (n == 0) return 1;
        
        int count = (int)(Math.log10(n) + 1);
        return count;
    }
  
    class Solution {
    public int countDigit(int n) {
      if(n==0) return 1;
      int count = 0;
      while(n>0){
        n = n/10;
        count++;
      }
      return count;
    }
}

//https://takeuforward.org/practice/dsa/count-all-digits-of-a-number