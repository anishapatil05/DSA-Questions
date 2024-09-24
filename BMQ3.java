// Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;
public class BMQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        int x=n & n-1;

        while(x!=0)
        {
            count++;
            x= x&x-1;
        }
        System.out.println(count);
    }
}