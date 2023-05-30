class Application{
    String name;
    long con;
    long alcon;

    public Application(String name){
	this.name=name;}

    public Application(String name, long con){
	this.name=name;
	this.con=con;}

    public Application(String name, long con, long alcon){
	this.name=name;
	this.con=con;
	this.alcon=alcon;}

    public static void main(String[]args){
	Application sheela=new Application("Sheela");
	Application laila=new Application("Laila", 2598565);
	Application mala=new Application("Mala", 23355665565656l, 85489845);
	Application dhela=new Application("Dhela", 25985654);

	System.out.println("Laila's Contact Number: "+laila.con);
	System.out.println("Mala's Contact Number: "+mala.con+" & Alternate Contact Number: "+mala.alcon);}
}