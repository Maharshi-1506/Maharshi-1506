import java.util.*;
class atm 
{
    public static void main (String args[])
    {
        int balance=200000,withdraw,deposite,num;
        Scanner sc = new Scanner (System.in);
        while(true)
        {
            System.out.println("WELCOME TO ATM MACHINE:");
            System.out.println("1.TO WITHDRAW");
            System.out.println("2.TO DEPOSITE");
            System.out.println("3.TO CHECK BALANCE");
            System.out.println("4.TO EXIT");
            System.out.print("ENTER YOUR TASK     ");
            num = sc.nextInt();
            switch (num) 
            {
                case 1:
                    
                        System.out.println("ENTER AMOUNT TO WITHDRAW:");
                        withdraw = sc.nextInt();
                        if(balance>=withdraw)
                        {
                            balance = balance - withdraw ;
                            System.out.println("BALANCE AMOUNT IS   " + balance);
                            System.out.println("COLLECT YOUR MONEY"); 
                            System.out.println("*****");
                        }
                        else 
                        {
                            System.out.println("CHECK WITHDRAW AMOUT PLEASE !!!");
                            System.out.println(" ");
                        }
                    break;
                case 2:
                        System.out.println("ENTER AMOUNT TO DEPOSITE");
                        deposite = sc.nextInt();
                        balance = balance + deposite ;
                        System.out.println("BALANCE AMOUNT IS   " + balance);
                        System.out.println("MONEY HAS BEEN DEPOSITED SUCCESSFULLY");
                        System.out.println("***** ");                
                    break;
                case 3:
                        System.out.println("BLANACE AMOUNT IS   " + balance); 
                        System.out.println("*****"); 
                    break;
                case 4:
                        System.exit(0);
                        System.out.println("*****");
                    break;
                default:
                        System.out.println("*****");
                        System.out.println("ENTER VALID TASK !!!");
                        System.out.println("*****");
                        System.out.println("*****");
                    break;
            }
        }
    }  
}
