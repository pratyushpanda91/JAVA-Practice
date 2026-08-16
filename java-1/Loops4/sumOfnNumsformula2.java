 package java_junit_problems.NaturalSumJunit;
import java.util.*;
public class Solution {

    public static int naturalSum(int n){
       

        return (n*(n+1))/2;
        
      
    }


    public static void main(String args[]) {
        assert (naturalSum(10) == 55) : "Expect 55 for n = 10";
        System.out.println("All test cases in main function passed");
    }
}

 