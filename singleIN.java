public class singleIN
{
    public static void main (String args[])
    {
        child p = new child();
        p.happy();
        p.sad();
    }
}
class parent
{
    void happy ()
    {
        System.out.println("I AM NOT HAPPY TODAY");
    }
}
class child extends parent 
{
    void sad()
    {
        System.out.println("I AM NOT SAD TODAY");
    }
}


