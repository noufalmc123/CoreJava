import java.util.Scanner;
public class Swap {
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a=sc.nextInt();
        System.out.println("Enter The Second Number");
        int b=sc.nextInt();
        System.out.println("Before Swapping A= "+a+" B= "+b);
        int TEMP=a;
        a=b;
        b=TEMP;
        System.out.println("After Swapping A= "+a+" B= "+b);
    }
}

