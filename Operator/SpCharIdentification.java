class SpCharIdentification
{
    public static void main(String[]args)
    {
	char c='2';

	if(c>='A'&&c<='z'||c>='a'&&c<='z')
	{
	    System.out.println("Alpha");
	}
	else if(c>='0' && c<='9')
	{
	    System.out.println("No.");
	}
	else
	{
	    System.out.println("Sp. Char.");
	}
    }
}	