class AssignAvlBal
{
    public static void main(String[]args)
    {
	int avlBal=10000;//int- (keyword-lower case)Primitive Type Data(or PT literal), avlBal- Variable name(Primitive type, 1st word starts with lower case whereas 														      2nd word starts with Upper case), 10000- int Type Data.
	System.out.println(avlBal);//10000(Printed)
	avlBal-=2000;//avlBal=avlBal-2000(Stored 1st)
	System.out.println(avlBal);//8000(then Printed)
	avlBal+=100;//avlBal=avlBal+100=8100
	System.out.println(avlBal);//8100
	System.out.println("10% of avlBal is"+avlBal/10);//810(only Printed)
	System.out.println("10% of avlBal is"+(avlBal/10));//810(Open parentheses used for the expression, same output)
	int FB=0;//FB- A new int type variable is Declared(created) for friend's balance followed by variable name "FB" then Initialized(Literal/Data/value assigned=0)
	avlBal-=4000;//avlBal-4000=8100-4000=4100
	FB+=4000;//4000
	System.out.println("now Friend's Balance is"+FB);//4000
	System.out.println("now Avilable balance is"+avlBal);//4100
    }
}

//30/06/22