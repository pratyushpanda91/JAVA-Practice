public class Solution{
    public static void man(String args[]){
        int myInt1 = 10;
        double myDouble1 = myInt1;
        system.out.println(myDouble1);//widening typecasting 10.0

        double myDouble2 = 10.5d;
        int myInt2 = (int)myDouble2;// narrowing typecasting 10
    }
}