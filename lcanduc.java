import java.util.*;
public class lcanduc 
{
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("ENTER STRING : ");
        str = sc.nextLine();
        StringBuffer newStr=new StringBuffer(str);
        System.out.println();
        
        for (int i = 0 ; i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i))) 
            {      
                 newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }    
            
            else if(Character.isUpperCase(str.charAt(i))) 
            {    
                 newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    
        }   
        System.out.println("NEW COVERTED STRING IS : "+ newStr); 
            
    }
}


