class Cloth
{
    int size;
    String color;
    String brand;
    double price;
    public Cloth(int size)
    {
	this.size=size;
    }
    public Cloth(int size, String color)
    {
	this.size=size;
	this.color=color;
    }
    public Cloth(int size, String color, String brand)
    {
	this.size=size;
	this.color=color;
	this.brand=brand;
    }
    public Cloth(int size, String color, String brand, double price)
    {
	this.size=size;
	this.color=color;
	this.brand=brand;
	this.price=price;
    }
    public void details()
    {
	System.out.println("Size: "+size);
	System.out.println("Color: "+color);
	System.out.println("Brand: "+brand);
	System.out.println("Price: "+price);
	System.out.println("-------------------------------");
    }
    public static void main(String[]args)
    {
	Cloth s=new Cloth(32);
	Cloth c=new Cloth(32, "Black");
	Cloth b=new Cloth(32, "Black", "Shy");
	Cloth p=new Cloth(32, "Black", "Shy", 599);
	System.out.println(s.size);
	System.out.println(b.brand);
	System.out.println(p.size);
	System.out.println(p.price);
	//details();===============Callin details Method???
    }
}
//javac Cloth.java
//java Cloth