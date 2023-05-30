class Songs{
    String sname;
    String singer;
    String stype;

    public void setSongs(String sname, String singer, String stype){
	this.sname=sname;
	this.singer=singer;
	this.stype=stype;}

    public void printSongs(){
	System.out.println("Song Name: "+sname);
	System.out.println("Singer Name: "+singer);
	System.out.println("Song Type: "+stype);}

    public static void main(String[]args){
	Songs s1=new Songs();
	s1.setSongs("No Love", "Subh", "Mass");
	Songs s2=new Songs();
	s2.setSongs("Ra Ra", "Mangli", "Pop");

	System.out.println("*******************************");
	s1.printSongs();
	System.out.println("*******************************");
	s2.printSongs();
	System.out.println("*******************************");}
}