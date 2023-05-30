class SmartWatch{
    String brand;
    String color;
    double price;

    public static void main(String[]args){
	SmartWatch s1=new SmartWatch();
	s1.brand="YBzz";
	s1.color="Blue";
	s1.price=230;
	System.out.println(s1.brand);
	System.out.println(s1.color);
	System.out.println(s1.price);

	SmartWatch s2=new SmartWatch();
	s2.brand="Bushy";
	s2.color="Black";
	s2.price=500;
	System.out.println(s2.brand);
	System.out.println(s2.color);
	System.out.println(s2.price);

	SmartWatch s3=new SmartWatch();
	s3.brand="Bum";
	s3.color="Red";
	s3.price=200;
	System.out.println(s3.brand);
	System.out.println(s3.color);
	System.out.println(s3.price);}
}