class Employee{
    String ename;
    int eid;

    public void printEmp(){
	System.out.println(ename);
	System.out.println(eid);}

    public static void main(String[]args){
	Employee e1=new Employee();
	e1.ename="Anit";
	e1.eid=2346;

	Employee e2=new Employee();
	e2.ename="Anti";
	e2.eid=4632;

	System.out.println("***********");
	e1.printEmp();
	System.out.println("***********");
	e2.printEmp();
	System.out.println("***********");}
}
