class Laptop{
    String brand;
    int ram;
    String proc;
    WiFi w;

    public Laptop(String brand, int ram, String proc){
	this.brand=brand;
	this.ram=ram;
	this.proc=proc;}

    public void connectWiFi(WiFi w){
	this.w=w;}

    public void disconnectWiFi(){
	this.w=null;}
}