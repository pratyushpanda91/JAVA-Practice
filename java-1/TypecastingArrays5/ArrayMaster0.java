import java.util.*;

public class Solution {

    public static void main(String args[]) {

        // 1. Creating an array
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 11;
        arr[2] = 9;
        arr[3] = 20;
        arr[4] = 2;

        // 2. Finding the length of an array
        System.out.println("Length of array: " + arr.length);

        // 3. Inserting values into the array
        int[] arr1 = {5, 11, 9, 20, 2, 3};
        System.out.println("Array elements: " + Arrays.toString(arr));

        // 4. Searching for a specific value
        int searchValue = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(searchValue + " found at index: " + index);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        // 5. Sorting the array
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

// Write a Java program that performs the following array operations:

// Create an array of integers with a fixed size (e.g., 5 elements).

// Find the length of the array and print it to the console.

// Insert values into the array using int[] arr = {5, 11, 9, 20, 2, 3};.

// Search for a specific value in the array and print its index if found. If the value is not found, print an appropriate message.

// Sort the array using Java's built-in Arrays.sort() method, and print the sorted array.