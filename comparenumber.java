import java.util.Scanner;
class comparenumber
{
    public static void main(String args[])
    {
        int fn , sn ;
        Scanner sc = new Scanner(System.in);
        System.out.println("THIS PROGRAM SHOW COMPARISON OF TWO NUMBER");
        System.out.println("ENTER FIRST NUMBER :");
        fn = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER :");
        sn = sc.nextInt();
        if(fn == sn)
        {
            System.out.println(fn+"   ==   "+sn);
        }
        if(fn != sn)
        {
            System.out.println(fn+"   !=   "+sn);
        }
        if(fn <= sn)
        {
            System.out.println(fn+"   <=   "+sn);
        }
        if(fn >= sn)
        {
            System.out.println(fn+"   >=   "+sn);
        }
        if(fn < sn)
        {
            System.out.println(fn+"   <   "+sn);
        }
        if(fn > sn)
        {
            System.out.println(fn+"   >   "+sn);
        }
    }    
}
