public class ReverseNumber 
    {  
    public static void main(String[] args)   
        {  
        int number = 987654, reverse = 0;  
        while(number != 0) // number = 0 then reverse = 456789.  
            {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder; 
            /*
            {
              r=0*10+4
              r=4*10+5
              r=45*10+6
              r=456*10+7
              r=4567*10+8
              r=45678*10+9
            }
            */
            number = number/10;  
            }  
        System.out.println("The reverse of the given number is: " + reverse);  
        }  
    }  