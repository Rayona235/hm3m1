public class Main {
    public static void main(String[] args) {
        
        double[] numbers = {18.8, -9.7, -2.1, 14.0, 15.0, -33.1, -10.9, 6.5, -23.4, -1.0, 14.9, -7.3, 11.0, 5.2, 3.0,};
        boolean numbers2 = false;
        double num1  = 0 ;
        int num2 = 0;



        for ( double num: numbers ) {
            if (num < 0) {
                numbers2 = true;
            }
            if (numbers2) {
                if (num > 0) {
                    num1 = num1 + num;
                    num2++;


                }
            }
        }
           double num3 = num1 / num2;
            System.out.println(num3 );

    }
}
