import java.util.*;

public class Solution {

    public static int remainderOfDivision(int a, int b) {
        int result = a % b;
        return result;
    }

    public static void main(String args[]) {
        assert (remainderOfDivision(10, 3) == 1) : "Expect 1 for a = 10, b = 3";
        System.out.println("All test cases in main function passed");

    }
}

