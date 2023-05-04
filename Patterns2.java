package basic1;



public class Patterns2 {

    public static void main(String[] args) {
        
        int n=3;//no of rows

        //Patterns 5
        int m=2*n;//total no of rows in given pattern
        //outer loop
        for (int i = 0; i <=m; i++) {
            //inner loop

            for (int j = 0; j <=m; j++) {
                int value=n-Math.min(Math.min(i, j), Math.min(m-i, m-j))+1;
                System.out.print(value+ " ");
                
            }
            //next line jump
            System.out.println();
            
        }
    }
    
}
