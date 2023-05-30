class WiFiLaptopDriver{
    public static void main(String[]args){
	Laptop l=new Laptop("Dell", 16, "Core i7");
	Laptop la=new Laptop("HP", 4, "Core i3");

	l.connectWiFi(new WiFi(75));
	la.connectWiFi(new WiFi(30));

	System.out.println(l.brand);
	System.out.println(l.ram);
	System.out.println(l.proc);

	System.out.println(la.brand);
	System.out.println(la.ram);
	System.out.println(la.proc);
	
	System.out.println(l.w.speed);
	System.out.println(la.w.speed);}
}