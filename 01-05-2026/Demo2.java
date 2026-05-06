public class Demo2 {
    
    public static void main(String[] args) {
       int num [] []  = new  int [3] [];

       num [0] = new int [2];
         num [1] = new int [3];
            num [2] = new int [4];

            for( int [] x : num) {
                for(int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
    }
}
