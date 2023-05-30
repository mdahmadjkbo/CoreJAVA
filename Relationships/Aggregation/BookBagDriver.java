class BookBagDriver{
    public static void main(String[]args){
	Bag ba=new Bag("Blue", 2, 250);
	Bag bs=new Bag("Black", 3, 275);

	ba.addBook(new Book("XYZ", "ABC", 80));
	bs.addBook(new Book("VPN", "CBZ", 70));
	ba.removeBook();

	System.out.println(ba.color);
	System.out.println(ba.compart);
	System.out.println(ba.price);

	System.out.println(bs.color);
	System.out.println(bs.compart);
	System.out.println(bs.price);

	System.out.println(ba.bo.title);
	System.out.println(ba.bo.price);
	System.out.println(ba.bo.author);

	System.out.println(bs.bo.title);
	System.out.println(bs.bo.price);
	System.out.println(bs.bo.author);}
}