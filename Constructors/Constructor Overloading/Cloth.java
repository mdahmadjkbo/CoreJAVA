class Cloth{
    int size;
    String color;
    String brand;
    double price;

    public Cloth(int size){
	this.size=size;}

    public Cloth(int size, String color){
	this.size=size;
	this.color=color;}

    public Cloth(int size, String color, String brand){
	this.size=size;
	this.color=color;
	this.brand=brand;}

    public Cloth(int size, String color, String brand, double price){
	this.size=size;
	this.color=color;
	this.brand=brand;
	this.price=price;}

    public void printCloth(){
	System.out.println("***************************");
	System.out.println("Sizes: "+size);
	System.out.println("Brands: "+brand);
	System.out.println("Color: "+color);	
	System.out.println("Price: "+price);
	System.out.println("***************************");}

    public static void main(String[]args){
	Cloth c1=new Cloth(80, "Blue");
	Cloth c2=new Cloth(60, "White", "Cano", 90);
	Cloth c3=new Cloth(34);
	Cloth c4=new Cloth(58, "Black", "Levo");

	c1.printCloth();
	c2.printCloth();
	c3.printCloth();
	c4.printCloth();}
}