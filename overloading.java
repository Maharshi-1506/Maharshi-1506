import java.util.Scanner;
class overloading 
{
    public static void main(String args[])
    {
        overloading1 obj = new overloading1();
        Scanner sc = new Scanner(System.in);
        int x[]= new int[10];
        int y[]= new int[10];
        float v,w,s;
        System.out.println("ENTER FIRST FLOAT VALUE :");
        v=sc.nextFloat();
        System.out.println("ENTER FIRST FLOAT VALUE :");
        w=sc.nextFloat();
        s=obj.add(v,w);
        System.out.println("ADDITION OF FLOAT VALUE :"+s);

        
        System.out.println("ENTER NUMBER OF ELEMENT IN ARRAY");
        int n = sc.nextInt();
        System.out.println("ENTER VLAUE FOR FIRST ARRAY:");
        for(int i = 0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("ENTER VLAUE FOR SECOND ARRAY:");
        for(int i = 0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        
        System.out.println("ADDITION OF ARRAY");
        obj.add(x,y);
        System.out.println();
        String e;
        String f;
        String  g;
        System.out.println("ENTER FIRST STRING VALUE :");
        f=sc.next();
        System.out.println("ENTER SECOND STRING VALUE :");
        e=sc.next();
        g=obj.add(f,e);
        System.out.println("ADDITION OF STRING VALUE :"+g);
    }
}
class overloading1 extends overloading 
{
    float add(float a,float b)
    {
        float a1;
        a1 = a + b ;
        return a1;
    }
    void add(int a[],int b[])
    {
        int sum[] = new int[a.length]; 
        for (int i=0;i<a.length;i++)
        {
            sum[i]=a[i]+b[i];
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(sum[i]+"  ");
        }
    }
    String add(String a , String b)
    {
        String c;
        c = (a + b) ;
        return c;
    }
}
