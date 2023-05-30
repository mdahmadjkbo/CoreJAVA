class StaticMembers2{
    static String a;

    public static void main(String[]args){
	System.out.println(a);
	System.out.println(StaticMembers2.b);
	a="A";
	b=10;
	System.out.println(b);
	System.out.println(a);}

    static int b;
}