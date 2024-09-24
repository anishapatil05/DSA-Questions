//  to ﬁnd if a number is a power of 2 or not.
import java.util.*;
public class BMQ1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
     int power = num & num-1;
    if(power == 0 )
    {
        System.out.println("the power of 2");
    }
    else{
        System.out.println("not apower of 2");
    }
    
 }   
}
