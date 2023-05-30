class Account{
    String name;
    long accNo;
    private double bal;
    private int pwd;

    public Account(String name, long accNo, double bal, int pwd){
	this.name=name;
	this.accNo=accNo;
	this.bal=bal;
	this.pwd=pwd;}

    public double getBal(){
	return bal;}


    public void setBal(double bal){
	this.bal=bal;}

    public void setPwd(int pwd){
	this.pwd=pwd;}
}