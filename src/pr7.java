import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {

        System.out.println("Enter decimal First Number");
        Scanner n1 = new Scanner(System.in);
        float num1 = n1.nextFloat();
        System.out.println("Enter decimal Second Number");
        Scanner n2 = new Scanner(System.in);
        float num2 = n2.nextFloat();
        float sum=num1*num2;
        System.out.println("Sum of two Decimal Number is "+ sum);
    }
}