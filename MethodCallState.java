//15-07-22
class MethodCallState
{
    public static void go()
    {
	System.out.println("for");
	System.out.println("float");
	world();
	System.out.println("This is");
	System.out.println("world method.");
    }
    public static void main(String[]args)
    {
	System.out.println('g');
	System.out.println("Hello World");
	world();
	System.out.println(1.2345);
	go();
	System.out.println(12345);
	System.out.println("Go");
    }
    public static void world()
    {
	System.out.println("This is");
	sok();
	System.out.println("world method.");
    }
    static void sok()
    {
    }
}
//-------------------------------------------
//g
//Hello World
//This is
//world method.
//1.2345
//for
//float
//This is
//world method.
//This is
//world method.
//12345
//Go
