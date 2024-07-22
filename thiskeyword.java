class thiskeyword 
{
    int i ;
    void abc(int i)
    {
        this.i = i;
    }
    void print()
    {
        System.out.println(i);
    }
    public static void main (String args[])
    {
        thiskeyword tk = new thiskeyword();
        tk.abc(11);
        tk.print();
    }
}
