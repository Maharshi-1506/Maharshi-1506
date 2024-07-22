import java.util.Scanner;
public class inheritance 
{
    public static void main(String args[])
    {
        student s1 = new student();
        s1.stud();
    }
}
class student
{
    void stud()
    {
    int i ;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER NUMBER OF SUBJETCS YOU WANT TO ENTER :" );
    i = sc.nextInt();

    for (int n = 1 ; n != i ; n++)
    {
        String[] name = new String[sc.nextInt()];
        System.out.println("ENTER NAME OF SUBJECT ");
        name [n] = sc.nextLine();
        int[] mark = new int[sc.nextInt()];
        System.out.println("ENTER MARKS OF SUBJECT ");
        mark [n] = sc.nextInt();
    }
    }
}
class test extends student
{
    int total()
    {
        int x;
        for 
    }
}