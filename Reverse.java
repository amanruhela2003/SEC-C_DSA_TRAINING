package Programs.Arrays;

public class Reverse {

    static void reverse(int arr[],int n)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+ ",");
        }



    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverse(arr, n);

        // //for Each loop
        // for(int ele:arr)
        // {
        //     System.out.print(ele+ ",");
        // }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");   
        // }

    }
    
}
