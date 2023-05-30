class Ticket{
    int tcktNo;
    String moviName;
    double price;

    public Ticket(int tcktNo, String moviName, double price){
	this.tcktNo=tcktNo;
	this.moviName=moviName;
	this.price=price;}

    public void printTckt(){
	System.out.println("******************************");
	System.out.println("Ticket Number: "+tcktNo);
	System.out.println("Movie Name: "+moviName);
	System.out.println("Ticket Price: "+price);
	System.out.println("******************************");}

    public static void main(String[]args){
	Ticket t1=new Ticket(7, "Char", 250);
	Ticket t2=new Ticket(2, "VR", 500);
	Ticket t3=new Ticket(9, "Vik", 700);

	t1.printTckt();
	t2.printTckt();
	t3.printTckt();}
}