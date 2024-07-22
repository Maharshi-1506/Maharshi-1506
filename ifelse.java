import java.util.*;
public class ifelse 
{
    public static void main (String args[])
    {
        System.out.println("***** AGE VERIFICATION *****");
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("ENTER YOUR AGE :");
        age = sc.nextInt();

        if (age < 18)
        {
            System.out.println("THIS APPLICATION IS NOT FOR YOU \n AGE REQUIREMENT IS = [18].");
        }
        else 
        {
            System.out.println("##### YOUR WELCOME ##### \n  ");
        }
    }    
}
