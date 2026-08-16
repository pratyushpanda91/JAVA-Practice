import java.util.*;

public class Solution {

    public static void main(String args[]) {
        // Write a function which takes firstName and lastName as parameters 
        // and returns fullName and print it on console.
        String fullName = getFullName("Omm", "Panda");
        System.out.println(fullName);
        
        
    }
    public static String getFullName(String firstName, String lastName){
        return firstName + lastName;
    }
}


