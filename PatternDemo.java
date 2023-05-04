

public class PatternDemo {

    public static void main(String[] args) {
        // System.out.println("Hello World!!");



        // ******

        // System.out.println("*****");

        // ******
        // ******
        // ******
        // ******
        // ******

        int n=5;

        for (int i = 1; i <=n; i++) {
            // System.out.print("*");
            for (int j = 1; j<=i; j++) {
            
                // System.out.print("*");
                if(j%2!=0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
            
        }



    }
    
}
