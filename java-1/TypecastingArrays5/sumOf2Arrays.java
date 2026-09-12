import java.util.*;

class Solution{
    public static int sumOfTwoArrays(int[] arr1, int[] arr2){
        int sum = 0;
        for(int i = 0; i<= arr1.length-1;i++){
            sum = sum + arr1[i];
        }
        for(int i = 0; i<= arr2.length-1;i++){
            sum = sum + arr2[i];
        }
        return sum;
    }
    public static void main(String[] args){
        
assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";

System.out.println("All test cases in main function passed");


    }
}

