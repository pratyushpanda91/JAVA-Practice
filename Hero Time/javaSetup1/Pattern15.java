class Solution {
    public void pattern15(int n) {
        for(int i = 1;i<=n;i++){
            char q='A';
            for(int j = n-i+1;j>=1;j--){
                System.out.print(q);
                q++;
            }
        System.out.println();
        }
    }
}