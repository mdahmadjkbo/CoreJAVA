class GreatestOf3
{
    public static int greatestofthree(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }
    public static void main(String[]args)
    {
        System.out.println(greatestofthree(2,6,4));
    }
}
//javac GreatestOf3.java
//java GreatestOf3