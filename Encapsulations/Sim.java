class Sim{
    private long simNo;
    private String sp;
    private double bal;

    public Sim(long simNo){
	this.simNo=simNo;}
    public long getSimNo(){
	return simNo;}
    public void setSimNo(long simNo){
	this.simNo=simNo;}

    public Sim(long simNo, String sp){
	this(simNo);
	this.sp=sp;}
    public String getSP(){
	return sp;}
    public void setSP(String sp){
	this.sp=sp;}

    public Sim(long simNo, String sp, double bal){
	this(simNo, sp);
	this.bal=bal;}
    public double getBal(){
	return bal;}
    public void setBal(double bal){
	this.bal=bal;}
}

