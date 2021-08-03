/* KRISHANU DAS
   20BCE2325
   krishjr05@gmail.com */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

 
class Lab1 {
    // Function to return k'th smallest
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // Sort the given array
        Arrays.sort(arr);
 
        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }
 
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] {30,20,10,50,60,4};
        Scanner sc = new Scanner(System.in);  //Scanner for taking the user input.
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}