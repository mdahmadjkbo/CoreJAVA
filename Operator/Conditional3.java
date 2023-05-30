class Conditional3
{
     public static void main(String[]args)
     {
	int a=5;
	int b=7;
	int c=2;
	int greatest=a>b?(a>b?a:b):(b>c?b:c);
	double dgreatest=greatest;
	char ch=(char)dgreatest;
	String s="dgreatest";
	System.out.println(greatest);//7
	System.out.println(dgreatest);//7.0
	System.out.println(ch);//Nothing?!
	System.out.println(s);//dgreatest
     }
}