class IncDecExp
{
    public static void main(String[]args)
    {
	int a=7;
	int b=68;
	int res= ++b + a++ - ++a + ++b;
      //int res=  ++b + a++  -  ++a  +  ++b;
	        //1+68 + 1+7   - 8   +  1+69
		// 67  +  8    - 8    +  70
		//137
	System.out.println(a);//9
	System.out.println(b);//70
	System.out.println(res);//137
    }
}