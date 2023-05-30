class WaterBottle{
    int qty;
    String colr;

    public WaterBottle(int qty, String colr){
	this.qty=qty;
	this.colr=colr;}

    public void printB(){
	System.out.println(qty);
	System.out.println(colr);}

    public static void main(String[]args){
	WaterBottle w1=new WaterBottle(1, "Blue");
	WaterBottle w2=new WaterBottle(2, "Black");
	WaterBottle w3=new WaterBottle(3, "White");
	w1.printB();
	w2.printB();
	w3.printB();}
}