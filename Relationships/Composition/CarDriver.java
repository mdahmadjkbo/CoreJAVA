class CarDriver{
    public static void main(String[]args){
	Car c=new Car("Suzu", "Black", new Engine(800));
	Car ca=new Car("Rolls", "Black", new Engine(1000));

	System.out.println(c.brand);
	System.out.println(c.color);
	System.out.println(c.e.cc);
	System.out.println(ca.e.cc);}
}