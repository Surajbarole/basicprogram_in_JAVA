import java.util.Scanner;

public class pr3 {
    //Take tw0 number by the user and giver sum of them;
    public static void main(String[] args) {
        System.out.println("Enter Your First Number");
        Scanner n1=new Scanner(System.in);
        int num1= n1.nextInt();
        System.out.println("Enter Your Second Number");
        Scanner n2=new Scanner(System.in);
        int num2= n2.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two Number are "+ sum);

    }
}
