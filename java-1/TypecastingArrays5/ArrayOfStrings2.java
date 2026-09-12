import java.util.*;

public class Solution {

    public static void main(String args[]) {
        // Creating an array
        String[] products1 = {"Pen", "Pencil", "Book", "Paper", "Toothbrush"};
        String[] products = new String[5];
        products[0] = "Pen";
        products[1] = "Pencil";
        products[2] = "Book";
        products[3] = "Paper";
        products[4] = "Toothbrush";
        System.out.println(products[0]);//pen
        //printing all elements
        int n = products.length;
        for(int i = 0; i<=n-1; i++){
            System.out.println(products[i]);
        }

        // Length of an array
        System.out.println(products.length);//5
    }
}