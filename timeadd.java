import java.util.*;
class timeadd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int abc , def , ghi ;
        logic l = new logic();

        System.out.println("ENTER SECONDS FOR FIRST TIME:");
        abc=sc.nextInt();
        l.log(abc);
        
        System.out.println("ENTER SECONDS FOR SECOND TIME:");
        def=sc.nextInt();
        l.log(def);
        
        ghi = abc + def ;
        System.out.println("ADDITION OF TWO TIME :");
        l.log(ghi);
    }
}
class logic
{
    int log(int xyz)
    {
        int hour , minute , second ;
        hour = xyz/3600;
        minute = (xyz%3600) / 60;
        second = (xyz%60);
        System.out.println("TIME CONVERSION:"+hour+"    "+minute+"    "+second);
        return 0;
    }
}