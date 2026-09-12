//Given an array of strings, return another array with the strings in reverse order.

import java.util.*;

public class Solution {

    static String[] reverseArray(String[] s) {
        String[] output = new String[s.length];
        int index = 0;
        for(int i= s.length-1; i>=0; i--){
            output[index] = s[i];
            index++;
        }
        return output;
    }

    public static void main(String args[]) {
        assert (Arrays.equals(reverseArray(new String[] { "Why", "this", "kolaveridi?" }),
                new String[] { "kolaveridi?", "this", "Why" })) : "Expect {\"kolaveridi?\",\"this\",\"Why\"} for s={\"Why\",\"this\",\"kolaveridi?\"}";
      System.out.println("All test cases in main function passed");
    }
}

