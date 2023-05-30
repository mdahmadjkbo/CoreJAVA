class Bag{
    String color;
    int compart;
    double price;
    Book bo;

    public Bag(String color, int compart, double price){
	this.color=color;
	this.compart=compart;
	this.price=price;}

    public void addBook(Book bo){
	this.bo=bo;}

    public void removeBook(){
	this.bo=null;}
}