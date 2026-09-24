class Solution {
    public void pattern18(int n) {
        char q=(char)('A'+ n-1);
        for(int i = 1;i<=n;i++){
            char ch = q;
            for(int j =1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
             q--;
        System.out.println();
        }
    }
}