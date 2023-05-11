package Array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    static void removeDuplicate(int arr[],int n)
    {
        //sort the array
        Arrays.sort(arr);
        //index for new array
        int j=0;

        //for first n-1 elements
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        //Last Element
        arr[j++]=arr[n-1];

        //Traverse the array
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ,");
            
        }
    }

    public static void main(String[] args) {
        int arr[]={5,1,6,7,4,9,9,9,9,5,6,1,7,7};
        int n=arr.length;
        removeDuplicate(arr, n);
        
        
    }
    
}
