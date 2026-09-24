class Solution {
    public void pattern14(int n) {
        for(int i = 1;i<=n;i++){
            char q='A';
            for(int j = 1;j<=i;j++){
                System.out.print(q);
                q++;
            }
        System.out.println();
        }
    }
}