class calci
{
    public static void main(String[]args)
    {
        add(6,5);
    }
    public static void add(int a, int b)
    {   
        //add(6,5);
        System.out.println(a+b);
        sub(4,5);
    }
    public static void sub(int a, int b)
    {
        System.out.println(a-b);
        mul(3,5);
    }
    public static void mul(int a, int b)
    {
        System.out.println(a*b);
        div(3,5);
    }
    public static void div(int a, int b)
    {
        System.out.println(a/b);
    }
}
//calci.java
//javac calci.java
//java calci