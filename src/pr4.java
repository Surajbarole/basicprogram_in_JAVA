import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        System.out.println("Enter Your First Number");
        Scanner n1=new Scanner(System.in);
        int num1= n1.nextInt();
        System.out.println("Enter Your second Number");
        Scanner n2=new Scanner(System.in);
        int num2= n2.nextInt();
        int Divisor=num1/num2;
        int dividend=num1%num2;
        System.out.println("Divisor will be "+ Divisor);
        System.out.println("dividend will be "+ dividend);
    }
}
