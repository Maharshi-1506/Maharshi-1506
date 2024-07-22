class gcmethod 
{
    public static void main (String args[])
    {
        gcmethod gm1 = new gcmethod();
        gcmethod gm2 = new gcmethod();
        new gcmethod();
        gm1 = gm2;
        System.gc();
    }    
    protected void Finalize()
    {
        System.out.println("----------GARDAGE CLEAN HERE----------");
    }
}
