public class ReverseNumber {

    public static void main(String[] args) {
        int num=1234;//Input
        int rev=0;//Output
        while(num>0)
        {
            int rem=num %10;//4,3,2,1
            rev=rev*10+rem;//4,43,432,4321
            num=num/10;//123,12,1,0
        }
        System.out.println(rev);
    }
    
}
