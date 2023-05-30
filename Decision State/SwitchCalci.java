class SwitchCalci
{
    public static void main(String[]args)
    {
	int a=6;
	int a=2;
	int options=1;
	int res;
	switch(options)
	{
	    case1:
		{res=a+b;
		System.out.println(res);}
	    break;
	    case2:
		{res=a-b;
		System.out.println(res);}
	    case3:
		{res=a*b;
		System.out.println(res);}
	    case4:
		{res=a/b;
		System.out.println(res);}
	    case5:
		{res=a%b;
		System.out.println(res);}
	    default:
		{res=a+b;
		System.out.println(res);}
	}
    }
}
//javac SwitchCalci.java
//java SwitchCalci