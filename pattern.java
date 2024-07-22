public class pattern 
{
    public static void main(String[] args) 
    {
        // pattern for increment pyramid
        int i,j;

        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            System.out.println("\n");
        }

        for (i=5;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }    
    }
}
