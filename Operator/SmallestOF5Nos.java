class SmallestOF5Nos
{
    public static void main(String[]args)
    {
	int a=5;
	int b=4;
	int c=3;
	int d=2;
	int e=1;
	
	if(a<b&&a<c&&a<d&&a<e)
	{
	    System.out.println(a);
	}
	else if(b<c&&b<d&&b<e)
	{
	    System.out.println(b);
	}
	else if(c<d&&c<e)
	{
	    System.out.println(c);
	}
	else if(d<e)
	{
	    System.out.println(d);
	}
	else	
	{
	    System.out.println(e);
	}
    }
}