import java.util.Scanner;
class reverse3 
{
    public static void main (String args[])
    {
        int num , rem ;
        int rev = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER NUMBER TO REVERSE : ");
        num = sc.nextInt();
        
            for (;num != 0;num = num/10)
            {
                rem = num % 10;
                rev = rev * 10 + rem;
            }
        
        System.out.print("REVERSE NUMBER IS :" + rev);

    }
}
