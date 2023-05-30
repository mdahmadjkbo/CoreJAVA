class Laptop{
    private String brand;
    private int ram;
    private int storage;
    private String os;

    public Laptop(String brand){
	this.brand=brand;}
    public String getBrand(){
	return brand;}
    public void setBrand(String brand){
	this.brand=brand;}

    public Laptop(String brand, int ram){
	this(brand);
	this.ram=ram;}
    public int getRam(){
	return ram;}
    public void setRam(int ram){
	this.ram=ram;}

    public Laptop(String brand, int ram, int storage){
	this(brand, ram);
	this.storage=storage;}
    public int getStorage(){
	return storage;}
    public void setStorage(int storage){
	this.storage=storage;}

    public Laptop(String brand, int ram, int storage, String os){
	this(brand, ram, storage);
	this.os=os;}
    public String getOS(){
	return os;}
}