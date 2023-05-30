class PrePostSub
{
    public static void main(String[]args)
    {
	int a=21;
	int res=++a-a++;//////22-22
	System.out.println(a);///23
	System.out.println(res);//0
	System.out.println();
    }
}