import java.util.Scanner;
class table1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tn ;
        System.out.println("ENTER NUMBER TO PRINT TABLE :");
        tn = sc.nextInt();

        System.out.println("TABLE OF "+tn);
        for(int i = 01;i <= 10 ; i++)
        {
            System.out.println(tn+"    *    "+i+"      =       "+(i*tn));
        }
    }
}
