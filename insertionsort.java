import java.util.*;
public class insertionsort {
    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {

        int arr[]={3,5,4,1,6};
        // insertion sort
    // unsorted part
    for(int i=0; i<arr.length; i++)
    {
        int current = arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j] )
        {
            arr[j+1]=arr[j];
            j--;
        }

        // placement
        arr[j+1]=current;

    }
    printArray(arr);
     }
    
}
