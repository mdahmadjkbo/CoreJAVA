class LaptopDriver{
    public static void main(String[]args){
	Laptop l=new Laptop("HP", 16, 500, "Window");
	//System.out.println(l.brand);
	//System.out.println(l.ram);
	//System.out.println(l.storage);
	//System.out.println(l.os);
	System.out.println(l.getBrand());
	System.out.println(l.getRam());
	System.out.println(l.getStorage());
	System.out.println(l.getOS());}
}