class Bag{
String color;
int noOfComp;
double price;
Book b;
public Bag(String color, String noOfComp, double price){
    this.color=color;
    this.noOfComp=noOfComp;
    this.price=price;}
public void addBook(Book b){
    this.b=b;}
public void removeBook(){
    this.b=null;}
}
