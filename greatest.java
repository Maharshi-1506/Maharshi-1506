import java.util.Scanner;
class greatest 
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF 1ST NUMBER");
         a = sc.nextInt();
        System.out.println("ENTER VALUE OF 2ND NUMBER");
         b = sc.nextInt();
        System.out.println("ENTER VALUE OF 3RD NUMBER");
         c = sc.nextInt();  

            if ((a>b) && (a>c))
            {
                System.out.print("GREATEST NO ::::: "+ a);
            }
            else if ((b>c) && (b>a))
            {
                System.out.print("GREATEST NO ::::: "+ b);
            }
            else
            {
                System.out.print("GREATEST NO ::::: "+ c);
            }
    }
}
