import java.util.*;
 
class reversestring
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String s;
        System.out.println("ENTER CHARACTER TO REVERSE:");
        s = sc.next();
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            stack.push(c);
        }   
        String temp="";
        while(!stack.isEmpty())
        {
            temp = temp + stack.pop();
        }
        System.out.println("Reversed string is : "+temp);  
    }
}
 