import java.util.Scanner;
public class addition
    {  
    public static void main(String args[])  
        {  
            int a, b, c;  
            Scanner sc = new Scanner(System.in);  
            System.out.print("ENTER 1ST NUMBER: ");  
            a = sc.nextInt();  
            System.out.print("ENTER 2ND NUMBER: ");  
            b = sc.nextInt();  
            c = sum(a,b);  
            System.out.println("ADDITION: " + c);  
        }  
   
    public static int sum(int a, int b)  
        {  
            int Z;
            Z= a + b;  
            return Z;  
        }  
    }  