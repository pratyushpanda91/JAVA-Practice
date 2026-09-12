import java.util.*;

public class Solution {

    static int smallestValueInArray(int[] numbers) {
        int ans = numbers[0];
        for(int i = 0; i<= numbers.length-1; i++){
            if(ans > numbers[i])
            ans = numbers[i];   
        }
        return ans;
    }

    public static void main(String args[]) {
        assert (1 == smallestValueInArray(new int[] { 4, 2, 3, 1, 5 })) : "Expect 1 for numbers = [4, 2, 3, 1, 5] ";
        assert (2 == smallestValueInArray(new int[] { 4, 2, 3, 5 })) : "Expect 2 for numbers = [4, 2, 3, 5] ";
        System.out.println("All test cases in main function passed");

    }
}

//Write a function that can return the smallest value of an array.

