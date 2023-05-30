class StudentDriver{
    public static void main(String[]args){
	Student s1=new Student("Eswar", 141);
	Student s2=new Student("Dillu", 56);

	System.out.println(s1.name);
	//System.out.println(s1.id);//CTE
	System.out.println(s1.getId());
	s1.setId(66);
	System.out.println(s1.getId());}
}