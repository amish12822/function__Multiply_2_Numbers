import java.util.Scanner;

/**
 * multiple_2_no
 */
public class multiple_2_no {


    public static int product(int a, int b){

        return a*b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value = ");int a = sc.nextInt();
        System.out.print("Enter b value = ");int b = sc.nextInt();

        int product_value = product(a, b);

        System.out.println(a + " * " + b + " = " + product_value);
    }
    
}