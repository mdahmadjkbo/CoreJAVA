class EarphoneMobileDriver{
    public static void main(String[]args){
	Mobile m1=new Mobile("Redmi", 16);
	Mobile m2=new Mobile("Oppo", 4);
	m1.insertEarphone(new Earphone("Boat"));
	m2.insertEarphone(new Earphone("1+"));
	System.out.println(m1.ram);
	System.out.println(m1.e.brand);
	System.out.println(m1.brand);
	System.out.println(m2.ram);}
}