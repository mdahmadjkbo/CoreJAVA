class StaticMembers4{
    {System.out.println("Non Static Block");
    System.out.println("Non Static Block");}

    public static void main(String[]args){
	System.out.println("Main Method");
	System.out.println(i);
	//System.out.println(b);
	System.out.println(c);
    }

    static{
	//System.out.println(b);
	//System.out.println(c);
	//System.out.println(i);
	System.out.println(StaticMembers4.i);
	int i=10;
	System.out.println(i);
	System.out.println("Static Block");}

    int b;
	{System.out.println(b);}

    static int c;
    static int i;}
	