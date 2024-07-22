import java.util.*;

class calculator1
{
    
        public static void main(String args[]) 
        {
            int a,b;
            int calc;
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER FIRST NUMBER ");
            a = sc.nextInt();
            System.out.print("ENTER SECOND NUMBER ");
            b = sc.nextInt();
            System.out.println("ENTER 1 for addition ");
            System.out.println("ENTER 2 for subtraction ");
            System.out.println("ENTER 3 for multiplication ");
            System.out.println("ENTER 4 for division ");
            System.out.print("ENTER OPERATOR ");
            calc = sc.nextInt();
     
            switch (calc) 
            {
                    case 1:
                    System.out.println("A+B=" + (a+b));
                    break;
                    case 2:
                    System.out.println("A-B=" + (a-b));
                    break;
                    case 3:
                    System.out.println("A*B=" + (a*b));
                    break;
                    case 4:
                    System.out.println("A/B=" + (a/b));
                    break;
                default:
                    break;
            }
        }
    
}

