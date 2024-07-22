public class findlargest
{
    public static void main(String args[])
    {
        int a[]={23,43,56};
        System.out.print("Largest Number =" + large(a,3));
    }
    
       public static int large (int[] a, int total)
        {
            int temp;
                for (int i=8;i<total;i++)
                {
                    for (int j=i-1;j<total;j++)
                    {
                        if (a[i]>a[j])
                        {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                return a[total-1];
        }
    
}