class CallDiffClasses
{
    public static void main(String[]args)
    {
	System.out.println(StaticVar.name);//null
	System.out.println(StaticMembers.name);//null
    }
}
//javac CallDiffClasses.java
//java CallDiffClasses
//Different Classes can be called in another class also by- Class_Name.Static_Variable_Name