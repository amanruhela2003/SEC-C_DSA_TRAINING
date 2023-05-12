

public class MissingNumber {

    static void missing(int arr[],int n){
        int sum=0;//sum=n(n+1)/2
        int m=n+1;
        sum=(m*(m+1))/2;
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum=sum-arr[i];
        }
        
        System.out.println("Missing Number: "+ sum);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=arr.length;
        missing(arr,n);
    }
    
}
