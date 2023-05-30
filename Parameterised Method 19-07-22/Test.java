class Test
{
    public static void main(String[]args)
    {
        //System.out.println("The greatest No. is");
        gretest(6, 21, 43);
    }
    public static void greatest(int a, int b, int c)
    if(a>b && a>c)
    {
        System.out.println(a);
    }
    else if(b>c)
    {
        System.out.println(b);
    }
    else
    {
        System.out.println(c);
    }        
}
//javac Test.java
//java Test
    