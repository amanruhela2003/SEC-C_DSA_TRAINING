package Array;

public class RotateArray {

    static void printRotateByK(int arr[],int n,int k)
    {
        // int j=0;
        int temp[]=new int[n];
        for (int i = 0; i < n; i++) {
            temp[i]=arr[(i+k)%n];
            
        }
        // while(j<n)
        // {
        //     arr[j++]=0;
        // }
        for (int l = 0; l < arr.length; l++) {
         System.out.print(temp[l]+ " ");   
        }

    }

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=2;//3,4,5,0,0
        printRotateByK(arr,n,k);
    }
    
}
