class SimDriver{
    public static void main(String[]args){
	Sim s1=new Sim(98756, "Jio", 100);
	Sim s2=new Sim(73973, "AirTel", 365);

	System.out.println(s2.getSP());
	System.out.println(s2.getBal());
	s2.setSP("Jio");
	System.out.println(s2.getSP());
	s2.setBal(499);
	System.out.println(s2.getBal());}
}