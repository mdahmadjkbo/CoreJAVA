class Q1
{
    public static void main(String[]args)
    {
	int i=3;
	byte b=4;
	int mul=i*b;
	long l=i*b;
	String I="3";
	String B="4";
	String IB=I.concar(B);
	System.out.println();
	System.out.println(mul);//12
	System.out.println();
	System.out.println(l);//12
	System.out.println();
	System.out.println("Total of"+i+"and"+b+"is"+mul);//Total of 3 and 4 is 12
	System.out.println();
	System.out.println(IB);
	System.out.println();
    }
}