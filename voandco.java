import java.util.*;
public class voandco 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int ccount=0,vcount=0;
        String str;
    
        System.out.print("ENTER STRING :");
        str = sc.nextLine();

        for(int i = 0 ;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vcount++;
            }
            else if (str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                ccount++;
            }
        }

        System.out.println("NUMBER OF VOWELS IN STRING : "+vcount);
        System.out.println("NUMBER OF CONSONANTS IN STRING : "+ccount);
    }
}
