class CreateMethod
{
    public static void sheela()
    {
        System.out.println("Sheela start");
        System.out.println("Sheela end");
    }
    public static void main(String[]args)
    { 
        System.out.println("Main start");
        sheela();
        System.out.println("Main end");
    }
}
//javac CreateMethod.java
//java CreateMethod
//-------------------------------------------
//Main start
//Sheela start
//Sheela end
//Main end