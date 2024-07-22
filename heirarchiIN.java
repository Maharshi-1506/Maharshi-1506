public class heirarchiIN 
{
    public static void main(String args [])
    {
        dog d = new dog();
        cat c = new cat();
    }
}
class animal // superclass
{
    animal()
    {
        System.out.println("I AM ANIMAL");
    }
}
class dog extends animal //individual schild of super class
{
    dog()
    {
        System.out.println("ANIMAL THAT CAN BARK");
    }
}
class cat extends animal // another individual chlid of super class
{
    cat()
    {
        System.out.println("ANIMAL THAT CAN MEOW ");
    }
}
