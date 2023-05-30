class StaticMembers
{
    static String name;
    public static void main(String[]args)
    {
	System.out.println(name);//null
	pushpa();//Sheela@
		//null#
	System.out.println(name);//null
    }
    public static void pushpa()
    {
	String name="Sheela";
	System.out.println(name);//@
	System.out.println(StaticMembers.name);//#
	m1();//null
		//null*
    }
    public static void m1()
    {
	System.out.println(name);
	System.out.println(StaticMembers.name);//*
    }
}
//javac StaticMembers.java
//java StaticMembers
//There 4 Class Members(Variables, Methods & Initializers)-
//1. name, 2. main, 3. pushpa & 4. m1
//---------------------------------------------------------
//null
//Sheela
//null
//null
//null
//null
