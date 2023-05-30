class Sim{
    long no;
    String servProv;
    Sim(long no, String servProv){
	this.no=no;
	this.servProv=servProv;}
    @Override
    public String toString(){
    return servProv;}
}