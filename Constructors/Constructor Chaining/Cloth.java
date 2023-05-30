class Cloth{
    int size;
    String color;
    String brand;
    double price;

    public Cloth(int size){
	this.size=size;}

    public Cloth(int size, String color){
	this(size);
	this.color=color;}

    public Cloth(int size, String color, String brand){
	this(size, color);
	this.brand=brand;}

    public Cloth(int size, String color, String brand, double price){
	this(size, color, brand);
	this.price=price;}

    public static void main(String[]args){
	Cloth c1=new Cloth(30, "Blue");
	Cloth c2=new Cloth(40);
	Cloth c3=new Cloth(30, "White", "Vue", 80);

	System.out.println("Size: "+c1.size);
	System.out.println("Color: "+c3.color);}
}