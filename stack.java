import java.util.*;


public class stack 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ;
         int arr[];
         int top;
        int capacity;
        
        System.out.println("ENTER THE NUMBER OF STACK ELEMENT");
        n=sc.nextInt();  
         st(n);
        System.out.println(" ENTER 1 TO PUSH DATA ENTER 2 TO POP DATA ENTER 3 TO PRINT DATA ENTER 4 TO EXIT");
        int sw = sc.nextInt();
        switch(sw)
        {
            case 1:
                System.out.println("ENTER ELEMENT TO INSERT IN STACK :");
                int a[] = new int[10];
            for (int i=0;i <= n ;i++){
                a[i] = sc.nextInt();
                push(a[i]);
            }
                break;
            case 2:
                System.out.println("ELEMNET OF STACK IS DELETING TO CHECK ENTER 3 ");
                pop();
                break;
            case 3 :
                System.out.println("ELEMNET OF STACK ARE :");
                printstack();
                break;
            case 4 :
                System.exit(1);
        }
        


    void st(int size)
    {
        arr = new int[size]; 
        capacity = size;
        top = -1;
    }
    static void push(int a)
    {
        if (isFull())
        {
            System.err.println("STACK OVERFLOW");
            System.exit(1);
        }
        
        System.out.println("PUSHING :"+ a);
        arr[top++] = a[i] ;
        
    }
    private static boolean isFull() 
    {
        
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }
    static int pop ()
    {
        if (isEmpty())
        {
            System.err.println("STACK UNDERFLOW");
            System.exit(1);
        }
        return arr[top--];
    }
    private static boolean isEmpty() 
    {
        
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    static void printstack()
    {
        for (int i=0;i<=top;i++)
        {
            System.out.println(arr[i]+"    ");
        }
    }
    }

    private static void printstack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printstack'");
    }

    private static void pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    private static void push(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
}
