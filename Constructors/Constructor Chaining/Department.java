class Department{
    String dname;
    int dno;
    String hod;
    String principal;

    public Department(String dname){
	this.dname=dname;}

    public Department(String dname, int dno){
	this(dname);
	this.dno=dno;}

    public Department(String dname, int dno, String hod){
	this(dname, dno);
	this.hod=hod;}

    public Department(String dname, int dno, String hod, String principal){
	this(dname, dno, hod);
	this.principal=principal;}

    public void printDept(){
	System.out.println("Department Name: "+dname);
	System.out.println("Department Number: "+dname);
	System.out.println("Department HOD: "+hod);
	System.out.println("Principal: "+principal);}

    public static void main(String[]args){
	Department d1=new Department("Civil");
	d1.printDept();
	Department d2=new Department("Civil", 01);
	Department d3=new Department("Civil", 01, "Prasad");

	d2.printDept();}
}