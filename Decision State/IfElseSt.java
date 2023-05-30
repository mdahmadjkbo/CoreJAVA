class IfElseSt
{
    public static void main(String[]args)
    {
	int i=2;
	float f=2;
	double d=2;

	if(d>f&&d>i)
	    System.out.println(d);
	else
	    System.out.println("no comparision among different Datatypes even values are same");
	    //no comparision among different Datatypes even values are same

	//can be compared after Typecastings?
	d=f;
	f=i;
	if(d==f&&d==i)
{
	    System.out.println(d);//2.0
	    System.out.println("can be compared after Typecastings");//can be compared after Typecastings
}
	else
	    System.out.println("no comparision among different Datatypes even values are same");
    }
}
//javac IfElseSt.java
//java IfElseSt