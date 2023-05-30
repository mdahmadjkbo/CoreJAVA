class Book{
    String title;
    String author;
    String publish;
    int pages;
    double price;

    public Book(String title){
	this.title=title;}

    public Book(String title, String author){
	this(title);
	this.author=author;}

    public Book(String title, String author, String publish){
	this(title, author);
	this.publish=publish;}

    public Book(String title, String author, String publish, int pages){
	this(title, author, publish);
	this.pages=pages;}

    public Book(String title, String author, String publish, int pages, double price){
	this(title, author, publish, pages);
	this.price=price;}

    public static void main(String[]args){
	Book b1=new Book("Fig", "Dizz");
	Book b2=new Book("Fizz", "Quiz", "Ghost", 250, 250);

	System.out.println("Book Title: "+b1.title+" & Book Author: "+b1.author);
	System.out.println("Price: "+b2.price);}
}