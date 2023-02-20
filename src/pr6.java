public class pr6 {
    public static void main(String[] args) {
        int a=45;
        int b=2;
        System.out.println("Before "+a +" and "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After "+a +" and "+b);

    }
}
