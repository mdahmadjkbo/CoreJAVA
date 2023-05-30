Class Return
{
    public static int main(String[]args)
    {
	pavan();
    }
    public static int pavan()
    {
	System.out.println(keshava(5,6));
	int res=keshava(7,8);
	System.out.println(res);
    }
    public static int keshava(int a, int b)
    {
	//System.out.println("Hello keshava");
	return a+b;
    }
}
//javac Return.java
//java Return


    