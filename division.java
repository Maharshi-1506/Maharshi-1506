import java.util.*;
class division 
{
    public static void main(String args[]) 
    {
        int n1 , n2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER N1:");
        n1 = sc.nextInt();
        System.out.println("FOR N1 :");
        logic (n1);
        System.out.println("ENTER 2ND NUMBER N2:");
        n2 = sc.nextInt();
        System.out.println("FOR N1 :");
        logic (n2);
        System.out.println("FOR BOTH N1 & N2:");
        logic1(n1,n2);
    }   

    static int logic(int a)
    {
        for (int i = 1 ; i <= 100 ; i++ )
        {
            if(i%a==0)
            {
                System.out.print(i+"    ");
            }   
        }
        System.out.println();
        return 0 ;
    }
    static int logic1(int x,int y)
    {
        for(int i = 1 ; i <= 100 ; i++ )
        {
            if(i%x==0 && i%y==0)
            {
                System.out.print(i+"    ");
            }
        }
        System.out.println();
        return 0 ;
    }
}
