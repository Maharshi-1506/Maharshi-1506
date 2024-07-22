public class multiIN 
{
    public static void main(String args[])
    {
        ghi z = new ghi();
    }
}
class abc    // superclass 
{
    abc ()
    {
        System.out.println("APPLE");
    }
}
            class def extends abc     //child of superclass(subclass)
            {
                def ()
                {
                    System.out.println("GRAPES ");
                }
            }
                            class ghi extends def     //child of subclass
                            {
                                ghi ()
                                {
                                System.out.println("BANANA ");
                                }
                            }
            

