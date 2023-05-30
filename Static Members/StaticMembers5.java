class StaticMembers5{
    static String name="Sheela";

    public static void main(String[]args){
	//System.out.println(name);//Laila
	System.out.println("Main Method");
	System.out.println(name);}//Laila

    static{
	System.out.println(name);//Sheela
	name="Laila";}

    static{
	System.out.println("Static Block");}
}