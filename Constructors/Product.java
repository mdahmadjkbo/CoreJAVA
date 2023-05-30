class Product{
    int pid;
    String pname;
    double price;

    public Product(int pid, String pname, double price){
	this.pid=pid;
	this.pname=pname;
	this.price=price;}

    public void printProd(){
	System.out.println("***********************");
	System.out.println("Product ID: "+pid);
	System.out.println("Product Name: "+pname);
	System.out.println("Product Price: "+price);
	System.out.println("***********************");}

    public static void main(String[]args){
	Product p1=new Product(123, "Laptop", 35000);
	Product p2=new Product(428, "Mobile", 20000);
	Product p3=new Product(587, "Headphone", 300);
	Product p4=new Product(588, "Charger", 400);

	p1.printProd();
	p2.printProd();
	p3.printProd();
	p4.printProd();}
}