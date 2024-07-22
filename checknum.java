import java.util.Scanner;
public class checknum
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("ENETER NUMBER TO CHECH PRIME OR NOT :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if ( a>0 ) 
        {
            System.out.println("NUMBER IS POSITIVE");

        }
        else if ( a<0 )
        {
            System.out.println("NUMBER IS NEGATIVE");
        }
        else 
        {
            System.out.println("NUMBER IS 0");
        }
    }
}
