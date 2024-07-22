import java.util.*;
public class stringlength 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("ENTER STRING:");
        str = sc.nextLine();

        int count = 0 ;
        for (int i = 0 ; i<str.length(); i++)
        {
            count++;
        }
        
        System.out.println("LENGHT OF GIVEN STRING : "+count);
    }
}
