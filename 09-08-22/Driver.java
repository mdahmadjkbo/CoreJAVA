class Driver{
    public static void main(String[]args){
	Student s1=new.Student("Esow",143);
	/* for calling non-static method, a new object is created. */
	System.out.println(s1.name);
	//System.out.println(s1.id);
	System.out.println(s1.getId());
	s1.setId(66);
	System.out.println(s1.getId());//66(updated value)
    }
}
//javac Driver.java
//java Driver