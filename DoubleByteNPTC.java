class DoubleByteNPTC//Narrowing
{
    public static void main(String[]args)
    {
	char a='c';
	byte c=(byte)a;
	double d=2999403.1234567;
	byte e=(byte)d;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println();
	
	
    }
}