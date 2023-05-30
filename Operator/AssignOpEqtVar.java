class AssignOpEqtVar
{
    public static void main(String[]args)
    {
	int i=1;
	int a=2;
	i-=a+=1;
	System.out.println(i);//-2
	System.out.println(a);//3
    }
}