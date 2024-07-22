import java.util.*;
public class linearsearch 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int se;//search element 
        int n;//number of arrays value 
        
        System.out.println("****** ENTER NUMBER OF ELEMENTS YOU WANT TO ST0RE IN ARRAY  ***** ");
        n = sc.nextInt();

        System.out.println("***** YOUR ARRAY ELEMENTS ARE : *****");
        int[] a = new int[10];
        for (int i = 0 ; i < n ; i++ )
        {
            a[i]=sc.nextInt();
        }

        System.out.println("***** YOUR ARRAY ELEMENTS ARE : *****");
        for (int i = 0 ; i < n ; i++ )
        {
            System.out.print( a[i] +"  ");
        }
        System.out.println("");
        System.out.println("********************************************");

        System.out.println("***** ENTER ELEMENT YOU WANT TO SEARCH *****");
        se = sc.nextInt();

        System.out.println("***** YOU SEARCH FOR :" + se + " *****");
        for (int i = 0 ; i < n ; i++)
        {
            if (se == a[i])
            {
                System.out.println("***** ELEMENT FOUND AT INDEX :" +(i+1)+ " *****");
            }
        }
        
    }    
}
