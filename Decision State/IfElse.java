class IfElse
{
    public static void main(String[]args)
    {
	{
	int a=5;
	int b=6;
	if(a>b)
	    System.out.println(a);
	else
	    System.out.println(b);//6
	//{
	if(a%2==0)
	    System.out.println(a);
	else
	//{
	    System.out.println(b);//6
	    System.out.println(a);//5
	//}
	//}

	//Divisible by 2&3
	if(b%3==0 && b%2==0)
	    System.out.println("T");//T
	else
	    System.out.println("F");

	//a&b Divisible by 2&3
	if((b%3==0 && b%2==0)&&(b%3==0 && b%2==0)&&(b%3==0 && a%2==0)&&(a%3==0 && a%2==0))
	    System.out.println("T");
	else
	    System.out.println("F");//F
	
	//a||b Divisible by 2&3
	if(((b%3==0 && b%2==0)&&(b%3==0 && b%2==0))||(b%3==0 && a%2==0)||(a%3==0 && a%2==0))
	    System.out.println("T");//T
	else
	    System.out.println("F");

	//b&&b Divisible by 2&3
	if(((b%3==0 && b%2==0)&&(b%3==0 && b%2==0)))
	    System.out.println("T");//T
	else
	    System.out.println("F");
	}
    }
}
//javac IfElse.java
//java IfElse
//---------------------------------------
//6
//6
//5
//T
//F
//T
//T