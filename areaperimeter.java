import java.util.Scanner;
class areaperimeter 
{
        public static void main (String args[])
        {
            int ap;
            boolean x = true ;
            Scanner sc = new Scanner(System.in);
            while(x == true)
            {
            System.out.println("THIS PROGRAM IS TO FIND ARE AND PERIMETER OF SHAPES .");
            System.out.println("ENTER 1 TO FIND AREA OF SQUARE .");
            System.out.println("ENTER 2 TO FIND PERIMETER OF SQUARE .");
            System.out.println("ENTER 3 TO FIND AREA OF RECTANGLE .");
            System.out.println("ENTER 4 TO FIND PERIMETER OF RECTANGLE .");
            System.out.println("ENTER 5 TO FIND AREA OF TRIANGLE .");
            System.out.println("ENTER 6 TO FIND PERIMETER OF TRIANGLE .");
            System.out.println("ENTER 7 TO FIND AREA OF CIRCLE .");
            System.out.println("ENTER 8 TO FIND PERIMETER OF CIRCLE .");
            System.out.println("ENTER 9 TO EXIT THE PROGRAM .");
            System.out.print("ENTER :");
            ap = sc.nextInt();

            switch(ap)
                {
                    case 1:
                        int a;
                        System.out.println("ENTER LENGTH OF SQARE SIDE:");
                        a = sc.nextInt();
                        System.out.println("AREA OF SQUARE : "+(a*a));
                    break;
                    case 2:
                        int b;
                        System.out.println("ENTER LENGTH OF SQUARE SIDE:");
                        b = sc.nextInt();
                        System.out.println("PERIMETER OF SQUARE : "+(4*b));
                    break;
                    case 3:
                        int l , w;
                        System.out.println("ENTER LENGTH :");
                        l = sc.nextInt();
                        System.out.println("ENTER WIDTH :");
                        w = sc.nextInt();
                        System.out.println("AREA OF RECTANGLE :"+(l*w));
                    break;
                    case 4:
                        int l1 , w1;
                        System.out.println("ENTER LENGTH :");
                        l1 = sc.nextInt();
                        System.out.println("ENTER WIDTH :");
                        w1 = sc.nextInt();
                    System.out.println("PERIMETER OF RECTANGLE :"+(2*(l1+w1)));
                    break;
                    case 5:
                        int bs , hi ;
                        System.out.println("ENTER BASE :");
                        bs = sc.nextInt();
                        System.out.println("ENTER HEIGHT :");
                        hi = sc.nextInt();
                        System.out.println("AREA OF TRIANGLE :"+((bs*hi)*1/2);
                    break;
                    case 6:
                        int s1,s2,s3;
                        System.out.println("ENTER LENGTH OF 1ST SIDE :");
                        s1 = sc.nextInt();
                        System.out.println("ENTER LENGTH OF 2ND SIDE :");
                        s2 = sc.nextInt();
                        System.out.println("ENTER LENGTH OF 3RD SIDE :");
                        s3 = sc.nextInt();
                        System.out.println("PERIMETER OF TRIANGLE :"+(s1+s2+s3));
                    break;
                    case 7:
                        int r1;
                        System.out.println("ENTER RADIUS :");
                        r1 = sc.nextInt();
                        System.out.println("AREA OF CIRCLE :"+(3.14*r1*r1));
                    break;
                    case 8:
                        int r2;
                        System.out.println("ENTER RADIUS :");
                        r2 = sc.nextInt();
                        System.out.println("PERIMETER OF CIRCLE :"+(2*3.14*r2));
                    break;
                    case 9:
                        x = false ;
                    break;
                }
            }   
        }
}
