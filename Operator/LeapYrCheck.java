class LeapYrCheck
{
    public static void main(String[]args)
    {
	int i=2022;
	if((i%4==0&&i%100!=0)||(i%400==0))
	    {
		System.out.println();
		System.out.println(i+" is a Leap Year.");
		System.out.println();
	    }
	else
	    {
		System.out.println();
		System.out.println(i+" is not a Leap Year.");
		System.out.println();
	    }
    }
}