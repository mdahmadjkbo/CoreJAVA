class Ride{
    String board;
    String destin;
    int dist;
    double fare;

    public Ride(String board, String destin, int dist, double fare){
	this.board=board;
	this.destin=destin;
	this.dist=dist;
	this.fare=fare;}

    public void printRide(){
	System.out.println("***********************************");
	System.out.println("Starting point: "+board);
	System.out.println("Destination: "+destin);
	System.out.println("Distance :"+dist+" kms.");
	System.out.println("Fare: "+fare);
	System.out.println("***********************************");}

    public static void main(String[]args){
	Ride r1=new Ride("JSpiders", "Goa", 700, 450);
	Ride r2=new Ride("Patna", "Banglore", 1800, 1000);

	r1.printRide();
	r2.printRide();}
}