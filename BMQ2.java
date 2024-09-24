// Write a program to toggle a bit a position = “pos” in a number “n”. 
import java.util.*;
public class BMQ2 {
    public static void main(String[] args) {
        int n=42;
        int position= 1;
        int Bitmask = 1<<position;
        int result = n ^ Bitmask;

        System.out.println("original number is: "+n);
        System.out.println("bitmask is: "+Bitmask);
        System.out.println("the result is: "+result);
     
    }
    

}
