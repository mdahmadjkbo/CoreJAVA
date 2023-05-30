class Fruit{
    String fname;
    String fcolor;
    int fprice;

    public void printDetails(){
	System.out.println("Fruit Name: "+fname);
	System.out.println("Fruit Color: "+fcolor);
	System.out.println("Fruit Price: "+fprice);}

    public static void main(String[]args){
	Fruit f1=new Fruit();
	f1.fname="Apple";
	f1.fcolor="Red";
	f1.fprice=120;

	Fruit f2=new Fruit();
	f2.fname="Apple";
	f2.fcolor="Green";
	f2.fprice=90;

	Fruit f3=new Fruit();
	f3.fname="Orange";
	f3.fcolor="Orange";
	f3.fprice=80;

	System.out.println("************************");
	f1.printDetails();
	System.out.println("************************");
	f2.printDetails();
	System.out.println("************************");
	f3.printDetails();
	System.out.println("************************");}
}