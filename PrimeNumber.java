public class PrimeNumber {

    public static void main(String[] args) {
        
        int n = 997;
        boolean prime=true;
        int iter=0;
        
        if(n%2==0 || n%3==0){
            prime=false;
        }

        for (int i = 5; i*i < n; i+=6) {
            iter++;
            if(n % i ==0 || n % (i+2)==0)
            {
                prime=false;
                break;
            }
        }

        if(prime)
        {
            System.out.println("Number is prime....");
        }
        else{
            System.out.println("Number is Not Prime....");
        }

        System.out.println("Iteration : "+ iter);
    }
    
}
