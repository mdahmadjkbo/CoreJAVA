class Calci
{
    public static void main(String[]args)
    {
    add(6,5);
    }
    public static void add(int a, int b)
    {
    System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
    sub(4,5);
    }
    public static void sub(int a, int b)
    {
    System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
    div(4,5);
    }
    public static void div(int a, int b)
    {
    System.out.println("Division of "+a+" and "+b+" is "+(a/b));
    mul(4,5);
    }
    public static void mul(int a, int b)
    {
    System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
    //???sub(4,5);
    }
}
//javac Calci.java
//java Calci
//----------------------------------------------------------------------
//Addition of 6 and 5 is 11
//Subtraction of 4 and 5 is -1
//Division of 4 and 5 is 0
//Multiplication of 4 and 5 is 20
