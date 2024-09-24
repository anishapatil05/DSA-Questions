// GetBit
import java.util.*;
public class Bitmaniplucation {
    public static void main(String[] args) {
        int n = 5;
        int position=2;
        int bitmask=1<<position;

        if((bitmask & n) == 0)
        {
            System.out.println("the bit was zero");
        }
        else{
            System.out.println("the bit was one");
        }
    }
}
