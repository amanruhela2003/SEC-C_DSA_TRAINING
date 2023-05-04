public class PowerOf2 {

    public static void main(String[] args) {
        int num=1023;

        if((num & (num-1))==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
