class StaticVar
{
    static String name;
    //Static Variable named as "name"
    public static void main(String[]args)
    {
	System.out.println(name);//null(default value)
	name="Static Variable is Modified now. So static variable is also called as Modifire";
	//priority goes to Local object compared with static variable
	System.out.println(name);//Static Variable is Modified now. So static variable is also called as Modifire
	System.out.println(StaticVar.name);//null
	//static variable can be called by using class name also. But it's not mandatory to write class name to call Static variable if the Static variable is inside 	the same class.
	//There're 2 class members 1st. name & 2nd. main
    }
}
//javac StaticVar.java
//java StaticVar
//-------------------------------------------------------------------------------------------------------------------------
//null
//Static Variable is Modified now. So static variable is also called as Modifire
//null