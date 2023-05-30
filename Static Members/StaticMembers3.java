class StaticMembers3{

    public static void main(String[]args){
	System.out.println(a);
	System.out.println(b);
	System.out.println(StaticMembers3.a);
	a="B";
	System.out.println(a);
	System.out.println(StaticMembers2.a);
	//System.out.println(StaticMembers2.main("String"));
	System.out.println(a);
	m1();}

    static int b=10;

    static void m1(){
	a="C";
	System.out.println(a);}

    static String a;//static varible executes 1st.
}