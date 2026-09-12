import java.util.*;

class Solution{
    public static int searchTarget(int N, int[] arr, int X){
        
        for(int i = 0; i<N-1; i++){
            if(arr[i] == X){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        
assert (1 == searchTarget(5,new int[] { 13, 7, 5, 3, 1 },7)) : "Expect 1 for numbers = [13, 7, 5, 3, 1 ] and Value = 7 ";

assert (-1 == searchTarget(5,new int[] { 13, 7, 5, 3, 1 },8)) : "Expect -1 for numbers = [13, 7, 5, 3, 1 ] and Value = 8";


System.out.println("All test cases in main function passed");

    }
}

//Given an array of N distinct integers and a target value X, return 1 if the target is found. If not found then return -1.