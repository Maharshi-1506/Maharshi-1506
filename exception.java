class exception
{
    public static void main(String args[]) 
    {
        try 
        {
            int a = 15/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ANY NUMBER DIVIDED BY ZERO : INFINITY ");
        }
    }
}