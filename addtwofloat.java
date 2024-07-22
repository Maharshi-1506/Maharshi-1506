import java.util.Scanner;
public class additi 
{
    public float add(float num1 , float num2 )
    {
        return num1 + num2 ;
    }
    public void addi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST FLOAT NUMBER :");
        float num1 = sc.nextFloat();
        System.out.println("ENTER THE SECOND FLOAT NUMBER :");
        float num2 = sc.nextFloat();
        float sum = add (num1,num2);
        System.out.println("SUM OF "+num1+"AND"+num2+"is"+sum);
        sc.close();
    }
}
public class addtwofloat 
{

    /**
     * @param args
     */
    public static void main(String args[])
    {
        float additi f = new float additi();
        f.addi();
    }
}
