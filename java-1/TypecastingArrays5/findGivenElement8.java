import java.util.*;

public class Solution {

    static int findElement(int N, int[] arr, int x) {

        for (int i = 0; i < N; i++) {

            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int[] arr = {1, 3, 4, 2, 1};

        assert (findElement(5, arr, 1) == 0)
            : "Expect 0 for n = 5, x = 1 and arr = [1,3,4,2,1]";

        System.out.println("All test cases in main function passed");
    }
}

//Create a function findElement() that

// Accepts three integer arguments

// N, representing the number of elements

// array, arr

// a value, x

// Returns the index of the value x in the array, arr

// If there are multiple occurrences then find the leftmost one

// if x is not present return -1.