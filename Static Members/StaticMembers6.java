class StaticMembers6{
    static String name="Sheela";

    public static void main(String[]args){
	System.out.println(name);//Mala
	System.out.println("Main Method");//Main Method
	System.out.println(name);}//Mala

    static{
	System.out.println(name);//Sheela
	name="Laila";}

    static{
	m1();}

    static void m1(){
	name="Mala";}
}
	